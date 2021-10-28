package pro.sky.java.course1.homework.lesson.strings;

public class StandardTasks {
    public static void main(String[] args) {
        String fullName = "Ivanov Ivan Ivanovich";
        task1();
        task2(fullName);
        task3(fullName);
        task4();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " "  + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2(String fullName){
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }

    public static void task3(String fullName){
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName.replace(' ', ';'));
    }

    public static void task4() {
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName.replace('ё', 'е'));
    }
}
