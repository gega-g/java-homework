package ge.tbc.testautomation.javaoop.figures;

public class Figure {
    public double getArea(){
        return -1.0;
    }
    public double getPerimeter(){
        return -1.0;
    }
    public static int numberOfInstances;
    public Figure(){
        numberOfInstances++;
    }
}
