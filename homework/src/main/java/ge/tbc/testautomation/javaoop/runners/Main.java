package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Circle;

public class Main {
    public static void main(String[] args) {
//        creating circle
        Circle newCircle = new Circle(10);
        System.out.println("Starting radius of a circle: "+newCircle.getRadius());

//        circle validation
        System.out.println("Such circle can exist: "+newCircle.validateCircle(newCircle));

//        current package name
        newCircle.printPackageName();

//        getting length and area of this circle
        System.out.println("Circle length:"+newCircle.getLength());
        System.out.println("Circle area: "+newCircle.getArea());

//        double sized radius
        Circle doubleSizedRadius = newCircle.returnDoubleSizedCircle(newCircle);
        System.out.println("Double sized circle radius: "+doubleSizedRadius.getRadius());

//        double sized radius circle area
        double doubleSizedArea = doubleSizedRadius.getArea();
        System.out.println("Double sized circle area: "+doubleSizedArea);

//        double sized radius circle length
        double doubleSizedLength = doubleSizedRadius.getLength();
        System.out.println("Double sized circle length: "+doubleSizedLength);

//        custom sized circle radius
//        გაორმაგების მერე ცვლადის მნიშვნელობას გაორმაგებულს იტოვებდა და აქ საწყის მნიშვნელობას ვერ ვიყენებდი სხვანაირად
        newCircle.setRadius(10);
        Circle customSizedRadius = newCircle.returnCustomSizedCircle(newCircle, 5);
        System.out.println("Custom sized circle radius : "+customSizedRadius.getRadius());

//        custom sized circle area
        double customSizedArea = customSizedRadius.getArea();
        System.out.println("Custom sized circle area: "+customSizedArea);

//        custom sized circle length
        double customSizedLength = customSizedRadius.getLength();
        System.out.println("Custom sized circle length: "+customSizedLength);
    }
}