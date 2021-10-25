package pro.sky.java.course1.homework.lesson.variables;

public class Task6 {
    public static void main(String[] args) {
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));
        result *= -1;

        System.out.println("result = " + result + System.lineSeparator() + "result = " + result * -1);
    }
}
