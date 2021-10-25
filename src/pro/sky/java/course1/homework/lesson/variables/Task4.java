package pro.sky.java.course1.homework.lesson.variables;

public class Task4 {
    public static void main(String[] args) {
        float loseWeight = 7.0f;
        float quarterLoseWeight = 0.25f;
        float halfLoseWeight = 0.5f;

        float daysLoss250 = loseWeight / quarterLoseWeight;
        float daysLoss500 = loseWeight / halfLoseWeight;
        float daysAverage = (daysLoss250 + daysLoss500) / 2;

        System.out.println("With a daily weight loss of 250gr, you need " + daysLoss250 + " days.");
        System.out.println("With a daily weight loss of 500gr, you need " + daysLoss500 + " days.");
        System.out.println("Losing weight on average will take " + daysAverage + " days.");
    }
}
