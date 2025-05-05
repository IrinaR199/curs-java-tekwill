package homework2.TemperatureConverter;

public class TemperatureConverter {

    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32)*5/9;
    }

    public double toFahrenheit(double celsius){
        return celsius*9/5 + 32;
    }

}
