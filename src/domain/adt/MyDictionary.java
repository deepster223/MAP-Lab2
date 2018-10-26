package domain.adt;

import java.util.HashMap;

public class MyDictionary<T1, T2> implements
        MyDictionaryInterface<T1, T2> {
    HashMap<T1, T2> dictionary;

    public MyDictionary() {
        dictionary = new HashMap<T1, T2>();
    }


    @Override
    public void add(T1 v1, T2 v2) {
        dictionary.put(v1, v2);
    }

    @Override
    public void update(T1 v1, T2 v2) {
        dictionary.put(v1, v2);
    }

    @Override
    public T2 lookup(T1 id) throws RuntimeException {
        if (dictionary.get(id) != null) {
            return dictionary.get(id);
        }
        /*TODO: Implement MyException class.*/
        throw new RuntimeException();
    }

    @Override
    public boolean isDefined(String id) {
        return dictionary.get(id) != null;

    }

    @Override
    public boolean contains(T1 v) {
        return dictionary.get(v) != null;
    }

    @Override
    public int size() {
        return dictionary.size();
    }

    @Override
    public void setValue(T1 v1, T2 v2) {
        dictionary.put(v1, v2);
    }

    @Override
    public String toString() {
        String dictionaryString = "";
        for (HashMap.Entry<T1, T2> e : dictionary.entrySet()) {
            dictionaryString = dictionaryString + "Key: "
                    + e.getKey().toString() + e.getValue()
                    .toString();
        }

        return dictionaryString;
    }


    public HashMap<T1, T2> getDictionary() {
        return dictionary;
    }
}
