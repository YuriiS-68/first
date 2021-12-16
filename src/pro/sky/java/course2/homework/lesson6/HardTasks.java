package pro.sky.java.course2.homework.lesson6;

import java.util.*;

public class HardTasks {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 8, 1, 2, 22, 3, 4, 4, 5, 5, 6, 7, 2));
    private static final String line1 = "магазин74";
    private static final String line2 = "инлз7гаа4м";
    private static final String line3 = "abc";
    private static final String line4 = "abcc8ba";

    public static void main(String[] args) {
        System.out.println("getSumList() = " + getSumList());
        System.out.println("isAnagram(line1, line2) = " + isAnagram(line1, line2));
        System.out.println("checkWords(line3, line4) = " + checkWords(line3, line4));
    }

    public static int getSumList(){
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int indexStart = nums.indexOf(nums.get(i));
            int indexEnd = nums.lastIndexOf(nums.get(i));
            if (indexStart == indexEnd){
                nums.set(i, 1);
            } else {
                nums.set(i, 0);
                nums.set(indexEnd, 0);
            }
        }

        for (Integer num : nums){
            sum += num;
        }
        return sum;
    }

    public static boolean checkWords(String firstWord, String secondWord){
        boolean flag = true;
        char[] chars = firstWord.toCharArray();
        char[] charsSecond = secondWord.toCharArray();
        Set<Character> unique = new HashSet<>();

        for (Character ch : chars){
            unique.add(ch);
        }

        for (int i = 0; i < charsSecond.length; i++){
            for (Character uniqueChar : unique){
                if (charsSecond[i] == uniqueChar){
                    charsSecond[i] = ' ';
                    break;
                }
            }
        }

        for (char ch : charsSecond) {
            if (ch != ' ') {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isAnagram(String firstWord, String secondWord){
        if (firstWord.length() != secondWord.length()){
            return false;
        }

        StringBuilder stringBuilder = new StringBuilder(secondWord.toLowerCase());

        for (char ch : firstWord.toLowerCase().toCharArray()){
            if (Character.isLetter(ch) || Character.isDigit(ch)){
                int index = stringBuilder.indexOf(String.valueOf(ch));
                if (index == -1){
                    return false;
                }
                stringBuilder.deleteCharAt(index);
            }
        }
        return true;
    }
}
