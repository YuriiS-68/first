package pro.sky.java.course1.homework.lesson.coursework1.difficult;

import java.util.Arrays;

public class Load {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        Employee employee1 = new Employee("Igor","Petrovich", "Shpak", Department.D1, 150.00);
        Employee employee2 = new Employee("Sergei","Andreevich", "Dmitruk", Department.D5, 470.00);
        Employee employee3 = new Employee("Ivan","Semenovich", "Gunko", Department.D3, 300.00);
        Employee employee4 = new Employee("Olga","Ivanovna", "Skvorcova", Department.D4, 280.00);
        Employee employee5 = new Employee("Tamara","Petrovna", "Korobko", Department.D5, 450.00);
        employee[0] = employee1;
        employee[1] = employee2;
        employee[2] = employee3;
        employee[3] = employee4;
        employee[4] = employee5;

        EmployeeBook employeeBook = new EmployeeBook(employee);
        System.out.println("employeeBook.printInfoEmployees(employee) : " + "\n" + employeeBook.printInfoEmployees());
        employeeBook.toSalaryIndexing(-11);
        System.out.println("employeeBook after indexation salary : " + "\n" + employeeBook.printInfoEmployees());
        employeeBook.toSalaryIndexingByDepartment(3, 10);
        System.out.println("employeeBook after indexation salary by department : " + "\n" + employeeBook.printInfoEmployeesByDepartment(3));
        System.out.println("employee maxSalaryByDepartment = " + employeeBook.maxSalaryByDepartment(5));
        System.out.println("employee minSalaryByDepartment = " + employeeBook.minSalaryByDepartment(5));
        System.out.println("sumSalaryByDepartment = " + employeeBook.sumSalaryByDepartment(4));
        System.out.println("averageSalaryDepartment = " + employeeBook.averageSalaryDepartment(1));
        System.out.println("getEmployeesSalaryLess = " + Arrays.toString(employeeBook.getEmployeesSalaryLess(5, 410)));
        System.out.println("getEmployeesSalaryLess: " + "\n" + employeeBook.printInfoEmployeesByDepartmentList(employeeBook.getEmployeesSalaryLess(5, 450)));
        System.out.println("getEmployeesSalaryMore: " + "\n" + employeeBook.printInfoEmployeesByDepartmentList(employeeBook.getEmployeesSalaryMore(5, 410)));
        employeeBook.addEmployee("Irina", "Petrovna", "Matvienko", Department.D2, 360);
        employeeBook.addEmployee("Taras", "Stepanovich", "Kotov", Department.D2, 420);
        System.out.println("employeeBook.printInfoEmployees(employee) : " + "\n" + employeeBook.printInfoEmployees());
        employeeBook.deleteEmployee("Irina", "Petrovna", "Matvienko");
        System.out.println("employeeBook.printInfoEmployees(employee) after deleteEmployee : " + "\n" + employeeBook.printInfoEmployees());
        employeeBook.deleteEmployeeById(3);
        System.out.println("employeeBook.printInfoEmployees(employee) after deleteEmployeeById : " + "\n" + employeeBook.printInfoEmployees());
        employeeBook.changeSalaryEmployee("Sergei","Andreevich", "Dmitruk", 580);
        System.out.println("employeeBook.printInfoEmployees(employee) after change salary : " + "\n" + employeeBook.printInfoEmployees());
        System.out.println(employeeBook.printInfoByDepartment());
    }
}
