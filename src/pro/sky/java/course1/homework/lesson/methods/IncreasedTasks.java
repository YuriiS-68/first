package pro.sky.java.course1.homework.lesson.methods;

import java.util.Random;

public class IncreasedTasks {
    public static void main(String[] args) {
        double[] spendingMonth = generateRandomArray();

        System.out.println("The average amount spent per month was: " + task6(spendingMonth) + " RUB.");
    }

    public static double task6(double[] spendingMonth){
        double sum = 0;

        for (double element : spendingMonth) {
            sum += element;
        }
        return sum / spendingMonth.length;
    }

    public static double[] generateRandomArray() {
        Random random = new Random();
        double[] array = new double[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(100_000) + 100_000;
        }
        return array;
    }
}
