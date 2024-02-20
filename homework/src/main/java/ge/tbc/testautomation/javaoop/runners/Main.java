package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.Random;

import ge.tbc.testautomation.javaoop.util.Util;

public class Main {
    public static void main(String[] args){
        Random random = new Random();

        Circle circle1 = new Circle(random.nextDouble(5,10));
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle1));

        Circle circle2 = new Circle(random.nextDouble(10,15));
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle2));

        Circle circle3 = new Circle(random.nextDouble(2,25));
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle3));

        Circle circle4 = new Circle(random.nextDouble(11,34));
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle4));
        
        Circle circle5 = new Circle(random.nextDouble(7,9));
        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(Util.circleToString(circle5));
    }
}
