package homework2;

public class Weekdays {

    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean IsWorkDay() {
            return this.ordinal() <= FRIDAY.ordinal();
        }

        public boolean isHoliday() {
            return !IsWorkDay();
        }
    }

    public static void run() {
       for (Weekday day : Weekday.values()) {
            System.out.println(day + ":\nIs Work Day - " + day.IsWorkDay() + ", Is Holiday - " + day.isHoliday());
        }

    }
}
