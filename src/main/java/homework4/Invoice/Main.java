package homework4.Invoice;

public class Main {
    public static void main(String[] args) {
        String model = "";
        String description = "";
        int count = 0;
        double price = 0;
        double invAmount = 0;

        Invoice invoice = new Invoice(model,description,count,price);

        invoice.setModel("Modem");
        invoice.setDescription("S1294");
        invoice.setCount(50);
        invoice.setPrice(450);

        invAmount = invoice.getAmount(invoice.getPrice(), invoice.getCount());
        System.out.println("Сумма счета: " + invAmount + " лей.");
    }
}
