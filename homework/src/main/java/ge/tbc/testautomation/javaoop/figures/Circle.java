package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;

public class Circle extends Figure implements IResizableCircle, IValidCircle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        Package packageName = this.getClass().getPackage();
        System.out.println("Package name: "+packageName.getName());
    }

    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        circle.radius *=2;
        return circle;

    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byvValue) {
        circle.radius *= byvValue;
        return circle;
    }

    @Override
    public boolean validateCircle(Circle circle) {
        return circle.radius > 0;
    }
}
