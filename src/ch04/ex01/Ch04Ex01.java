package ch04.ex01;

public class Ch04Ex01 {
    public static void main(String[] args) {
        System.out.println(Ch04Ex01.class.getSimpleName());
        LabeledPoint labeledPoint = new LabeledPoint("Label", 0, 0);
        System.out.println(labeledPoint);
    }
}
