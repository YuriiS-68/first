package pro.sky.java.course1.homework.lesson.variables;

public class Task7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("a = " + a + System.lineSeparator() + "b = " + b);
        //first variant
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + System.lineSeparator() + "b = " + b);

        //second variant
        a = a + b - (b = a);
        System.out.println("a = " + a + System.lineSeparator() + "b = " + b);
    }
}
