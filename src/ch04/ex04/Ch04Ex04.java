package ch04.ex04;

public class Ch04Ex04 {
    public static void main(String[] args) {
        System.out.println(Ch04Ex04.class.getSimpleName());
        Circle circle = new Circle(new Point(0, 0), 10);
        System.out.println(circle.getCenter());
        Rectangle rectangle = new Rectangle(new Point(0, 0), 10, 10);
        System.out.println(rectangle.getCenter());
        Line line = new Line(new Point(0, 0), new Point(10, 10));
        System.out.println(line.getCenter());
    }
}
