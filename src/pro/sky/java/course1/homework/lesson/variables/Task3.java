package pro.sky.java.course1.homework.lesson.variables;

public class Task3 {
    public static void main(String[] args) {
        short bananas = 5, milk = 200, iceCream = 2, eggs = 4;
        short weightOneBanana = 80;
        float weightOneMlMilk = 1.05f;
        short weightOneIceCream = 100;
        short weightOneEgg = 70;

        float weightBreakfastGram = bananas * weightOneBanana + milk * weightOneMlMilk + iceCream * weightOneIceCream +
                eggs * weightOneEgg;
        float weightBreakfastKg = weightBreakfastGram / 1000;

        System.out.println("Weight of breakfast " + weightBreakfastKg + " kg.");
    }
}
