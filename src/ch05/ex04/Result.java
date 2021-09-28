package ch05.ex04;

public interface Result<V, E> {
    static <V, E> Result<V, E> ok(final V value) {
        return new Ok(value);
    }

    static <V, E> Result<V, E> err(final E error) {
        return new Err(error);
    }
}
