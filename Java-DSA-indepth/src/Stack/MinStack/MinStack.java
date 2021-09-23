package Stack.MinStack;

import java.util.Stack;

class MinStack {
    Stack<Node> stack;
    class Node{
        int value;
        int min;
        Node(int value, int min){
            this.value = value;
            this.min = min;
        }
    }

    public MinStack(){
        stack = new Stack<>();
    }

    public void push(int value){
        if(stack.isEmpty()){
            stack.push(new Node(value, value));
        }else{
            int min = Math.min(stack.peek().min, value);
            stack.push(new Node(value, min));
        }
    }

    public void pop(){
        stack.pop();
    }

    public int top(){
        return stack.peek().value;
    }

    public int getMin(){
        return stack.peek().min;
    }

    public static void main(String[] args){
        MinStack obj = new MinStack();
        obj.push(20);
        obj.push(6);
        obj.push(30);
        obj.push(5);
        obj.push(50);
        obj.pop();
        obj.pop();
        obj.pop();
        obj.push(2);
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println(param_4 + " : " + param_4);
    }


}


