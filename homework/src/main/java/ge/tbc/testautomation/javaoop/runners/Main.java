package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
//        any pair
//        პრობლემა: toList ვერ გამოვიყენე შესაბამისად რომ დაპრინტვის დროს სწორად იმუშაოს, ბევრნაირად ვცადე მაგრამ ალბათ თვითონ
//        toList-ის ტანშია შეცდომა. ვერ გავიგე რაშია პრობლემა და იქნებ გასწორების დროს კომენტარად დამიწეროთ როგორ უნდა მექნა <3

        AnyPair <Integer,String> objOne = new AnyPair<>(19, "test obj1");
        AnyPair<Integer, String> objTwo = new AnyPair<>(6, "test obj2");

        AnyPair<Field[], Field[]> anyPair = getDeclaredFields(objOne,objTwo);

        System.out.println("object one:"+ Arrays.toString(anyPair.getElementOne()));
        System.out.println("object two:"+ Arrays.toString(anyPair.getElementTwo()));


//      circle and rectangle figure pair
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);
        Rectangle rectangle1 = new Rectangle(12,15);
        Rectangle rectangle2 = new Rectangle(6,1);

        FigurePair<Circle, Rectangle> pair1 = new FigurePair<>(circle1,rectangle1);
        FigurePair<Circle, Rectangle> pair2 = new FigurePair<>(circle2,rectangle2);

        System.out.println();
        System.out.println(pair1);
        System.out.println(pair2);
    }

//     Arrays.asList
    private static <T> T[] toList(T[] array){
        List<T> lst = asList(array);
        return lst.toArray(array);
    }

//    creating getDeclaredFields
    private static <K,D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] objOneField = objOne.getClass().getDeclaredFields();
        Field[] objTwoField = objTwo.getClass().getDeclaredFields();
        return new AnyPair<>(objOneField,objTwoField);
    }
}