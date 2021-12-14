package pro.sky.java.course2.homework.lesson6;

import java.util.*;

public class HardTasks {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 8, 1, 2, 22, 3, 4, 4, 5, 5, 6, 7, 2));
    private static final String line1 = "theclassroom";
    private static final String line2 = "theclafsroom";
    private static final String line3 = "abc";
    private static final String line4 = "abccba";

    public static void main(String[] args) {
        System.out.println("getSumList() = " + getSumList());
        System.out.println("isAnagram(line1, line2) = " + isAnagram(line1, line2));
        System.out.println("checkWords(line3, line4) = " + checkWords(line3, line4));
    }

    public static int getSumList(){
        Set<Integer> uniqueNums = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : nums){
            if (!uniqueNums.add(num)){
                duplicates.add(num);
            }
        }

        for (Integer num : nums) {
            for (Integer duplicate : duplicates) {
                if (num.equals(duplicate)){
                    result.add(0);
                }
            }
        }
        return nums.size() - result.size();
    }

    public static boolean checkWords(String firstWord, String secondWord){
        return firstWord.contains(secondWord) || secondWord.contains(firstWord);
    }

    public static boolean isAnagram(String firstWord, String secondWord){
        char[] firstArrays = firstWord.toLowerCase().toCharArray();
        char[] secondArrays = secondWord.toLowerCase().toCharArray();

        if (firstArrays.length != secondArrays.length){
            return false;
        }

        int sumFirst = sumChars(firstArrays);
        int sumSecond = sumChars(secondArrays);
        return sumFirst == sumSecond;
    }

    private static int sumChars(char[] chars){
        int sum = 0;
        for (char ch : chars) {
            sum += ch;
        }
        return sum;
    }

}
