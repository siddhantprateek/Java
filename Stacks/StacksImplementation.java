package Stacks;

import java.util.*;

public class StacksImplementation {
    public static void main(String[] args){
        
    }

    Queue<Integer> stack;
    Queue<Integer> dummyStack;

    // in java the constructor name is same as class name
    public StacksImplementation(){
        
        stack = new ArrayDeque<>();
        dummyStack = new ArrayDeque<>();
    }


    public void push(int value){
        stack.add(value);
    }

    public int pop(){

        if (stack.size() == 0){
            return -1;
        }
        
        // to pouring the entire stack into dummy
        while(stack.size() != 1){
            dummyStack.add(stack.remove());
        }

        int popped = stack.remove(); 
        
        stack = dummyStack;
        // dummy is re-initialized
        dummyStack = new ArrayDeque<>();

        return popped;
    }


    public int top(){
        if(stack.size() == 0){
            return -1;
        }

        while(stack.size() != 1){
            dummyStack.add(stack.remove());
        }

        int topElement = dummyStack.peek();
        stack = dummyStack;
        dummyStack = new ArrayDeque<>();
        return topElement;
    }


    public boolean Empty(){
        return stack.isEmpty();
    }
}
