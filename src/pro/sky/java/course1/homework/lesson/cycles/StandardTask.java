package pro.sky.java.course1.homework.lesson.cycles;

public class StandardTask {
    public static void main(String[] args) {
        task1();
        task2(4);
        task3();
    }

    public static void task1() {
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
    }

    public static void task2(int number) {
        System.out.println();
        for (int i = number; i <= 31; i += 7){
            System.out.println("Today is Friday " + i + ". You need to prepare a report.");
        }
    }

    public static void task3() {
        int currentYear = 2021;
        int startYear = 2021 - 200;
        int endYear = 2021 + 100;

        for (int i = startYear; i < currentYear; i++){
            if (i % 79 == 0){
                startYear = i;
                break;
            }
        }

        for (int i = startYear; i < endYear; i += 79){
            System.out.println(i);
        }

    }
}
