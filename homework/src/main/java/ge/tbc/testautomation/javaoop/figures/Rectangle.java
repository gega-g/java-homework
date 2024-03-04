package ge.tbc.testautomation.javaoop.figures;

import java.util.Comparator;

public class Rectangle extends Figure{
    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private double a;
    private double b;

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public void printPackageName() {

    }

    public double getPerimeter() {
        return 2 * (a + b);
    }
}
