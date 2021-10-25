package pro.sky.java.course1.homework.lesson.conditional;

public class IncreasedTasks {
    public static void main(String[] args) {
        task6(19, 58_000);
        task7(27, 48_000, 80_000);
    }

    public static void task6(int age, int salary){
        float limit = salary;

        if (age >= 23){
            limit *= 3;
            System.out.println("Limit = " + limit);
            getIncreaseLimit(salary, limit);
        } else if (age < 23 ){
            limit *= 2;
            System.out.println("Limit = " + limit);
            getIncreaseLimit(salary, limit);
        }
    }

    public static void task7(int age, int salary, float wantedSum){
        float monthPay;
        float maxMonthPay = salary / 2f;
        int timeCredit = 12;
        float baseRate = (wantedSum / 100f) * 10;

        monthPay = ( wantedSum / timeCredit ) + getRate(age, baseRate, salary, wantedSum);

        if (monthPay > maxMonthPay){
            System.out.println("Maximum salary payment " + salary + " is equal to " + maxMonthPay + "rub.\n" +
                    "Loan payment by credit " + monthPay + "rub. Denied.");
        } else {
            System.out.println("Maximum salary payment " + salary + " is equal to " + maxMonthPay + "rub.\n" +
                    "Loan payment by credit " + monthPay + "rub. Approved.");
        }
    }

    private static void getIncreaseLimit(int salary, float limit){
        if (salary >= 50_000 && salary < 80_000){
            System.out.println("We are ready to issue you a credit card with a limit " + limit * 1.2 + "rub.");
        } else if (salary >= 80_000){
            System.out.println("We are ready to issue you a credit card with a limit " + limit * 1.5 + "rub.");
        }
    }

    private static float getRate(int age, float baseRate, int salary, float wantedSum){
        if(age < 23){
            baseRate = baseRate + wantedSum / 100;
        } else if (age < 30){
            baseRate = baseRate + (wantedSum / 100) / 2;
        }

        if (salary > 80_000){
            baseRate = baseRate - wantedSum * 0.007f;
        }
        return baseRate;
    }
}
