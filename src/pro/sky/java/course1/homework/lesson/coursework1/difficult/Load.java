package pro.sky.java.course1.homework.lesson.coursework1.difficult;

public class Load {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        EmployeeBook employeeBook = new EmployeeBook(employee);
        employeeBook.addEmployee("Igor","Petrovich", "Shpak", 1, 150.00);
        employeeBook.addEmployee("Sergei","Andreevich", "Dmitruk", 5, 470.00);
        employeeBook.addEmployee("Ivan","Semenovich", "Gunko", 3, 300.00);
        employeeBook.addEmployee("Olga","Ivanovna", "Skvorcova", 4, 280.00);
        employeeBook.addEmployee("Tamara","Petrovna", "Korobko", 5, 450.00);
        employeeBook.printInfoEmployees(employee);
        System.out.println("minSalaryByDepartment = " + employeeBook.minSalaryByDepartment(5));
        employeeBook.deleteEmployeeById(3);
        employeeBook.printInfoEmployees(employee);
        employeeBook.changeSalaryEmployee("Tamara","Petrovna", "Korobko", 1050);
        employeeBook.printInfoEmployees(employee);
        employeeBook.printInfoByDepartment();
        employeeBook.getEmployeesSalaryLess(320);

    }
}
