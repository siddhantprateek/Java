# Binary Search Tree

Binary Search Tree is a basically a binary tree with additional properties
- In the left subtree the value of a node is less than the or equal to its parent node's value.
- In the right subtree the value of a node is greater that its parent node's value.


<p align="center">
    <img src="https://blog.penjee.com/wp-content/uploads/2015/11/binary-search-tree-sorted-array-animation.gif" atl="BST">
</p>

Binary Search does stores the index of its data elements, instead it relys on implicit data structures keep the record of where the each element is. 
 - Seaching, Deletion and Insertion takes _O(n)_ time.



 ## Implementation of Binary Search Tree
 ```java
 public class BinarySearchTree {
    public class BinaryNode {
        // declare left child and right child
        public int value;
        public int height;
        public BinaryNode left;
        public BinaryNode right;       
 }

    BinaryNode root;
    
    BinarySearchTree(){
        root = null; ---------------------------------------------------> O(1)
    }


 ```
 or
```java
class Node
{
    int data;
    Node left, right;
    
    // Function to create a new binary tree node having a given key
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
```
In Python
```python
class TreeNode:
    def __init__(self, val):
        self.value = val
        self.left, self.right = None, None

class BST():
    def __init__(self):
        self.root = None

    def insert(self, val):
        self.root = self.insertHelper(self.root, val)
```


 ### Inserting a Node
 ```java
private BinaryNode insert(BinaryNode currentNode, int value){
        if (currentNode == null){---------------------------------------------------> O(1)            |
            BinaryNode newNode = new BinaryNode();                                                    | 
            newNode.value = value; -------------------------------------------------> O(1)            |
            System.out.println("the value is successfully inserted"); --------------> O(1)            |
            return newNode; --------------------------------------------------------> O(1)            |
        }
                                                                                                     |   O(log(N))            
        System.out.println("comparing...");                                                           |      
        if(value <= currentNode.value){ ---------------------------------------------> O(1)           |                  
            currentNode.left = insert(currentNode.left, value); ---------------------> O(N/2)         |              
            return currentNode; -----------------------------------------------------> O(1)           |          
        }else{                                                                                        |                  
            currentNode.right = insert(currentNode.right, value); -------------------> O(N/2)         |                  
            return currentNode; -----------------------------------------------------> O(1)           |              
        }
        
    }

void insert(int value){
        root = insert(root, value);
    }

 ```
 or
 ```java
 public static Node insert(Node root, int key)
    {
        // if the root is null, create a new node and return it
        if (root == null) {
            return new Node(key);
        }
 
        // if the given key is less than the root node,
        // recur for the left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        // otherwise, recur for the right subtree
        else {
            // key >= root.data
            root.right = insert(root.right, key);
        }
 
        return root;
    }
 ```

## PreOrder Traversal (Java)
<p align="center">
    <img src="https://upload.wikimedia.org/wikipedia/commons/a/ac/Preorder-traversal.gif" atl="PreOrder">
</p>
Problems:

[144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)

```java
 public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public void traverse(TreeNode node, List<Integer> list){
        if (node == null){
            return;
        }
        list.add(node.val); ---------------------------------> ✔
        traverse(node.left, list);
        traverse(node.right, list);
    }
```
Comparing to Python
```python
def preorderTraversal(self, root: TreeNode) -> List[int]:
        self.result = []
        
        def getpreOrder(node):
            if node == None:
                return

            self.result.append(node.val)
            getpreOrder(node.left)
            getpreOrder(node.right)
            
        getpreOrder(root)
        return self.result 
```

## InOrder (Java)
<p align="center">
    <img src="https://upload.wikimedia.org/wikipedia/commons/4/48/Inorder-traversal.gif" atl="PreOrder">
</p>
Problems:

[94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
```java
 public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public void traverse(TreeNode node, List<Integer> list){
        if (node == null){
            return;
        }
        traverse(node.left, list);
        list.add(node.val); ---------------------------------> ✔
        traverse(node.right, list);
    }
```

## PostOrder (Java)

<p align="center">
    <img src="https://upload.wikimedia.org/wikipedia/commons/2/28/Postorder-traversal.gif" atl="PostOrder">
</p>

Problems:

[145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)
```java
 public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public void traverse(TreeNode node, List<Integer> list){
        if (node == null){
            return;
        }
        traverse(node.left, list);
        traverse(node.right, list);
        list.add(node.val); ---------------------------------> ✔
    }
```
Extra Problems

- [ ] Construct BST from given preorder traversal | Set 1
- [ ] Construct BST from given preorder traversal | Set 2
- [ ] Binary Tree to Binary Search Tree Conversion
- [ ] Sorted Linked List to Balanced BST
- [ ] Sorted Array to Balanced BST
- [ ] Transform a BST to greater sum tree
- [ ] Construct all possible BSTs for keys 1 to N
- [ ] Convert a BST to a Binary Tree such that sum of all greater keys is added to every key
- [ ] BST to a Tree with sum of all smaller keys
- [ ] In-place Convert BST into a Min-Heap
- [ ] Convert BST to Min Heap
- [ ] Construct BST from its given level order traversal
- [ ] Reverse a path in BST using queue
- [ ] Binary Tree to Binary Search Tree Conversion using STL set
- [ ] Check given array of size n can represent BST of n levels or not
- [ ] Convert a normal BST to Balanced BST
- [ ] Merge Two Balanced Binary Search Trees
- [ ] Merge two BSTs with limited extra space


### Checking and Searching :

- [ ] Find the node with minimum value in a Binary Search Tree
- [ ] Check if the given array can represent Level Order Traversal of Binary Search Tree
- [ ] Check if a given array can represent Preorder Traversal of Binary Search Tree
- [ ] Lowest Common Ancestor in a Binary Search Tree
- [ ] A program to check if a binary tree is BST or not
- [ ] Find k-th smallest element in BST (Order Statistics in BST)
- [ ] Check if each internal node of a BST has exactly one child
- [ ] Check for Identical BSTs without building the trees
- [ ] K’th Largest Element in BST when modification to BST is not allowed
- [ ] K’th Largest element in BST using constant extra space
- [ ] Second largest element in BST
- [ ] K’th smallest element in BST using O(1) Extra Space
- [ ] Check if given sorted sub-sequence exists in binary search tree
- [ ] Simple Recursive solution to check whether BST contains dead end
- [ ] Check if an array represents Inorder of Binary Search tree or not
- [ ] Check if two BSTs contain same set of elements
- [ ] Largest number in BST which is less than or equal to N
- [ ] Maximum Unique Element in every subarray of size K
- [ ] Iterative searching in Binary Search Tree
- [ ] Find distance between two nodes of a Binary Search Tree
- [ ] Count pairs from two BSTs whose sum is equal to a given value x
- [ ] Find median of BST in O(n) time and O(1) space
- [ ] Largest BST in a Binary Tree | Set 2
- [ ] Remove BST keys outside the given range
- [ ] Print BST keys in the given range
- [ ] Print BST keys in given Range | O(1) Space
- [ ] Count BST nodes that lie in a given range
- [ ] Count BST subtrees that lie in given range
- [ ] Remove all leaf nodes from the binary search tree
- [ ] Sum of k sma- [ ] llest elements in BST
- [ ] Inorder Successor in Binary Search Tree
- [ ] Inorder predecessor and successor for a given key in BST
- [ ] Inorder predecessor and successor for a given key in BST | Iterative Approach
- [ ] Find if there is a triplet in a Balanced BST that adds to zero
- [ ] Find a pair with given sum in a Balanced BST
- [ ] Find a pair with given sum in BST
- [ ] Maximum element between two nodes of BST
- [ ] Find pairs with given sum such that pair elements lie in different BSTs
- [ ] Find the closest element in Binary Search Tree
- [ ] Find the largest BST subtree in a given Binary Tree
- [ ] Replace every element with the least greater element on its right
- [ ] Add all greater values to every node in a given BST

### Red Black Tree and Threaded Binary Tree :

- [ ] C Program for Red Black Tree Insertion
- [ ] Left Leaning Red Black Tree (Insertion)
- [ ] Threaded Binary Tree
- [ ] Threaded Binary Tree | Insertion
- [ ] Threaded Binary Search Tree | Deletion
- [ ] Convert a Binary Tree to Threaded binary tree | Set 1 (Using Queue)
- [ ] Convert a Binary Tree to Threaded binary tree | Set 2 (Efficient)
- [ ] Inorder Non-threaded Binary Tree Traversal without Recursion or Stack

### Misc :

- [ ] Sorted order printing of a given array that represents a BST
- [ ] Two nodes of a BST are swapped, correct the BST
- [ ] Floor and Ceil from a BST
- [ ] Given n appointments, find all conflicting appointments
- [ ] How to handle duplicates in Binary Search Tree?
- [ ] Data Structure for a single resource reservations
- [ ] How to implement decrease key or change key in Binary Search Tree?
- [ ] Print Common Nodes in Two Binary Search Trees
- [ ] Count inversions in an array | Set 2 (Using Self-Balancing BST)
- [ ] Leaf nodes from Preorder of a Binary Search Tree
- [ ] Leaf nodes from Preorder of a Binary Search Tree (Using Recursion)
- [ ] Binary Search Tree insert with Parent Pointer
- [ ] Minimum Possible value of |ai + aj – k| for given array and k.
- [ ] Rank of an element in a stream
- [ ] Special two digit numbers in a Binary Search Tree