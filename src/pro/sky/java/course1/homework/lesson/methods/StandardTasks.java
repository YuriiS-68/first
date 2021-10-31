package pro.sky.java.course1.homework.lesson.methods;

import java.time.LocalDate;
import java.util.Arrays;

public class StandardTasks {
    public static void main(String[] args) {
        String str = "wtertbf";
        int[] arrays = {5, 6, 1, 2, 3};
        task1(2017);
        task2(1, 2020);
        System.out.println(task3(101));
        task4(str);
        task5(arrays);
    }

    public static void task1(int year) {
        if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
            System.out.println(year + "year is leap.");
        } else {
            System.out.println(year + "year is not leap.");
        }
    }

    public static void task2(int number, int yearProduction) {
        int currentYear = LocalDate.now().getYear();
        byte clientA = 1;
        byte clientO = 0;

        if (clientO == number && yearProduction >= currentYear){
            System.out.println("Install the iOS version of the app from the link.");
        } else if (clientO == number && yearProduction < currentYear){
            System.out.println("Install the lite version of the app for iOS using the link.");
        }

        if (clientA == number && yearProduction >= currentYear) {
            System.out.println("Install the Android version of the app from the link.");
        } else if (clientA == number && yearProduction < currentYear){
            System.out.println("Install the lite version of the app for Android using the link.");
        }

        if (number != clientA && number != clientO) {
            System.out.println("You need to install either iOS or Android.");
        }
    }

    public static int task3(int deliveryDistance){
        int deliveryDays = 1;

        if (deliveryDistance <= 20){
            return deliveryDays;
        }

        if (deliveryDistance <= 60){
            return deliveryDays + 1;
        } else if (deliveryDistance <= 100){
            return deliveryDays + 2;
        }
        return -1;
    }

    public static void task4(String input) {
        boolean[] chars = new boolean['Z' - 'A' + 1];
        String inputUpper = input.toUpperCase();
        int count = 0;

        for (int i = 0; i < inputUpper.length(); i++) {
            char current = inputUpper.charAt(i);
            if (chars[current - 'A']){
                System.out.println("Character " + current + " in position " + i + " duplicated.");
                break;
            } else {
                chars[current - 'A'] = true;
                count++;
            }
        }
        if (count == input.length()){
            System.out.println("No matches found in this string.");
        }
    }

    public static void task5(int[] inputArrays) {
        for (int i = 0; i < inputArrays.length / 2; i++) {
            int temp = inputArrays[i];
            inputArrays[i] = inputArrays[inputArrays.length - i - 1];
            inputArrays[inputArrays.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(inputArrays));
    }
}
