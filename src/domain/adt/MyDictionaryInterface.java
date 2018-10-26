package domain.adt;

public interface MyDictionaryInterface<T1, T2>  {
    void add(T1 v1, T2 v2);

    void update(T1 v1, T2 v2);

    T2 lookup(T1 id) throws RuntimeException;

    boolean isDefined(String id);

    boolean contains(T1 v);

    int size();

    void setValue(T1 v1, T2 v2);

    String toString();
}
