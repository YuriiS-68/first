package pro.sky.java.course1.homework.lesson.variables;

public class Task5 {
    public static void main(String[] args) {
        float salaryMasha = 67_760f;
        float salaryDenis = 83_690f;
        float salaryKristina = 76_230f;

        float salaryAfterIncrease = (salaryMasha / 100) * 10 + salaryMasha;
        float difference = salaryAfterIncrease * 12 - salaryMasha * 12;
        System.out.println("Masha now gets " + salaryAfterIncrease + "rub.\nHer annual income grew by " + difference +
                "rub.");

        salaryAfterIncrease = (salaryDenis / 100) * 10 + salaryDenis;
        difference = salaryAfterIncrease * 12 - salaryDenis * 12;
        System.out.println("Denis now gets " + salaryAfterIncrease + "rub.\nHis annual income grew by " + difference +
                "rub.");

        salaryAfterIncrease = (salaryKristina / 100) * 10 + salaryKristina;
        difference = salaryAfterIncrease * 12 - salaryKristina * 12;
        System.out.println("Masha now gets " + salaryAfterIncrease + "rub.\nHer annual income grew by " + difference +
                "rub.");
    }
}
