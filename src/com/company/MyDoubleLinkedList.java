package com.company;

import java.util.NoSuchElementException;

public class MyDoubleLinkedList<Integer> implements MyList<Integer>, Queue<Integer> {
    Node<Integer> first;
    Node<Integer> last;
    int size;

    public class Node<Integer> {
        Integer value;

        Node<Integer> next;
        Node<Integer> previous;

        public Node(Integer value) {
            this.value = value;
        }

    }

    @Override
    public Integer get(int index) {
        if (first == null) {
            return null;
        }
        if (index == 0) {
            return first.value;
        }

        Node<Integer> current = first;
        for (int i = 0; i <= size - 1; i++) {
            if (i == index - 1) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void addFirst(Integer value) {
        Node<Integer> node = new Node<>(value);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        } else {
            first.previous = node;
            node.next = first;
            first = node;
            size++;
        }
    }

    @Override
    public void addLast(Integer obj) {
        Node<Integer> node = new Node<>(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        } else {
            last.next = node;
            node.previous = last;
            last = node;
            size++;
        }

    }

    @Override
    public void add(Integer value) {
        Node<Integer> node = new Node<>(value);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        node.previous = last;
        last = node;
        size++;

    }

    @Override
    public void removeFirst() {
        if (first == null) {
            return;
        } else {
            first = first.next;
            first.previous = null;
            size--;
        }
    }

    @Override
    public void removeLast() {
        if (first == null) {
            return;
        } else {
            last = last.previous;
            last.next = null;
            size--;
        }
    }

    @Override
    public void push(Integer obj) {
        addFirst(obj);
    }

    @Override
    public void pop(Integer obj) {
        if (first.value.equals(obj))
            removeFirst();
    }

    @Override
    public boolean offerFirst(Integer obj) {
        int count = size;
        addFirst(obj);
        if (count + 1 == size) {
            return true;
        }
        return false;
    }

    @Override
    public boolean offerLast(Integer obj) {
        int count = size;
        addLast(obj);
        if (count + 1 == size) {
            return true;
        }

        return false;
    }

    @Override
    public Integer poll() {
        if (first == null) {
            return null;
        }
        Integer current = first.value;
        removeFirst();
        return current;
    }

    @Override
    public Integer pollFirst() {
        return poll();
    }

    @Override
    public Integer pollLast() {
        if (last == null) {
            return null;
        }
        Integer current = last.value;
        removeLast();
        return current;
    }

    @Override
    public void remove(int index) {
        if (first == null) {
            return;
        }
        if (index > size) {
            return;
        }
        if (first == last) {
            size--;
            return;
        }
        if (index == 0 || index == 1) {
            first = first.next;
            first.previous = null;
            size--;
            return;
        }

        if (index == size) {
            last = last.previous;
            size--;
            return;
        }
        Node<Integer> current = first;
        for (int i = 0; i < size; i++) {
            if (i == index - 2) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }


    @Override
    public boolean remove(Integer value) {
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(value)) {
                remove(i + 1);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Integer value) {
        if (first.value.equals(value)) {
            return true;
        }
        Node<Integer> current = first;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<Integer> current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if (i < size - 1) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }


}
