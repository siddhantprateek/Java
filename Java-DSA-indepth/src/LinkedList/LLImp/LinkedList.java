package LinkedList.LLImp;

import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node (int data){
        val = data;
        next = null;
    }
}


public class LinkedList {
    public static Node head;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter No. of Entries: ");
        int times = input.nextInt();
        System.out.print("Enter Values:");
        while(times > 0){
//            int val = input.nextInt();
            insert(input.nextInt());
            times--;
        }

        display();
        insertAtBeginning(80);
        insertAtAnyPosition(15, 3);
        display();
    }

    // insertion
    public static void insert(int value){
        Node new_node= new Node(value);
        new_node.next = null; // this can be ignored as in the constructor it is already
        // assigned to null.
        if(head == null){
            head = new_node;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }
    // insertion at beginning
    public static void insertAtBeginning(int value){
        Node node = new Node(value);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }
    // insertion at Any Position
    public static void insertAtAnyPosition(int value, int position){
        if(head == null){
            System.out.println("LinkedList is empty");
        }
        Node node = new Node(value);
        Node temp = head, adjacent;
        for(int i = 1; i < position; i++){
            temp = temp.next;
        }
        adjacent = temp.next;
        temp.next = node;
        node.next = adjacent;
    }
    // deletion at Beginning
    public static void deleteAtBeginning(int value){
        if(head == null){
            System.out.println("LinkedList is Empty");
        }else{
            head = head.next;
        }
    }

    // deletion at end
    public static void deleteFromEnd(){
        if(head == null){
            System.out.println("LinkedList is Empty");
        }else if(head.next == null){
            head = null;
        }else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    // deletion at any position
    public static void deleteAtPosition(int position){

    }
    // display
    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

