package homework.employee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {


        boolean isRun = true;
        while (isRun) {
            printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompanyName(companyName);
                    break;
                case "5":
                    searchEmployeeBySalaryRange();
                    break;
                case "6":
                    changeEmployeePositionById();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inactivateEmployeeById();
                    break;
                case "9":
                    activateEmployeeById();
                    break;
                case "10":
                    employeeStorage.printByRegisterDate();
                    break;
                default:
                    System.out.println("Wrong command, try again!");
            }
        }
    }
    private static void activateEmployeeById() {
        employeeStorage.printByStatus(false);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null && !employee.isActive()) {
            employee.setActive(true);
            System.out.println("Employee Inactivate!");
        } else {
            System.out.println("Employee does not exists,or employee already active, please try again");
        }
    }

    private static void inactivateEmployeeById() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            employee.setActive(false);
            System.out.println("Employee Inactivate!");
        } else {
            System.out.println("Employee does not exists, please try again");
        }
    }


    private static void changeEmployeePositionById() {
        employeeStorage.print();
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            System.out.println("Please input new position");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position changed!");
        } else {
            System.out.println("Employee does not exists, please try again");
        }
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Please input min,max");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (minSalary > maxSalary) {
            System.out.println("min salary should be less then max salary");
        } else {
            employeeStorage.searchEmployeeBySalaryRange(minSalary, maxSalary);
        }
    }

    private static void printCommand() {
        System.out.println("0 for exit");
        System.out.println("1 add employee");
        System.out.println("2 print all employee");
        System.out.println("3 search employee by employee ID");
        System.out.println("4 search employee by company name");
        System.out.println("5 for search employee by salary range");
        System.out.println("6 for change employee position by id");
        System.out.println("7 for print only active employees");
        System.out.println("8 for inactive employee by id ");
        System.out.println("9 for activate employee by id");
        System.out.println("10 print date of employee registration");
    }

    private static void getEmployeeById() {
        System.out.println("Please input employee Id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee with" + employeeId + " does not exists");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() {
        System.out.println("Please input name,surname,employeeId,salary,company,position,active,date of Birthday");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            Employee newEmployee = new Employee(employeeData[0], employeeData[1],
                    employeeId, Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5],
                    Boolean.parseBoolean(employeeData[6]), employeeData[7]);
            employeeStorage.add(newEmployee);
            System.out.println("Employee was added");
        } else {
            System.out.println("employee with " + employeeId + " already exists!");
        }
    }
}
