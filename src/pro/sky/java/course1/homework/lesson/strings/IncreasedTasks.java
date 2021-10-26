package pro.sky.java.course1.homework.lesson.strings;

public class IncreasedTasks {
    public static void main(String[] args) {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameLowerCase = "ivanov ivan ivanovich";
        task5(fullName);
        task6(fullNameLowerCase);
    }

    public static void task5(String input) {
        /*char[] arraysChar = input.toCharArray();
        int indexFirstSpace = 0;
        int indexSecondSpace = 0;

        for (int i = 0; i < arraysChar.length; i++) {
            if (arraysChar[i] == ' '){
                indexFirstSpace = i;
                break;
            }
        }

        for (int i = arraysChar.length - 1; i >= 0; i--) {
            if (arraysChar[i] == ' '){
                indexSecondSpace = i;
                break;
            }
        }*/

        /*String[] arraysInput = input.split(" ");
        String lastName = arraysInput[0];
        String firstName = arraysInput[1];
        String middleName = arraysInput[2];*/

        int indexFirstSpace = input.indexOf(' ');
        int indexSecondSpace = input.indexOf(' ', indexFirstSpace) + indexFirstSpace;

        System.out.println("First name employee - " + input.substring(indexFirstSpace, indexSecondSpace).trim());
        System.out.println("Last name employee - " + input.substring(0, indexFirstSpace));
        System.out.println("Middle name employee - " + input.substring(indexSecondSpace).trim());
    }

    public static void task6(String inputName) {
        String[] arraysInput = inputName.split(" ");
        String fullName = "";

        for (int i = 0; i < arraysInput.length; i++) {
            char[] chars = arraysInput[i].toCharArray();
            arraysInput[i] = "";
            for (int ch = 0; ch < chars.length; ch++) {
                if (ch == 0){
                    chars[0] = Character.toUpperCase(chars[ch]);
                }
                arraysInput[i] += chars[ch];
            }
            fullName += arraysInput[i] + ' ';
        }
        System.out.println("Correct spelling of the employee`s full name with capital letters - " + fullName.trim());
    }
}
