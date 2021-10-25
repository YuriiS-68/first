package pro.sky.java.course1.homework.lesson.conditional;

public class StandardTasks {
    public static void main(String[] args) {
        task1(332);
        task2(0, 2010);
        task3(2020);
        task4(95);
        task5(9);
    }

    public static void task1(int number){
        byte clientA = 1;
        byte clientO = 0;
        if (clientO == number){
            System.out.println("Install the iOS version of the app from the link.");
        } else if (clientA == number) {
            System.out.println("Install the Android version of the app from the link.");
        }
        else {
            System.out.println("You need to install either iOS or Android.");
        }
    }

    public static void task2(int number, int clientDeviceYear){
        byte clientA = 1;
        byte clientO = 0;

        if (clientO == number && clientDeviceYear >= 2015){
            System.out.println("Install the iOS version of the app from the link.");
        } else if (clientO == number && clientDeviceYear < 2015){
            System.out.println("Install the lite version of the app for iOS using the link.");
        }

        if (clientA == number && clientDeviceYear >= 2015) {
            System.out.println("Install the Android version of the app from the link.");
        } else if (clientA == number && clientDeviceYear < 2015){
            System.out.println("Install the lite version of the app for iOS using the link.");
        }

        if (number != clientA && number != clientO) {
            System.out.println("You need to install either iOS or Android.");
        }
    }

    public static void task3(int year){
        if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
            System.out.println(year + "year is leap.");
        } else {
            System.out.println(year + "year is not leap.");
        }
    }

    public static void task4(int deliveryDistance){
        if (deliveryDistance <= 20){
            System.out.println("It will take one day for delivery.");
        }

        if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("It will take two days for delivery.");
        }

        if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("It will take three days for delivery.");
        }
    }

    public static void task5(int monthNumber){
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("This month belongs to the winter season.");
            case 3, 4, 5 -> System.out.println("This month belongs to the spring season.");
            case 6, 7, 8 -> System.out.println("This month belongs to the summer season.");
            case 9, 10, 11 -> System.out.println("This month belongs to the autumn season.");
            default -> System.out.println("There is no such month.");
        }
    }
}
