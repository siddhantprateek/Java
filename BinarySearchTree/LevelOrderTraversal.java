package BinarySearchTree;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    public int val;
    TreeNode left, right;
    TreeNode(int data){
        val = data;
        left = right = null;
    }
}

public class LevelOrderTraversal {
    public static void levelOrder(TreeNode root){
        // Breadth first Search
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode popped = queue.remove();
            System.out.print(popped.val + " ");
            if(popped.left != null){
                queue.add(popped.left);
            }
            if(popped.right != null){
                queue.add(popped.right);
            }
        }
    }


    public static void main(String[] args){

        TreeNode root = null;
        levelOrder(root);
    }
}
