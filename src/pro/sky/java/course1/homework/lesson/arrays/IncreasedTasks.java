package pro.sky.java.course1.homework.lesson.arrays;

import java.util.Arrays;

public class IncreasedTasks {
    public static void main(String[] args) {
        printMatrix3X3(3, 1);
        reversArray();
        reversArray2();
        reversArray3();
    }

    public static void printMatrix3X3(int length, int point) {
        int[][] matrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            matrix[i][i] = point;
            matrix[i][length - 1 - i] = point;
        }

        for(int[] row : matrix){
            for(int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void reversArray() {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));

        int[] reversArray = new int[array.length];
        for (int j = 0, i = array.length - 1; i >= 0; i--, j++) {
            reversArray[i] = array[j];
        }
        System.out.println(Arrays.toString(reversArray));

    }

    public static void reversArray2() {
        int[] array = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void reversArray3() {
        int[] array = {7, 6, 2, 8, 3};
        System.out.println(Arrays.toString(array));

        for (int i = 0, j = array.length -1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
