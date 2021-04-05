package ch02.ex07;

/**
 * MutatorPoint class, it represent a point with coordinates X and Y
 *
 * @author alaix
 */
public class MutatorPoint {
    private double x;
    private double y;

    /**
     * No-args constructor so a Point can be created at the origin
     */
    MutatorPoint() {
    }

    /**
     * Constructor with X and Y coordinates
     *
     * @param x
     * @param y
     */
    MutatorPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the value for x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the value for y
     */
    public double getY() {
        return y;
    }

    /**
     * @param tx is the value to translate the coordinate x of the Point
     * @param ty is the value to translate the coordinate y of the Point
     * @return
     */
    void translate(double tx, double ty) {
        x += tx;
        y += ty;
    }

    /**
     * @param s is the factor coordinates are going to be scale with
     * @return
     */
    void scale(double s) {
        x *= s;
        y *= s;
    }

    /**
     * Converts the Point to a String so it can be printed
     */
    @Override
    public String toString() {
        return String.format("%f %f", x, y);
    }
}
