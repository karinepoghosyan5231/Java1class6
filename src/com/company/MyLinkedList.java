package com.company;

public class MyLinkedList<Integer> implements MyList<Integer> {
    Node<Integer> first;
    Node<Integer> last;
    int size;

    private class Node<Integer> {
        Integer value;

        Node<Integer> next;

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
    public void add(Integer value) {
        Node<Integer> node = new Node<>(value);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        } else {
            last.next = node;
            last = node;
            size++;
        }

    }



    @Override
    public void remove(int index) {
        if (first == null) {
            return;
        }
        if (index > size) {
            return;
        }

        if (index == 0 || index == 1) {
            first = first.next;
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
