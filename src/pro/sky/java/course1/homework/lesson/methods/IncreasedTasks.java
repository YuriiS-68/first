package pro.sky.java.course1.homework.lesson.methods;

import java.util.Random;

public class IncreasedTasks {
    public static void main(String[] args) {
        double[] spendingMonth = generateRandomArray();
        task6(spendingMonth);
    }

    public static void task6(double[] spendingMonth){
        double sum = 0;

        for (double element : spendingMonth) {
            sum += element;
        }
        double averageSum = sum / spendingMonth.length;
        System.out.println("The average amount spent per month was: " + improvedRead(averageSum) + " RUB.");
    }

    public static double[] generateRandomArray() {
        Random random = new Random();
        double[] array = new double[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }

    public static String improvedRead(double sumMonth){
        String[] preparedLine = String.valueOf(sumMonth).split("\\.");
        String improvedString = "";
        String invertedString = "";

        char[] charsArray = preparedLine[0].toCharArray();
        for (int i = charsArray.length - 1; i >= 0; i--) {
            invertedString += charsArray[i];
        }

        char[] inverted = invertedString.toCharArray();
        for (int i = inverted.length - 1; i >= 0; i--) {
            improvedString += inverted[i];
            if (i % 3 == 0 && i != 0){
                improvedString += '_';
            }
        }
        return improvedString + '.' + preparedLine[1];
    }
}
