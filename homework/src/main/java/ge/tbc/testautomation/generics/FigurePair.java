package ge.tbc.testautomation.generics;

import ge.tbc.testautomation.javaoop.figures.Figure;

public class FigurePair<E extends Figure, T extends Figure> {
    private E elementOne;
    private T elementTwo;

    @Override
    public String toString() {
        return "FigurePair{" +
                "elementOne=" + elementOne +
                ", elementTwo=" + elementTwo +
                '}';
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }
    public E getElementOne() {
        return elementOne;
    }
    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    public T getElementTwo() {
        return elementTwo;
    }
    public FigurePair(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }
}