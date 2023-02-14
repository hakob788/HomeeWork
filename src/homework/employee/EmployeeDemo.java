package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage es = new EmployeeStorage();

    public static void main(String[] args) {


        boolean isRun = true;
        while (isRun) {
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

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input salary");
                    String salaryStr = scanner.nextLine();
                    System.out.println("Please input company ");
                    String company = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    System.out.println("Please input active");
                    String activeStr = scanner.nextLine();
                    double salary = Double.parseDouble(salaryStr);
                    boolean active = Boolean.parseBoolean(activeStr);
                    Employee employee = new Employee(name, surname, employeeID, salary, company, position, active);
                    es.add(employee);
                    System.out.println("employee was added");
                    break;
                case "2":
                    es.print();
                    break;
                case "3":
                    System.out.println("Please input employeeID");
                    employeeID = scanner.nextLine();
                    es.searchByEmployeeID(employeeID);
                    break;
                case "4":
                    System.out.println("Please input company");
                    String companyName = scanner.nextLine();
                    es.searchByCompany(companyName);
                    break;
                case "5":
                    System.out.println("Please input salary range");
                    double min = Double.parseDouble(scanner.nextLine());
                    double max = Double.parseDouble(scanner.nextLine());
                    es.searchSalaryByRange(min, max);
                    break;
                case "6":
                    System.out.println("Please input id and new position");
                    String EmployeeId = scanner.nextLine();
                    String newPosition = scanner.nextLine();
                    es.searchNewPosition(EmployeeId, newPosition);
                    break;
                case "7":
                    //todo
                    break;
                case "8":
                    System.out.println("Please input the ID and change the activity");
                    String EmployeeID = scanner.nextLine();
                    active = Boolean.parseBoolean(scanner.nextLine());
                    es.searchInactiveEmployeeById(EmployeeID, active);
                    break;
                case "9":
                    //todo
                default:
                    System.out.println("Please try again");
            }
        }
    }
}
