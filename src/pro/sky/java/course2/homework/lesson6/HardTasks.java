package pro.sky.java.course2.homework.lesson6;

import java.util.*;

public class HardTasks {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 8, 1, 2, 22, 3, 4, 4, 5, 5, 6, 7, 2));
    private static final String line1 = "магаз749";
    private static final String line2 = "га99зма7";
    private static final String line3 = "abc8";
    private static final String line4 = "abcc8cba";

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

        for (char ch : charsSecond) {
            if (!unique.contains(ch)){
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

        List<Character> symbols = new ArrayList<>();

        for (char ch : firstWord.toLowerCase().toCharArray()){
            symbols.add(ch);
        }

        for (char ch : secondWord.toLowerCase().toCharArray()){
            for (int i = 0; i < symbols.size(); i++){
                if (ch == symbols.get(i)){
                    symbols.remove(symbols.get(i));
                }
            }
        }
        return symbols.size() == 0;

        /*StringBuilder stringBuilder = new StringBuilder(secondWord.toLowerCase());

        for (char ch : firstWord.toLowerCase().toCharArray()){
            if (Character.isLetter(ch) || Character.isDigit(ch)){
                int index = stringBuilder.indexOf(String.valueOf(ch));
                if (index == -1){
                    return false;
                }
                stringBuilder.deleteCharAt(index);
            }
        }*/
    }
}
