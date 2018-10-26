package domain.adt;

import java.util.Stack;

public class MyList<T> implements MyListInterface<T> {
    Stack<T> list;

    public MyList() {
        list = new Stack<T>();
    }

    @Override
    public void add(T v) {
        list.add(v);
    }

    @Override
    public T pop() {
        return list.pop();
    }


    @Override
    public String toString() {
        String listString = "";
        for (T e : list) {
            listString = listString + e.toString() + "\n";
        }
        return listString;
    }

    @Override
    public int size() {
        return list.size();
    }


    public Stack<T> getList() {
        return list;
    }
}
