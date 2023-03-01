package homework.medicalCenter;

public interface Commands {

    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_DATA_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_TO_DAYS_PATIENT = "7";

    static void printCommands() {
        System.out.println(EXIT + " for exit");
        System.out.println(ADD_DOCTOR + " add doctor");
        System.out.println(SEARCH_DOCTOR_BY_PROFESSION + " search doctor by profession");
        System.out.println(DELETE_DOCTOR_BY_ID + " delete doctor by id");
        System.out.println(CHANGE_DOCTOR_DATA_BY_ID + " change doctor date by id");
        System.out.println(ADD_PATIENT + " add patient");
        System.out.println(PRINT_ALL_PATIENTS_BY_DOCTOR + " print patients by doctor");
        System.out.println(PRINT_TO_DAYS_PATIENT + " print patient by date");
    }
}