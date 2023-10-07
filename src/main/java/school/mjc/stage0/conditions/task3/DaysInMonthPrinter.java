package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
        }

        if (month == 2) {
            System.out.println(28);
        }

        if (((month >= 1 && month <= 7) && month % 2 != 0) ||
                (month >= 8 && month <= 12) && month % 2 == 0) {
            System.out.println(31);
        }

        if ((month >= 4 && month <= 6) && month % 2 == 0) {
            System.out.println(30);
        }

    }
}
