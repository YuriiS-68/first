package pro.sky.java.course1.homework.lesson.cycles;

public class IncreasedTasks {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        for (int i = 1; i <= 30; i++){
            System.out.print(i + ": ");

            if (i % 3 == 0){
                System.out.print("ping ");
            }

            if (i % 5 == 0){
                System.out.print("pong");
            }
            System.out.println();

            /*if (i % 3 != 0 && (i % 5 != 0)){
                System.out.println(i + ":");
            }

            if (i % 3 == 0 && i % 5 != 0){
                System.out.println(i + ": ping");
            }

            if (i % 5 == 0 && i % 3 != 0){
                System.out.println(i + ": pong");
            }

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + ": ping pong");
            }*/
        }
    }

    public static void task2() {
        int beforePreviousValue = 0;
        int previousValue = 1;
//        int fibonacci;

//        System.out.print(beforePreviousValue + " " + previousValue + " ");
//        for (int i = 0; i < 8; i++){
//            fibonacci = beforePreviousValue + previousValue;
//            System.out.print(fibonacci + " ");
//            beforePreviousValue = previousValue;
//            previousValue = fibonacci;
//        }

        for(int i = 0; i < 5; i++){
            System.out.print(beforePreviousValue + " " + previousValue + " ");
            beforePreviousValue += previousValue;
            previousValue += beforePreviousValue;
        }
    }
}
