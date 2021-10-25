package pro.sky.java.course1.homework.lesson.arrays;

public class HardTasks {
    public static void main(String[] args) {
        getSumTwoNumbers();
        getSumAllNumbers();
    }

    public static void getSumTwoNumbers() {
        int[] arrays = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = 0;

        for (int i = 0; i < arrays.length; i++) {
            sum = arrays[0] + arrays[i];
            if (sum == -2) {
                System.out.println(arrays[0] + " and " + arrays[i]);
            }
        }
    }

    public static void getSumAllNumbers() {
        int[] arrays = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = 0;

        for (int array : arrays) {
            for (int i : arrays) {
                sum = i + array;
                if (sum == -2) {
                    System.out.println(array + " and " + i);
                }
            }
        }
    }
}
