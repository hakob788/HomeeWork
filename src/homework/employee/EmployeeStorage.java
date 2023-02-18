package homework.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (employees.length == size) {
            extend();
        }
        employees[size++] = value;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }
    }

    public void printByStatus(boolean active) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == active) {
                System.out.println(employees[i] + " ");
            }
        }
    }

    public void printByRegisterDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM//yyyy");
        Date date = new Date();
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
    }

    public Employee getEmployeeById(String Id) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getEmployeeID().equals(Id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchByCompanyName(String companyName) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employees[i].getCompany().contains(companyName)) {
                System.out.println(employee);
            }
        }
    }

    public void searchEmployeeBySalaryRange(double minSalary, double maxSalary) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (minSalary <= employee.getSalary() && maxSalary >= employee.getSalary()) {
                System.out.println(employee);
            } else {
                System.out.println("the employees salary does not belong to this range");
            }
        }
    }
}