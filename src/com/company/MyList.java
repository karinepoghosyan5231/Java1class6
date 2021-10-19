package com.company;

import java.util.Iterator;
import java.util.ListIterator;

public interface MyList<T> {
    T get(int index);

    void add(T obj);

    void remove(int index);

    boolean remove(T obj);

    int size();

    boolean contains(T obj);



}
