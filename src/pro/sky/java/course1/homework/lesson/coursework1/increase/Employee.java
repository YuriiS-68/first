package pro.sky.java.course1.homework.lesson.coursework1.increase;

public class Employee {
    private static long counterId;
    private long id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private double salary;

    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        counterId++;
        this.id = counterId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", salary=" + salary + "\n" +
                '}';
    }
}
