package Ch03.Ex05;

@FunctionalInterface
public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    int next();

    static IntSequence constant(int n) {
        return () -> n;
    }
}