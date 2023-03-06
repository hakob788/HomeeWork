package homework.employee.model;

import homework.employee.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private Company company;
    private String position;
    private boolean active = true;
    private Date registerDate;
    private Date dateOfBirthday;


    public Employee(String name, String surname, String employeeID, double salary, Company company, String position,
                    Date registerDate, Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.dateOfBirthday = dateOfBirthday;
        this.registerDate = registerDate;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && active == employee.active
                && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname)
                && Objects.equals(employeeID, employee.employeeID) && Objects.equals(company, employee.company)
                && Objects.equals(position, employee.position) && Objects.equals(registerDate, employee.registerDate)
                && Objects.equals(dateOfBirthday, employee.dateOfBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeID, salary, company, position, active, registerDate, dateOfBirthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", registerDate='" + DateUtil.dateToString(registerDate) + '\'' +
                ", dateOfBirthday='" + DateUtil.dateToString(dateOfBirthday) + '\'' +
                '}';
    }
}
