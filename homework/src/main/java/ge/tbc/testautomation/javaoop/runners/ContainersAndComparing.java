package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.ReverseComparator;

import java.util.*;

public class ContainersAndComparing {
    public static void main(String[] args) {
        Random random = new Random();
//        creating arraylist and adding elements to it
        ArrayList<String> arrayLst = new ArrayList<>();
        arrayLst.add("555-542-231");
        arrayLst.add("555-887-987");
        arrayLst.add("555-161-143");
        arrayLst.add("555-189-6667");

//        creating iterator

        Iterator iter = arrayLst.iterator();
        System.out.println("Every element of Arraylist: ");
        while (iter.hasNext()) {
            String element = (String) iter.next();
            System.out.println(element);
        }
        System.out.println();

//        creating hashmap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Muradi", "555-542-231");
        hashMap.put("Nugzari", "555-887-987");
        hashMap.put("Ramazi", "555-161-143");
        hashMap.put("Gelodi", "555-189-6667");

//        finding whose number has number 8 in it
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            if (value.contains("8")) {
                System.out.println(key + "s number contains '8'.");
            }
        }
        System.out.println();

//        comparing circles
//        Circle კლასშივე გავუწერე toString() და compareTo() მეთოდები
        Circle circle = new Circle(15);
        Circle circle2 = new Circle(20);
        int i = circle.compareTo(circle2);
        System.out.println("compareTo output: " + i);
        System.out.println();

//        treeset task
        TreeSet treeSet = new TreeSet<>();
        for (int x = 0; x < 10; x++) {
            int radius = random.nextInt(1, 15);
            treeSet.add(new Circle(radius));
        }
        Iterator<Circle> treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()){
            Circle iterCircle = treeIterator.next();
            System.out.println("TreeSet "+iterCircle);
        }
        System.out.println();

//        hashset task
        HashSet<Circle> hashSet= new HashSet<>();
        for (int x = 0; x < 10; x++) {
            int radius = random.nextInt(1, 15);
            hashSet.add(new Circle(radius));
        }
        Iterator<Circle> hashIterator = hashSet.iterator();
        while (hashIterator.hasNext()){
            Circle iterCircle = hashIterator.next();
            System.out.println("HashSet "+iterCircle);
        }
        System.out.println();

//        rectangle reversed sort
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(0,new Rectangle(4,11));
        rectangles.add(0,new Rectangle(6,8));
        rectangles.add(0,new Rectangle(2,21));
        System.out.println("Reversed perimeter sort: ");
        Collections.sort(rectangles, new ReverseComparator());

        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getPerimeter());
        }
    }
}







