package LinkedList;

import java.util.*;
public class UtilsLinkedList {

    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(4);
        ll.add(2);
        ll.add(6);
        ll.add(7);
        ll.add(23);
        ll.add(12);
        ll.add(1);
        ll.add(5);

        System.out.println(ll);

        ll.addFirst(9);
        ll.addLast(78);
        ll.getFirst();
        ll.getLast();
        System.out.println(ll);
        System.out.println(ll.getClass().getName());
        System.out.println(ll.getClass().getSimpleName());
    }
}
