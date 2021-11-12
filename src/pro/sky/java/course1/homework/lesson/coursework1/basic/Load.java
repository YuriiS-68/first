package pro.sky.java.course1.homework.lesson.coursework1.basic;

public class Load {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        Employee employee1 = new Employee("Igor","Petrovich", "Shpak", 1, 150.00);
        Employee employee2 = new Employee("Sergei","Andreevich", "Dmitruk", 2,  470.00);
        Employee employee3 = new Employee("Ivan","Semenovich", "Gunko", 3,  300.00);
        Employee employee4 = new Employee("Olga","Ivanovna", "Skvorcova", 4,  280.00);
        Employee employee5 = new Employee("Tamara","Petrovna", "Korobko", 5, 450.00);
        employee[0] = employee1;
        employee[1] = employee2;
        employee[2] = employee3;
        employee[4] = employee4;
        employee[5] = employee5;

        getInfoEmployees(employee);
        System.out.println("sumSalaryAll(employee) = " + sumSalaryAll(employee));
        System.out.println("minSalary(employee) = " + minSalary(employee));
        System.out.println("maxSalary(employee) = " + maxSalary(employee));
        System.out.println("averageSalary(employee) = " + averageSalary(employee));
        System.out.println("getNameEmployees(employee):" + "\n" + getNameEmployees(employee));
    }

    public static void getInfoEmployees(Employee[] employees) {
        StringBuilder result = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null) {
                result.append(employee.getId()).append(" ")
                        .append(employee.getFirstName()).append(" ").append(employee.getMiddleName()).append(" ")
                        .append(employee.getLastName()).append(" ")
                        .append(employee.getDepartment()).append(" ")
                        .append(employee.getSalary()).append("\n");
            }
        }
        System.out.println(result);
    }

    public static double sumSalaryAll(Employee[] employees){
        double sum = 0;
        for (Employee employee : employees){
            if (employee != null){
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee minSalary(Employee[] employees){
        Employee employeeMinSalary = null;
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() <= minSalary){
                minSalary = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    public static Employee maxSalary(Employee[] employees){
        Employee employeeMinSalary = null;
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    public static double averageSalary(Employee[] employees){
        int counterEmployees = 0;
        for (Employee employee : employees){
            if (employee != null){
                counterEmployees++;
            }
        }
        return sumSalaryAll(employees) / counterEmployees;
    }

    public static String getNameEmployees(Employee[] employees){
        StringBuilder result = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null) {
                result.append(employee.getFirstName()).append(" ").append(employee.getMiddleName()).append(" ")
                        .append(employee.getLastName()).append("\n");
            }
        }
        return result.toString();
    }
}
