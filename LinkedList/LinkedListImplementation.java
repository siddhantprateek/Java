package LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createLinkedList(5);
        // System.out.println(sLL.head.value);
        sLL.insertLinkedList(6, 1);
        sLL.insertLinkedList(7, 3);
        sLL.insertLinkedList(8, 4);
        sLL.insertLinkedList(9, 0);
        sLL.searchNode(7);
        sLL.TraverseLinkedList();
//        sLL.deleteLL();
        sLL.deletionOfNode(2);
        sLL.TraverseLinkedList();
    }
    public static class Node {
        public int value;
        public Node next = null;
    }

    public static class SingleLinkedList {
        public Node head;
        public Node tail;
        public int size;

        // Time O(1) and space O(1)
        public Node createLinkedList(int value) {
            head = new Node();
            Node node = new Node();
//            node.next = null;

            node.value = value;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        // insert Method
        // if inserting at beginning O(1)
        // Time O(n) and space O(1)
        public void insertLinkedList(int value, int location) {
            // providing the value a node like structure
            Node node = new Node();
            node.value = value;

            if (head == null) {
                createLinkedList(value);
                return;
            } else if (location >= size) {
                // while removing the comment makes sure to remove null declaration of next
                // from the Node class.
//                node.next = null;
                tail.next = node;
                tail = node;
            } else {
                Node tempNode = head;
                int index = 0;
                while (index < location - 1) {
                    tempNode = tempNode.next;
                    index++;
                }
                Node nextNode = tempNode.next;
                tempNode.next = node;
                node.next = nextNode;
            }
            size++;
        }

        // Single LinkedList Traversal
        // Time O(n) and space O(1)
        public void TraverseLinkedList(){
            if (head == null){
                System.out.print("Linked List Does Node Exist");
            }else{

                Node temp = head;
                for (int i = 0; i < size; i++){
                    System.out.print(temp.value);
                    if (i != size- 1){
                        System.out.print("->");
                    }
                    temp = temp.next;
                }
                System.out.print("->Null \n");
            }
        }
        // Search node
        // Time O(n) and space O(1)
        boolean searchNode(int nodeValue) {
            if (head != null) {
                Node tempNode = head;
                for (int i=0; i<size; i++) {
                    if (tempNode.value == nodeValue) {
                        System.out.print("Found the node at location: " +i+"\n");
                        return true;
                    }
                    tempNode = tempNode.next;
                }
            }
            System.out.print("Node not found! ");
            return false;
        }

        // Deletion of Node
        // Time O(n) and space O(1)
        public void deletionOfNode(int location){
            if(head == null){
                System.out.print("Linked List Does Node Exist");
                return;
            }else if (location == 0){
                head = head.next;
                size--;
                if (size == 0){
                    tail = null;
                }
            }else if(location >= size){
                Node temp = head;
                for(int i = 0; i < size - 1; i++){
                    temp = temp.next;
                }
                if (temp == head){
                    tail = head = null;
                    size --;
                }
            }else{
                Node temp = head;
                for (int i = 0; i < location - 1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }
        // deletion of entire linked list
        // Time O(1) and space O(1)
        public void deleteLL(){
            head = null;
            tail = null;
            System.out.println("The SLL deleted successfully");
        }

    }

}