package Ch02.Ex05;

public class AccessorPoint {
    private double x;
    private double y;

    AccessorPoint() {
    }

    AccessorPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    AccessorPoint translate(double tx, double ty) {
        return new AccessorPoint(x + tx, y + ty);
    }

    AccessorPoint scale(double s) {
        return new AccessorPoint(x * s, y * s);
    }

    @Override
    public String toString() {
        return String.format("%f %f", x, y);
    }
}

