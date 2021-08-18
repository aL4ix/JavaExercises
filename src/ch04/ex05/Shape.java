package ch04.ex05;

public abstract class Shape implements Cloneable {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.setX(point.getX()+dx);
        point.setY(point.getY()+dy);
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public abstract Point getCenter();

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Shape cloned = (Shape) super.clone();
        cloned.point = point.clone();
        return cloned;
    }
}
