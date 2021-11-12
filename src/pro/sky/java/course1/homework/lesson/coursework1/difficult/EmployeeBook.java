package pro.sky.java.course1.homework.lesson.coursework1.difficult;

public class EmployeeBook {
    private final Employee[] employees;
    private Employee employeeSalary = null;
    private double minSalary = Double.MAX_VALUE;
    private double maxSalary = Double.MIN_VALUE;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public Employee addEmployee(String firstName, String middleName, String lastName, int department, double salary){
        Employee employee = new Employee(firstName, middleName, lastName, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                employees[i] = employee;
                break;
            }
            if (employees[i] != null && i == employees.length - 1){
                System.err.println("EmployeeBook is full");
            }
        }
        return employee;
    }

    public void deleteEmployee(String firstName, String middleName, String lastName){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFirstName().equals(firstName) && employees[i].getMiddleName().equals(middleName)
             && employees[i].getLastName().equals(lastName)){
                employees[i] = null;
            }
        }
    }

    public void deleteEmployeeById(long id){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id){
                employees[i] = null;
            }
        }
    }

    public void changeSalaryEmployee(String firstName, String middleName, String lastName, double newSalary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFirstName().equals(firstName) && employee.getMiddleName().equals(middleName)
                    && employee.getLastName().equals(lastName)) {
                employee.setSalary(newSalary);
            }
        }
    }

    public void changeDepartmentEmployee(String firstName, String middleName, String lastName, int newDepartment) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFirstName().equals(firstName) && employee.getMiddleName().equals(middleName)
                    && employee.getLastName().equals(lastName)) {
                employee.setDepartment(newDepartment);
            }
        }
    }

    public void toSalaryIndexing(double index){
        for (Employee employee : employees){
            if (employee != null && index > 0){
                employee.setSalary(employee.getSalary() * (1 + index / 100));
            }
        }
    }

    public void toSalaryIndexingByDepartment(int numberDepartment, double index){
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment() == numberDepartment && index > 0){
                employee.setSalary(employee.getSalary() * (1 + index / 100));
            }
        }
    }

    public Employee minSalaryByDepartment(int numberDepartment){
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeSalary = employee;
            }
        }
        return employeeSalary;
    }

    public Employee maxSalaryByDepartment(int numberDepartment){
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == numberDepartment && employee.getSalary() >= maxSalary) {
                maxSalary = employee.getSalary();
                employeeSalary = employee;
            }
        }
        return employeeSalary;
    }

    public double sumSalaryByDepartment(int numberDepartment){
        double sum = 0;
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment() == numberDepartment){
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double averageSalaryDepartment(int numberDepartment){
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

    public void getEmployeesSalaryLess(double summa){
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < summa) {
                printInfoEmployee(employee);
            }
        }
    }

    public void getEmployeesSalaryMore(double summa){
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= summa) {
                printInfoEmployee(employee);
            }
        }
    }

    public void printInfoEmployees(Employee[] employees) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i + 1] != null){
                result.append(employees[i].getId()).append(" ")
                        .append(employees[i].getFirstName()).append(" ").append(employees[i].getMiddleName()).append(" ")
                        .append(employees[i].getLastName()).append(" ")
                        .append("department:").append(employees[i].getDepartment()).append(" ")
                        .append(employees[i].getSalary()).append("\n");
            }
            if (employees[i] != null && employees[i + 1] == null || employees[i] != null && i == employees.length - 1){
                result.append(employees[i].getId()).append(" ")
                        .append(employees[i].getFirstName()).append(" ").append(employees[i].getMiddleName()).append(" ")
                        .append(employees[i].getLastName()).append(" ")
                        .append("department:").append(employees[i].getDepartment()).append(" ")
                        .append(employees[i].getSalary());
            }
            if (employees[i] == null  && employees[i - 1] != null){
                result.append("\n");
            }
        }
        System.out.println(result);
    }

    public void printInfoByDepartment() {
        int numberDepartment = 1;
        int quantityDepartments = 5;
        StringBuilder result = new StringBuilder();
        while (numberDepartment <= quantityDepartments){
            if (employees.length != 0){
                result.append("Employees department ").append(Integer.valueOf(numberDepartment)).append(":\n");
            }
            for (Employee employee : employees) {
                if (getQuantityEmployeesDepartment(employees, numberDepartment) == 0){
                    result.append("This department has not employees.\n");
                    break;
                }
                if (employee != null && employee.getDepartment() == numberDepartment) {
                    result.append(employee.getFirstName()).append(" ").append(employee.getMiddleName()).append(" ")
                            .append(employee.getLastName()).append("\n");
                }
            }
            result.append("\n");
            numberDepartment++;
        }
        System.out.println(result);
    }

    private void printInfoEmployee(Employee employee){
        String result = "id=" + employee.getId() + " " +
                employee.getFirstName() + " " + employee.getMiddleName() + " " +
                employee.getLastName() + " " +
                employee.getSalary();
        System.out.println(result);
    }

    private int getQuantityEmployeesDepartment(Employee[] employees, int numberDepartment){
        int counter = 0;
        for(Employee employee : employees){
            if (employee != null && employee.getDepartment() == numberDepartment){
                counter++;
            }
        }
        return counter;
    }
}
