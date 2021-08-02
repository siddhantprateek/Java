package BinaryTree;

import java.util.Arrays;


public class BinarySearchTree {
    public static TreeNode populateWithSorted(int[] nums, int start, int end){
        if (start >= end){
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = populateWithSorted(nums, start, mid);
        node.right = populateWithSorted(nums, mid + 1, end);

        return node;
    }

    public static void PrintTree(TreeNode node){
        if(node != null){
            System.out.print(node.val + " ");
            PrintTree(node.left);
            PrintTree(node.right);
        }
    }




    public static void main(String[] args){
        int[] values = {4, 5, 7, 12, 14, 1, 6, 17, 16, 21};
        TreeNode root = null;
        Arrays.sort(values);
        root = populateWithSorted(values,0, values.length);
        PrintTree(root);
    }
}
class TreeNode{
    public int val;
    TreeNode left, right;

    TreeNode(int data){
        val = data;
        left = right =null;
    }
}

