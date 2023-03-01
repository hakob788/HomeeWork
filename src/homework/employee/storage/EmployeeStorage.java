package homework.employee.storage;

import homework.employee.model.Company;
import homework.employee.model.Employee;

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

    public void printByStatus(boolean active) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == active) {
                System.out.println(employees[i] + " ");
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

    public void searchByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employees[i].getCompany().equals(company)) {
                System.out.println(employee);
            }
        }
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

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }
    }
}