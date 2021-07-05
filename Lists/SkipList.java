package Lists;


public class SkipList {
    public static void main(String[] args){

    }
    class Node{
        int val;
        int key;
        Node[] forward;
        Node(int level, int key){
            forward = new Node[level];
            this.key = key;
            this.val = 1;
        }
    }
}




