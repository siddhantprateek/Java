package BinaryTree.LevelOrderTraversal;

import com.sun.source.tree.Tree;

import java.util.Queue;
import java.util.LinkedList;
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
