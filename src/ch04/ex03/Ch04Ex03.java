package ch04.ex03;

public class Ch04Ex03 {
    public static void main(String[] args) {
        System.out.println(Ch04Ex03.class.getSimpleName());
        LabeledPoint labeledPoint = new LabeledPoint("Label", 0, 0);
        System.out.println(labeledPoint);
        System.out.println(LabeledPoint.getXAndY(labeledPoint));
    }
}
