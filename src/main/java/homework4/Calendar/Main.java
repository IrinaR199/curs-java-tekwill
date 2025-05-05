package homework4.Calendar;

public class Main {
    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 0;


        Date data = new Date(day, month, year);

        data.setDay(31);
        data.setMonth(5);
        data.setYear(2025);

        day = data.getDay();
        month = data.getMonth();
        year = data.getYear();

        data.displayDate(day, month, year);
    }
}
