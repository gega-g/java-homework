package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.annotationsAndStreams.Analyzable;
import ge.tbc.testautomation.annotationsAndStreams.VariableNameAnnotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    @SuppressWarnings("unused")

    public static void main(String[] args) {
        Analyzable analyzable = new Analyzable();

        Field[] fields = analyzable.getClass().getDeclaredFields();

        List<Field> matches = new ArrayList<>();
        List<Field> nomatches = new ArrayList<>();

//        stream ვერ გამოვიყენე ამ ლისტების შესაქმნელად და ამ ლოგიკით
//        ვერც match-ებს პოულობს და ყველაფერს not matches-ში ყრის :/
        Stream<Field> streamMatches = matches.stream();
        Stream<Field> streamNoMatches = nomatches.stream();


        for (Field field : fields) {
            boolean isMatch = nameMatcher(field);
            if (isMatch){
                matches.add(field);
            }else {
                nomatches.add(field);
            }
        }
        System.out.println("Matching names: ");
        for (Field match : matches) {
            System.out.println(match.getName());
        }

        System.out.println("\nNot matching names: ");
        for (Field nomatch : nomatches) {
            System.out.println(nomatch.getName());
        }

//        creating some variables
        final int intThatImNotGonnaUse = 7;
        final String something = "something";
        boolean truth = false;

    }

//    creating method to check if annotation and parameter name matches
private static boolean nameMatcher(Field field) {
    VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
    if (annotation != null) {
        String parameter = field.getName();
        String annotationName = annotation.name();
        return parameter.equalsIgnoreCase(annotationName);
    }
    return false;
    }
}