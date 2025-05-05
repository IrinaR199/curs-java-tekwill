package homework4.Invoice;

public class Invoice {
    private String model;
    private String description;
    private int count;
    private double price;

    //constructor
    public Invoice(String model, String description, int count, double price) {

        if (count < 0) count = 0;
        if (price < 0) price = 0;

        this.model = model;
        this.description = description;
        this.count = count;
        this.price = price;
    }

    //getters
    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    //setters

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCount(int count) {
        if (count < 0) count = 0;
        this.count = count;
    }

    public void setPrice(double price) {
        if (price < 0) price = 0;
        this.price = price;
    }

    public double getAmount(double price, int count) {
        double total = price * count;
        return total;
        //System.out.println("Сумма счета: " + total);
    }
}
