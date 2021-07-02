package CodingPlatformSolutions.Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode_116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    class Solution {
        public Node connect(Node root) {
            
            if(root == null){
                return null;
            }
            Queue<Node> queue = new LinkedList<>();
            
            queue.add(root);
            
            while (!queue.isEmpty()){
                
                int size = queue.size();
                List<Node> list = new ArrayList<Node>();
                
                
                for (int i = 0;i < size; i++){
                    Node popped = queue.remove();
                    list.add(popped);
                    
                    if (i > 0){
                        Node prev = list.get(i - 1);
                        prev.next = popped;
                    }
                    
                    if (popped.left != null){
                        queue.add(popped.left);
                    }
                    if (popped.right != null){
                        queue.add(popped.right);    
                    }
                    
                }
            }
            return root;
            
            
        }
    }


    
}
