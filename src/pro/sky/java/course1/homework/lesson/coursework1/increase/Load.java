package pro.sky.java.course1.homework.lesson.coursework1.increase;

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

        System.out.println(maxSalary(getEmployeesDepartment(employee, 6)));
        System.out.println("maxSalary = " + maxSalary(getEmployeesDepartment(employee, 3)));
        System.out.println("minSalary = " + minSalary(getEmployeesDepartment(employee, 3)));
        System.out.println("sumSalaryByDepartment = " + sumSalaryByDepartment(getEmployeesDepartment(employee, 5)));
        System.out.println(Arrays.toString(toSalaryIndexing(getEmployeesDepartment(employee, 5), -10)));
        System.out.println(printInfoEmployees(employee));
        System.out.println("averageSalaryDepartment = " + averageSalaryDepartment(getEmployeesDepartment(employee, 6)));
        System.out.println();
        System.out.println("getEmployeesSalaryLess(employee, 300) = " + Arrays.toString(getEmployeesSalaryLess(employee, 300)));
        System.out.println();
        System.out.println(printInfoEmployees(getEmployeesSalaryLess(employee, 300)));
        System.out.println();
        System.out.println(printInfoEmployees(getEmployeesSalaryMore(employee, 300)));

    }

    public static Employee[] toSalaryIndexing(Employee[] employees, double index){
        for (Employee employee : employees){
            if (employee != null && index > 0){
                employee.setSalary(employee.getSalary() * getPercentIndexation(index) + employee.getSalary());
            } else if (employee != null && index < 0) {
                employee.setSalary((employee.getSalary() * getPercentIndexation(index) - employee.getSalary()) * -1);
            }
        }
        return employees;
    }

    public static Employee maxSalary(Employee[] employees){
        Employee employeeMaxSalary = null;
        if (employees.length >= 1) {
            double maxSalary = employees[0].getSalary();
            for (Employee employee : employees) {
                if (employee != null && employee.getSalary() >= maxSalary) {
                    maxSalary = employee.getSalary();
                    employeeMaxSalary = employee;
                }
            }
        }
        return employeeMaxSalary;
    }

    public static Employee minSalary(Employee[] employees){
        Employee employeeMinSalary = null;
        if (employees.length >= 1){
            double minSalary = employees[0].getSalary();
            for (Employee employee : employees){
                if (employee != null && employee.getSalary() <= minSalary){
                    minSalary = employee.getSalary();
                    employeeMinSalary = employee;
                }
            }
        }
        return employeeMinSalary;
    }

    public static double sumSalaryByDepartment(Employee[] employees){
        double sum = 0;
        if (employees.length >= 1){
            for (Employee employee : employees){
                if (employee != null){
                    sum += employee.getSalary();
                }
            }
        }
        return sum;
    }

    public static double averageSalaryDepartment(Employee[] employees){
        if (employees.length == 0){
            System.err.println("The department has no employees.");
        }
        int counterEmployees = 0;
        for (Employee employee : employees){
            if (employee != null){
                counterEmployees++;
            }
        }
        return sumSalaryByDepartment(employees) / counterEmployees;
    }

    public static Employee[] getEmployeesSalaryLess(Employee[] employees, double number){
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                counter++;
            }
        }
        Employee[] salaryLess = new Employee[counter];
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() < number) {
                addEmployee(salaryLess, employee);
            }
        }
        return salaryLess;
    }

    public static Employee[] getEmployeesSalaryMore(Employee[] employees, double number){
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                counter++;
            }
        }
        Employee[] salaryLess = new Employee[counter];
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() >= number) {
                addEmployee(salaryLess, employee);
            }
        }
        return salaryLess;
    }

    public static String printInfoEmployees(Employee[] employees) {
        StringBuilder result = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null) {
                result.append(employee.getId()).append(" ")
                        .append(employee.getFirstName()).append(" ").append(employee.getMiddleName()).append(" ")
                        .append(employee.getLastName()).append(" ")
                        .append(employee.getSalary()).append("\n");
            }
        }
        return result.toString();
    }

    private static double getPercentIndexation(double index){
        if (index < 0){
            index *= -1;
        }
        return index / 100;
    }

    private static Employee[] getEmployeesDepartment(Employee[] employees, int number){
        if (number < 1 || number > 5){
            System.err.println("Department under number " + number + " is not exist!");
        }
        int employeesLength = 0;
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment().toString().contains(Integer.toString(number))){
                employeesLength++;
            }
        }
        Employee[] employeesDepartment = new Employee[employeesLength];
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment().toString().contains(Integer.toString(number))){
                addEmployee(employeesDepartment, employee);
            }
        }
        return employeesDepartment;
    }

    private static void addEmployee(Employee[] employees, Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                employees[i] = employee;
                break;
            }
        }
    }
}
