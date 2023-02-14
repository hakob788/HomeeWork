package homework.employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] newArray = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void searchByEmployeeID(String employeeID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(employeeID)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("There is no employee with this ID");
        }
    }

    public void searchByCompany(String companyName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().startsWith(companyName)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("No such company exists");
        }
    }

    public void searchSalaryByRange(double min, double max) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (min <= employee.getSalary() && max >= employee.getSalary()) {
                System.out.println(employee);
            } else {
                System.out.println("the employees salary does not belong to this range");
            }
        }
    }

    public void searchNewPosition(String EmployeeId, String newPosition) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(EmployeeId)) {
                employee.setPosition(newPosition);
                System.out.println(employee);
            } else {
                System.out.println("There is no employee with this ID");
            }
        }
    }

    public void searchInactiveEmployeeById(String employeeID, boolean active) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(employeeID)) {
                employee.setActive(active);
                System.out.println(employee);
            } else {
                System.out.println("There is no employee with this ID");
            }
        }
    }

    public void searchByActive() {

    }
}
