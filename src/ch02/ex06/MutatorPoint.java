package ch02.ex06;


public class MutatorPoint {
    private double x;
    private double y;

    MutatorPoint() {
    }

    MutatorPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void translate(double tx, double ty) {
        x += tx;
        y += ty;
    }

    void scale(double s) {
        x *= s;
        y *= s;
    }

    @Override
    public String toString() {
        return String.format("%f %f", x, y);
    }
}
