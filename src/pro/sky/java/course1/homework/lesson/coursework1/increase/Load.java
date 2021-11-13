package pro.sky.java.course1.homework.lesson.coursework1.increase;

public class Load {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        Employee employee1 = new Employee("Igor","Petrovich", "Shpak", 1, 150.00);
        Employee employee2 = new Employee("Sergei","Andreevich", "Dmitruk", 5, 470.00);
        Employee employee3 = new Employee("Ivan","Semenovich", "Gunko", 3, 300.00);
        Employee employee4 = new Employee("Olga","Ivanovna", "Skvorcova", 3, 280.00);
        Employee employee5 = new Employee("Tamara","Petrovna", "Korobko", 5, 450.00);
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;

        printInfoEmployees(toSalaryIndexing(10));
        System.out.println("minSalary - " + minSalary(5));
        System.out.println("maxSalary - " + maxSalary(4));
        System.out.println("sumSalaryByDepartment = " + sumSalaryByDepartment( 5));
        System.out.println("averageSalaryDepartment = " + averageSalaryDepartment( 5));
        printInfoEmployees(toSalaryIndexingByDepartment(5, 10));
        System.out.print("EmployeesSalaryLess\n");
        getEmployeesSalaryLess(300);
        System.out.print("EmployeesSalaryMore\n");
        getEmployeesSalaryMore(500);
    }

    public static Employee[] toSalaryIndexing(double index){
        for (Employee employee : employees){
            if (employee != null && index > 0){
                employee.setSalary(employee.getSalary() * (1 + index / 100));
            }
        }
        return employees;
    }

    public static Employee minSalary(int numberDepartment){
        validationDepartment(numberDepartment);
        Employee employeeMinSalary =  null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    public static Employee maxSalary(int numberDepartment){
        validationDepartment(numberDepartment);
        Employee employeeMaxSalary = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment && employee.getSalary() >= maxSalary) {
                maxSalary = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    public static double sumSalaryByDepartment(int numberDepartment){
        validationDepartment(numberDepartment);
        double sum = 0;
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment() == numberDepartment){
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static double averageSalaryDepartment(int numberDepartment){
        validationDepartment(numberDepartment);
        int counterEmployees = 0;
        double sum = 0;
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment() == numberDepartment){
                sum += employee.getSalary();
                counterEmployees++;
            }
        }
        return sum / counterEmployees;
    }

    public static Employee[] toSalaryIndexingByDepartment(int numberDepartment, double index){
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment() == numberDepartment && index > 0){
                employee.setSalary(employee.getSalary() * (1 + index / 100));
            }
        }
        return employees;
    }

    public static void getEmployeesSalaryLess(double summa){
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < summa) {
                printInfoEmployee(employee);
            }
        }
    }

    public static void getEmployeesSalaryMore(double summa){
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= summa) {
                printInfoEmployee(employee);
            }
        }
    }

    public static void printInfoEmployees(Employee[] employees) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i + 1] != null){
                result.append(employees[i].getId()).append(" ")
                        .append(employees[i].getFirstName()).append(" ").append(employees[i].getMiddleName()).append(" ")
                        .append(employees[i].getLastName()).append(" ")
                        .append(employees[i].getSalary()).append("\n");
            }
            if (employees[i] != null && employees[i + 1] == null || employees[i] != null && i == employees.length - 1){
                result.append(employees[i].getId()).append(" ")
                        .append(employees[i].getFirstName()).append(" ").append(employees[i].getMiddleName()).append(" ")
                        .append(employees[i].getLastName()).append(" ")
                        .append(employees[i].getSalary());
            }
        }
        System.out.println(result);
    }

    private static void printInfoEmployee(Employee employee){
        String result = "id=" + employee.getId() + " " +
                employee.getFirstName() + " " + employee.getMiddleName() + " " +
                employee.getLastName() + " " +
                employee.getSalary();
        System.out.println(result);
    }

    private static void validationDepartment(int numberDepartment){
        if (numberDepartment < 1 || numberDepartment > 5){
            System.err.println("Department under number " + numberDepartment + " is not exist!");
        }
    }
}
