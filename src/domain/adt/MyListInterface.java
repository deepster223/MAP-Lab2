package domain.adt;

public interface MyListInterface<T> {
    void add(T v);

    T pop();

    String toString();

    int size();
}
