package ch04.ex05;

public class Line extends Shape {
    Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((point.getX() + to.getX()) / 2, (point.getY() + to.getY()) / 2);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
