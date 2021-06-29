package BinarySearchTree;

public class BinarySearchTree {
    
    class BinaryNode {
        // declare left child and right child
        public int value;
        public int height;
        public BinaryNode left;
        public BinaryNode right;       
}
    BinaryNode root;
    
    BinarySearchTree(){
        root = null;
    }

    private BinaryNode insert(BinaryNode currentNode, int value){
        if (currentNode == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("the value is successfully inserted");
            return newNode;
        }
        System.out.println("comparing...");
        if(value <= currentNode.value){
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        }else{
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
        
    }

    void insert(int value){
        root = insert(root, value);
    }

    public static void main(String[] args){
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        System.out.print(newBST);
    }
}
