package ch03.ex05;

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