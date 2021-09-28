package ch05.ex04;

public class Err<V, E> implements Result<V, E> {
    private final E error;

    public Err(E error) {
        this.error = error;
    }

    public E getError() {
        return error;
    }
}
