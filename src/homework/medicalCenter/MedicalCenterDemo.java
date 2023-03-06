package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.PersonStorage;
import homework.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorByIndex();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TO_DAYS_PATIENT:
                    personStorage.printToDaysPatients();
                    break;
                default:
                    System.out.println("Wrong command, try again!");
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }
    }


    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input Patient id,name,surname,phone,registerDateTime(26-02-2023 14:00)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhoneNumber(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("patient registered!");
                } else {
                    System.out.println("doctor is unavailable in that time,please choose another time");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect date time format, please try again!");
            }
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }
    }

    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        Profession[] value = Profession.values();
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input name, surname, phone,email, profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            try {
                Profession profession = Profession.valueOf(doctorData[4]);
                doctorById.setId(doctorId);
                doctorById.setName(doctorData[0]);
                doctorById.setSurname(doctorData[1]);
                doctorById.setPhoneNumber(doctorData[2]);
                doctorById.setEmail(doctorData[3]);
                doctorById.setProfession(profession);
                System.out.println("Doctor changed");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("wrong profession");
            }
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }
    }

    private static void deleteDoctorByIndex() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.printDoctorByProfession(Profession.valueOf(profession));
    }

    private static void addDoctor() {
        System.out.println("Please input Doctor id, name, surname,phone,email,profession");
        Profession[] values = Profession.values();
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        try {
            String doctorId = doctorData[0];
            String professionStr = doctorData[5];
            Profession profession = Profession.valueOf(doctorData[5]);
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById == null) {
                Doctor doctor = new Doctor();
                doctor.setId(doctorId);
                doctor.setName(doctorData[1]);
                doctor.setSurname(doctorData[2]);
                doctor.setPhoneNumber(doctorData[3]);
                doctor.setEmail(doctorData[4]);
                doctor.setProfession(Profession.valueOf(professionStr));
                personStorage.add(doctor);
                System.out.println("Doctor added");
            } else {
                System.out.println("doctor with " + doctorId + " already exists!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("wrong profession");
        }
    }
}