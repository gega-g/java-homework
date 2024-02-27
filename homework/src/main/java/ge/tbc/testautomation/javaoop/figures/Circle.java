package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public static int numberOfCircleInstances;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircleInstances++;

        if (numberOfCircleInstances > 5){
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }
        if (radius < 0){
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }

    }

}
