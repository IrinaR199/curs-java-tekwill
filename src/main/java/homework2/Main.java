package homework2;

import homework2.TemperatureConverter.TemperatureConverter;

public class Main {
    public static void main(String[] args) {

        //1.Enums
        //MonthsEnum.run();

        //2. WeekDays
        //System.out.println("Is FRIDAY a holiday - " + Weekdays.Weekday.FRIDAY.isHoliday());
        //System.out.println("Is THURSDAY a working day - " + Weekdays.Weekday.THURSDAY.IsWorkDay());
        //Weekdays.run();

        //3. Converting Strings to Primitive
        //StringToPrimitive.run();

        //4. Calculating circles area
        //Circle circle = new Circle(5.0);
        //circle.calculateArea();

        //5. Converting Temperature Fahrenheit <--> Celsius
        TemperatureConverter converter1 = new TemperatureConverter();

        double tempCelsius = 25;
        double tempFahr = 77;

        double convertedToF = converter1.toFahrenheit(tempCelsius);
        double convertedToC = converter1.toCelsius((tempFahr));

        System.out.printf("%.2f°C = %.2f°F%n", tempCelsius, convertedToF);
        System.out.printf("%.2f°F = %.2f°C%n", tempFahr, convertedToC);
    }
}
