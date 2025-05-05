package homework2;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга с радиусом " + radius + " = " + Math.round(area));
    }
}
