package ch04.ex05;


public class Ch04Ex05 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(Ch04Ex05.class.getSimpleName());
        Circle circle = new Circle(new Point(0, 0), 10);
        Circle circle2 = circle.clone();
        circle2.getPoint().setX(-1);
        System.out.println(circle.getCenter());
        System.out.println(circle2.getCenter());
        Rectangle rectangle = new Rectangle(new Point(0, 0), 10, 10);
        Rectangle rectangle2 = rectangle.clone();
        rectangle2.getPoint().setX(-1);
        System.out.println(rectangle.getCenter());
        System.out.println(rectangle2.getCenter());
        Line line = new Line(new Point(0, 0), new Point(10, 10));
        Line line2 = line.clone();
        line2.getPoint().setX(-1);
        System.out.println(line.getCenter());
        System.out.println(line2.getCenter());
    }
}
