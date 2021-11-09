package pro.sky.java.course1.homework.lesson.coursework1.basic;

public class Employee {
    private static long counterId;
    private long id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private String department1;
    private String department2;
    private String department3;
    private String department4;
    private String department5;
    private double salary;

    public Employee(String firstName, String middleName, String lastName, String department1,
                    String department2, String department3, String department4, String department5, double salary) {
        counterId++;
        this.id = counterId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department1 = department1;
        this.department2 = department2;
        this.department3 = department3;
        this.department4 = department4;
        this.department5 = department5;
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

    public String getDepartment1() {
        return department1;
    }

    public String getDepartment2() {
        return department2;
    }

    public String getDepartment3() {
        return department3;
    }

    public String getDepartment4() {
        return department4;
    }

    public String getDepartment5() {
        return department5;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment1(String department1) {
        this.department1 = department1;
    }

    public void setDepartment2(String department2) {
        this.department2 = department2;
    }

    public void setDepartment3(String department3) {
        this.department3 = department3;
    }

    public void setDepartment4(String department4) {
        this.department4 = department4;
    }

    public void setDepartment5(String department5) {
        this.department5 = department5;
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
                ", department1='" + department1 + '\'' +
                ", department2='" + department2 + '\'' +
                ", department3='" + department3 + '\'' +
                ", department4='" + department4 + '\'' +
                ", department5='" + department5 + '\'' +
                ", salary=" + salary +
                '}';
    }
}
