package ge.tbc.testautomation.javaoop.figures;

public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircleInstances++;

    }
    public static int numberOfCircleInstances;
}
