package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class HelperFunctions extends Rectangle{
    public HelperFunctions(double a, double b) {
        super(a, b);
    }

    public static void compareRectangles(Rectangle rectangle1, Rectangle rectangle2){
        if (rectangle1.getPerimeter() > rectangle2.getPerimeter()){
            System.out.println("parameter 1 > parameter 2");
        } else if (rectangle2.getPerimeter() > rectangle1.getPerimeter()){
            System.out.println("parameter 2 > parameter 1");
        } else {
            System.out.println("parameter 1 = parameter 2");
        }
    }
}
