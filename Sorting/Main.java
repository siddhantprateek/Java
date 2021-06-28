package Sorting;

public class Main {
    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        int[] arr = {10, 5, 30, 15, 50, 6, 22, 11, 16};
        bs.bubbleSort(arr);
        bs.printArray(arr);
    }
}
