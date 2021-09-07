package LinkedList.PalindromChecker;
import java.util.Scanner;


class Node{
    int val;
    Node next;
    Node(int data){
        val = data;
        next = null;
    }
}


public class LinkedList {
    public static Node head = null;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int times = input.nextInt();
        while(times-- > 0){
            insert(input.nextInt());
        }

        boolean check = palindromeCheck(head);
        System.out.print("is it a Palindrome: " + check);
    }


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

    public static boolean palindromeCheck(Node root){
        Node ptr1 = head;
        Node ptr2, temp = null;
        while(ptr1 != null){
            ptr2 = head;
            while(ptr2.next != temp){
                ptr2 = ptr2.next;
            }
            if(ptr1.val != ptr2.val){
                return false;
            }
            ptr1 = ptr1.next;
            temp = ptr2;
        }
        return true;
    }

}
