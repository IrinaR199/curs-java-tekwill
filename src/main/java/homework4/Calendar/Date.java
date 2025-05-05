package homework4.Calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private int day;
    private int month;
    private int year;

    //constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //setters

    public void setDay(int day) {
        if (day <= 0 || day > 31) {
            throw new IllegalArgumentException(day + " - неверное значение дня месяца!");
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(day + " - неверное значение месяца!");
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (year <= 1950 || year > (LocalDate.now().getYear() )) {    //не может больше текущего года
            throw new IllegalArgumentException(day + " - неверное значение года!");
        }
        this.year = year;
    }

    public void displayDate(int day, int month, int year){

        LocalDate date1 = LocalDate.of(year,month,day);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formDate = date1.format(pattern);
        System.out.println("Дата: " + formDate);
    }
}
