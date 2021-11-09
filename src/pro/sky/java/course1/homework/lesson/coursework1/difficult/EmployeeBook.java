package pro.sky.java.course1.homework.lesson.coursework1.difficult;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public Employee addEmployee(String firstName, String middleName, String lastName, Department department, double salary){
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setMiddleName(middleName);
        employee.setLastName(lastName);
        employee.setDepartment(department);
        employee.setSalary(salary);
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

    public Employee changeSalaryEmployee(String firstName, String middleName, String lastName, double newSalary) {
        Employee employee = new Employee();
        for (Employee value : employees) {
            if (value != null && value.getFirstName().equals(firstName) && value.getMiddleName().equals(middleName)
                    && value.getLastName().equals(lastName)) {
                value.setSalary(newSalary);
                employee = value;
            }
        }
        return employee;
    }

    public Employee changeDepartmentEmployee(String firstName, String middleName, String lastName, Department department) {
        Employee employee = new Employee();
        for (Employee value : employees) {
            if (value != null && value.getFirstName().equals(firstName) && value.getMiddleName().equals(middleName)
                    && value.getLastName().equals(lastName)) {
                value.setDepartment(department);
                employee = value;
            }
        }
        return employee;
    }

    public void toSalaryIndexing(double index){
        for (Employee employee : employees){
            if (employee != null && index > 0){
                employee.setSalary(employee.getSalary() * getPercentIndexation(index) + employee.getSalary());
            } else if (employee != null && index < 0) {
                employee.setSalary((employee.getSalary() * getPercentIndexation(index) - employee.getSalary()) * -1);
            }
        }
    }

    public void toSalaryIndexingByDepartment(int number, double index){
        for (Employee employee : getEmployeesDepartment(number)){
            if (employee != null && index > 0){
                employee.setSalary(employee.getSalary() * getPercentIndexation(index) + employee.getSalary());
            } else if (employee != null && index < 0) {
                employee.setSalary((employee.getSalary() * getPercentIndexation(index) - employee.getSalary()) * -1);
            }
        }
    }

    public Employee maxSalaryByDepartment(int number){
        Employee employeeMaxSalary = null;
        if (getEmployeesDepartment(number).length >= 1) {
            double maxSalary = Double.MIN_VALUE;
            for (Employee employee : getEmployeesDepartment(number)) {
                if (employee != null && employee.getSalary() >= maxSalary) {
                    maxSalary = employee.getSalary();
                    employeeMaxSalary = employee;
                }
            }
        }
        return employeeMaxSalary;
    }

    public Employee minSalaryByDepartment(int number){
        Employee employeeMinSalary = null;
        if (getEmployeesDepartment(number).length >= 1){
            double minSalary = Double.MAX_VALUE;
            for (Employee employee : getEmployeesDepartment(number)){
                if (employee != null && employee.getSalary() <= minSalary){
                    minSalary = employee.getSalary();
                    employeeMinSalary = employee;
                }
            }
        }
        return employeeMinSalary;
    }

    public double sumSalaryByDepartment(int number){
        double sum = 0;
        if (getEmployeesDepartment(number).length >= 1){
            for (Employee employee : getEmployeesDepartment(number)){
                if (employee != null){
                    sum += employee.getSalary();
                }
            }
        }
        return sum;
    }

    public double averageSalaryDepartment(int number){
        int counterEmployees = 0;
        if (getEmployeesDepartment(number).length == 0){
            return counterEmployees;
        }
        for (Employee employee : getEmployeesDepartment(number)){
            if (employee != null){
                counterEmployees++;
            }
        }
        return sumSalaryByDepartment(number) / counterEmployees;
    }

    public Employee[] getEmployeesSalaryLess(int number, double sum){
        int counter = 0;
        for (Employee employee : getEmployeesDepartment(number)) {
            if (employee != null && employee.getSalary() < sum) {
                counter++;
            }
        }
        Employee[] salaryLess = new Employee[counter];
        for (Employee employee : getEmployeesDepartment(number)){
            if (employee != null && employee.getSalary() < sum) {
                addEmployee(salaryLess, employee);
            }
        }
        return salaryLess;
    }

    public Employee[] getEmployeesSalaryMore(int number, double sum){
        int counter = 0;
        for (Employee employee : getEmployeesDepartment(number)) {
            if (employee != null && employee.getSalary() >= sum) {
                counter++;
            }
        }
        Employee[] salaryMore = new Employee[counter];
        for (Employee employee : getEmployeesDepartment(number)){
            if (employee != null && employee.getSalary() >= sum) {
                addEmployee(salaryMore, employee);
            }
        }
        return salaryMore;
    }

    public String printInfoEmployees() {
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

    public String printInfoEmployeesByDepartment(int number) {
        StringBuilder result = new StringBuilder();
        for (Employee employee : getEmployeesDepartment(number)) {
            if (employee != null) {
                result.append(employee.getId()).append(" ")
                        .append(employee.getFirstName()).append(" ").append(employee.getMiddleName()).append(" ")
                        .append(employee.getLastName()).append(" ")
                        .append(employee.getSalary()).append("\n");
            }
        }
        return result.toString();
    }

    public String printInfoByDepartment() {
        int number = 1;
        StringBuilder result = new StringBuilder();
        while (number < 6){
            if (getEmployeesDepartment(number).length != 0){
                result.append("Employees department ").append(Integer.valueOf(number)).append(":\n");
            }
            for (Employee employee : getEmployeesDepartment(number)) {
                if (employee != null) {
                    result.append(employee.getFirstName()).append(" ").append(employee.getMiddleName()).append(" ")
                            .append(employee.getLastName()).append("\n");
                }
            }
            result.append("\n");
            number++;
        }
        return result.toString();
    }

    public String printInfoEmployeesByDepartmentList(Employee[] employees) {
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

    private Employee[] getEmployeesDepartment(int number){
        if (number < 1 || number > 5){
            System.err.println("Department under number " + number + " is not exist!");
        } else if (!isDepartment(employees, number)) {
            System.err.println("Department under number " + number + " has not employees!");
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

    private boolean isDepartment(Employee[] employees, int number){
        boolean departmentExist = false;
        for (Employee employee : employees){
            if (employee != null && employee.getDepartment().toString().contains(Integer.toString(number))){
                departmentExist = true;
            }
        }
        return departmentExist;
    }

    private void addEmployee(Employee[] employees, Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                employees[i] = employee;
                break;
            }
        }
    }

    private double getPercentIndexation(double index){
        if (index < 0){
            index *= -1;
        }
        return index / 100;
    }
}
