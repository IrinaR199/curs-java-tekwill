package homework1.TaxCalculator;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 25.0;
        double tax = 1.2;
        int quantity = 10;
        double total = 0;
        String message = "I want to buy " + quantity + " shirt";

        if (quantity != 1) message = message + "s";
        System.out.println(message);

        total = price * quantity * tax;
        System.out.println("Total cost with tax is: " + total);
    }
}
