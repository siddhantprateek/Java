package Queues.QueueImplementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Queue {
    public int front = -1, rear = -1;
    public int size = 0;
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
    }

     public boolean isEmpty(){
        return (front == -1);
    }

    public boolean isFull(){
        return (rear == size - 1);
    }

    public void delete(ArrayList<Integer> list, int index){
        list.remove(index);
    }





}
