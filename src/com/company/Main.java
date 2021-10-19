package com.company;

public class Main {

    public static void main(String[] args) {
        //linked list object creation
        //call of functions to check!
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(8);
        linkedList.add(20);
        linkedList.add(33);
        linkedList.add(24);
        linkedList.add(25);
        linkedList.add(90);
        linkedList.add(100);
        System.out.println(linkedList);
        System.out.println(linkedList.size);

        linkedList.remove(1);
        System.out.println(linkedList);

        linkedList.remove(6);
        System.out.println(linkedList);

        System.out.println(linkedList.contains(100));

        //double linked list object creation
        //call of functions to check!
        MyDoubleLinkedList doubleLinkedList = new MyDoubleLinkedList<>();
        doubleLinkedList.add(5);
        doubleLinkedList.add(14);
        doubleLinkedList.add(93);
        doubleLinkedList.add(45);
        doubleLinkedList.add(91);
        doubleLinkedList.add(66);
        System.out.println(doubleLinkedList);
        doubleLinkedList.remove(1);

        doubleLinkedList.remove((Integer) 14);
        System.out.println(doubleLinkedList);

        doubleLinkedList.remove((Integer) 66);
        System.out.println(doubleLinkedList);

        System.out.println(doubleLinkedList.size);

        System.out.println(doubleLinkedList.contains(93));

        doubleLinkedList.addFirst(8);
        System.out.println(doubleLinkedList);

        doubleLinkedList.addLast(300);
        System.out.println(doubleLinkedList);

        doubleLinkedList.removeFirst();
        System.out.println(doubleLinkedList);


        doubleLinkedList.removeLast();
        System.out.println(doubleLinkedList);

        doubleLinkedList.push(9);
        System.out.println(doubleLinkedList);

        doubleLinkedList.pop(9);
        System.out.println(doubleLinkedList);

        doubleLinkedList.removeFirst();
        System.out.println(doubleLinkedList);

        doubleLinkedList.offerFirst(6);
        doubleLinkedList.offerLast(5);
        System.out.println(doubleLinkedList);

        System.out.println(doubleLinkedList.poll());
        System.out.println(doubleLinkedList);
        System.out.println(doubleLinkedList.pollFirst());
        System.out.println(doubleLinkedList);
        System.out.println(doubleLinkedList.pollLast());
        System.out.println(doubleLinkedList);






    }
}
