package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage es = new EmployeeStorage();

        boolean isRun = true;
        while (isRun) {
            System.out.println("0 for exit");
            System.out.println("1 add employee");
            System.out.println("2 print all employee");
            System.out.println("3 search employee by employee ID");
            System.out.println("4 search employee by company name");

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
                    double salary = Double.parseDouble(salaryStr);
                    Employee employee = new Employee(name, surname, employeeID, salary, company, position);
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
            }
        }
    }
}
