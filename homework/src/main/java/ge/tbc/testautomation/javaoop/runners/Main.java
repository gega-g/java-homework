package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;

import java.util.Random;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
//        radius exception
        try {
            Circle circle = new Circle(-2);
        } catch (RadiusException radiusException) {
            System.out.println(radiusException.getMessage());
        }

//        limit exception
        System.out.println();
        try {
            Random random = new Random();
            for(int i = 0; i<=5; i++){
                double radius = (random.nextDouble()*10);
                new Circle(radius);
            }
        } catch (LimitException limitException) {
            System.out.println(limitException.getMessage());
        }

//        string operations
        System.out.println();
        String str = "Test Automation Bootcamp 6, 2022";

//        automation to lower case
        System.out.println(str.toLowerCase().substring(5,15));
        System.out.println();

//        every word on new line
        String[] partedStr = str.split(" ");
        for (String part : partedStr) {
            System.out.println(part);
        }
        System.out.println();

//        length of sentence
        System.out.println(str.length());
        System.out.println();

//        changing whitespaces with -
        System.out.println(str.replaceAll(" ", "-"));
        System.out.println();

//        creating phone numbers
        String[] phoneNumbersForTest = {"555-55-55-55", "599-990124", "245221245"};
        for (String phoneNumber : phoneNumbersForTest) {
            System.out.println(phoneNumber.replaceAll("-", "") + " - " + phoneNumberValidation(phoneNumber));
        }
    }
    private static boolean phoneNumberValidation(String phoneNumber){
        return Pattern.matches( "(555|595|592|599)\\d{6}", phoneNumber.replaceAll("-",""));
    }
}