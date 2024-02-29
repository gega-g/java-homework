package ge.tbc.testautomation.javaoop.figures;

import java.util.Comparator;

public class ReverseComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        return Double.compare(r2.getPerimeter(), r1.getPerimeter());
    }
}
