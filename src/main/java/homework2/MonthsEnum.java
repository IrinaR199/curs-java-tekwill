package homework2;

public class MonthsEnum {

    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL,
        MAY, JUNE, JULY, AUGUST,
        SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void run() {
        System.out.println("Месяцы календарного года:");
        for (Month month : Month.values()) {
            System.out.println(month);
        }
    }
}
