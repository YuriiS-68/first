package pro.sky.java.course2.homework.lesson6;

import java.util.*;

public class StandardTask {
    private static final StringBuilder result = new StringBuilder();
public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>(List.of(1, 8, 1, 2, 3, 4, 4, 5, 5, 6, 7, 2));
    String line = "В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются" +
            " повторения. Это может быть произвольный набор слов, литературный текст или произвольное предложение. ";
    String line1 = "Однажды в стране и однажды в мире есть много людей любящих других людей.";
    printOddNumbers(nums);
    printEvenNumbers(nums);
    printUniqueWords(line);
    printUnique(line1);
    System.out.println(countDoubleWords(line1));
    System.out.println(countDoubleWords2(line));
}

    public static void printOddNumbers(List<Integer> arrayNums){
        arrayNums.removeIf(e -> e % 2 != 1);

        for(Integer cell : arrayNums){
            result.append(cell).append(" ");
        }
        System.out.println(result);
    }

    public static void printEvenNumbers(List<Integer> arrayNums){
        arrayNums.removeIf(e -> e % 2 == 1);
        arrayNums.sort(Comparator.naturalOrder());

        for(Integer cell : arrayNums){
            result.append(cell).append(" ");
        }
        System.out.println(result);
    }

    public static void printUniqueWords(String str){
    //беру элемент и сравниваю его с остальными
    //если элемент встретился ещё раз, перехожу к другому
    //если нет, кладу в новый массив
        String[] words = str.replaceAll("[^\\da-zA-Za-яёА-ЯЁ ]", "").toLowerCase().split(" ");
        List<String> uniqueWords = new ArrayList<>(List.of(words));
        List<String> resultWords = new ArrayList<>();
        boolean wordDouble = true;

        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            wordDouble = true;
            for (int j = 0; j < uniqueWords.size(); j++) {
                if ((i != j) && (uniqueWords.get(j).equals(temp))){
                    wordDouble = false;
                    break;
                }
            }
            if (wordDouble){
                resultWords.add(temp);
            }
        }

        for(String cell : resultWords){
            result.append(cell).append(" ");
        }
        System.out.println(result);
    }

    public static void printUnique(String str) {
        String[] words = str.toLowerCase().split("[^\\p{L}\\p{N}]+");
        Set<String> uniques = new LinkedHashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String word : words){
            if (!uniques.add(word)){
                duplicates.add(word);
            }
        }
        uniques.removeAll(duplicates);
        System.out.println(String.join(" ", uniques));
    }

    //вывести все количество дублей из массива слов
    //идти по массиву слов и если есть повторение слова увеличивать счетчик на 1 и обнулить этот элемент массива
    //перейти к следующему элементу
    public static int countDoubleWords(String str){
        String[] words = str.toLowerCase().split("[^\\p{L}\\p{N}]+");
        int countDouble = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++){
                if ((i != j) && (words[j].equals(words[i]))){
                    countDouble++;
                    words[i] = "";
                    break;

                }
            }
        }
        return countDouble;
    }

    public static int countDoubleWords2(String str){
        String[] words = str.toLowerCase().split("[^\\p{L}\\p{N}]+");
        List<String> listWords = new ArrayList<>(List.of(words));
        int countDouble = 0;
        int indexStart;
        int indexEnd;

        for (String word : words) {
            indexStart = listWords.indexOf(word);
            indexEnd = listWords.lastIndexOf(word);
            if (indexStart != indexEnd) {
                countDouble++;
            }
        }
        return countDouble / 2;
    }
}
