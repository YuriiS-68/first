package pro.sky.java.course1.homework.lesson.arrays;

import java.util.Arrays;
import java.util.Random;

public class StandardTasks {
    public static void main(String[] args) {
        sumMonth();
        minAndMaxSum();
        averageSpentMonth();
        reversName();
    }

    public static void sumMonth() {
        int[] spendingMonth = generateRandomArray();
        int sumMonth = 0;

        for (int element : spendingMonth) {
            sumMonth += element;
        }
        System.out.println("The amount of waste for the month was: " + improvedRead(sumMonth) + " RUB.");
    }

    public static void minAndMaxSum() {
        int[] spendingMonth = generateRandomArray();
        int minSum = spendingMonth[0];
        int maxSum = spendingMonth[0];

        for (int element : spendingMonth) {
            if (element < minSum) {
                minSum = element;
            }
            if (element > maxSum) {
                maxSum = element;
            }
        }
        System.out.println("The minimum amount spent per day was: " + improvedRead(minSum) + " RUB.\n" +
                "The maximum amount spent per day was: " + improvedRead(maxSum) + " RUB.");
    }

    public static void averageSpentMonth() {
        int[] spendingMonth = generateRandomArray();
        int sum = 0; //не стал заморачиваться с double, чтобы не менять метод improvedRead() ... нет времени

        for (int element : spendingMonth) {
            sum += element;
        }
        int averageSum = sum / spendingMonth.length;
        System.out.println("The average amount spent per month was: " + improvedRead(averageSum) + " RUB.");
    }

    public static void reversName() {
        String correctName = "";
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            correctName += reverseFullName[i];
        }
        System.out.println(correctName);
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }

    public static String improvedRead(int sumMonth){
        String improvedString = "";
        String invertedString = "";

        char[] charsArray = String.valueOf(sumMonth).toCharArray();
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
        return improvedString;
    }
}
