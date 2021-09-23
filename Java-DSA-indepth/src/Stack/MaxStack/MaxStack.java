package Stack.MaxStack;

import java.util.Stack;

public class MaxStack {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> max = new Stack<Integer>();

    public MaxStack(){

    }
    public void push(int val){
        stack.push(val);

        if(max.isEmpty()){
            max.push(val);
        }else{
            max.push(Math.max(val, max.peek()));
        }
    }

    public int pop(){
        max.pop();
        return stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int popMax(){
        int res = max.peek();
        Stack<Integer> tmp = new Stack<Integer>();

        while(stack.peek() != res){
            tmp.push(stack.pop());
            max.pop();
        }
        stack.pop();
        max.pop();
        while(!tmp.isEmpty()){
            push(tmp.pop());
        }
        return res;
    }


}

