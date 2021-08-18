package ch04.ex02;

import ch04.ex01.LabeledPoint;

public class Ch04Ex02 {
    public static void main(String[] args) {
        System.out.println(Ch04Ex02.class.getSimpleName());
        LabeledPoint labeledPoint = new LabeledPoint("Label", 0, 0);
        System.out.println(labeledPoint);
        Point point = new Point(1, 1);
        System.out.println(point);
    }
}
