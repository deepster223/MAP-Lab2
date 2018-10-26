package domain.adt;

public interface MyStackInterface<T> {
    T pop();

    void push(T v);

    boolean isEmpty();

    int size();

    String toString();
}
