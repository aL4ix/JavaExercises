package ch03.ex06;

public interface Sequence<T> {
    boolean hasNext();

    T next();
}