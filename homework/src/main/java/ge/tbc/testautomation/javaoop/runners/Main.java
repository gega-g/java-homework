package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;


public class Main {
    public static void main(String[] args){

        //rectangle area, perimeter
        Rectangle rectangle1 = new Rectangle(2,6);
        System.out.println("Area of rectangle: "+rectangle1.getArea());
        System.out.println("Perimeter of rectangle: "+rectangle1.getPerimeter());

        //triangle area,perimeter
        Triangle triangle = new Triangle(1,2,4,5);
        System.out.println("Area of triangle: "+triangle.getArea());
        System.out.println("Perimeter of triangle: "+triangle.getPerimeter());

        //BONUS(სტატიკური ფუნქცია)
        System.out.println(staticMethod());

        //rectangle2 შესადარებლად (ბონუს დავალება)
        Rectangle rectangle2 = new Rectangle(7,3);
        HelperFunctions.compareRectangles(rectangle1, rectangle2);
    }
//  იმედია სწორია "BONUS(სტატიკური ფუნქციაც)."-ის შესასრულებლად ;დ
    public static String staticMethod() {
        return "This is a static method";
    }
}
