package pro.sky.java.course1.homework.lesson.strings;

public class HardTasks {
    public static void main(String[] args) {
        String str1 = "135";
        String str2 = "246";
        String input = "aabccddefgghiijjkk";
        task7version1(str1, str2);
        System.out.println("Output string - " + task7version2(str1, str2));
        task8(input);
    }

    public static void task7version1(String str1, String str2) {
        StringBuilder result = new StringBuilder(str1);

        for (int i = 0; i < str2.length(); i++) {
            result.insert(Math.min(i * 2 + 1, result.length()), str2.charAt(i));
        }
        System.out.println("Output string - " + result);
    }

    public static String task7version2(String str1, String str2) {
        int[] arrays1 = str1.codePoints().toArray();
        int[] arrays2 = str2.codePoints().toArray();
        int[] resultArray = new int[arrays1.length + arrays2.length];

        for (int index1 = 0, index2 = 0, j = 0; j < resultArray.length; ){
            if (index1 < arrays1.length){
                resultArray[j++] = arrays1[index1++];
            }
            if (index2 < arrays2.length){
                resultArray[j++] = arrays2[index2++];
            }
        }
        return new String(resultArray, 0, resultArray.length);
    }

    public static void task8(String input) {
        int position = 1;
        char[] characters = getDuplicate(input).toCharArray();
        for (int i = 1; i < characters.length; i++) {
            int j;
            for (j = 0; j < position; ++j) {
                if (characters[i] == characters[j]){
                    break;
                }
            }
            if (j == position){
                characters[position] = characters[i];
                ++position;
            } else {
                characters[position] = 0;
                ++position;
            }
        }
        System.out.println(getOutputString(characters));
    }

    private static String getDuplicate(String input){
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            int index1 = input.lastIndexOf(input.charAt(i));
            int index2 = input.indexOf(input.charAt(i));
            if (index1 != index2){
                result += input.charAt(i);
            }
        }
        return result;
    }

    private static String getOutputString(char[] characters){
        StringBuilder output = new StringBuilder();
        for (char character : characters){
            if (character != 0){
                output.append(character);
            }
        }
        return output.toString();
    }
}
