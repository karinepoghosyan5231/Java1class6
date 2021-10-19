package com.company;

public interface Queue<T> {

    void addFirst(T obj);

    void addLast(T obj);

    void add(T obj);

    void removeFirst();

    void removeLast();

    void push(T obj);

    void pop(T obj);

    boolean offerFirst(T obj);

    boolean offerLast(T obj);

    T poll();

    T pollFirst();

    T pollLast();
}
