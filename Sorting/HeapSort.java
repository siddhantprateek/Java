package Sorting;

public class HeapSort {
    public static void main(String[] args){
        int[] Array = {4, 3, 1, 7, 8, 10, 2};
        heapSort(Array);
        printArray(Array);

    }
    public static void heapSort(int[] Array){

        for (int i = Array.length/ 2 - 1; i >= 0; i--){
            heapify(Array, Array.length, i);
        }

        for (int i = Array.length - 1; i > 0; i--){
            int temp = Array[0];
            Array[0] = Array[i];
            Array[i] = temp;

            heapify(Array, i, 0);
        }
    }

    public static void heapify(int[] Array, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && Array[left] > Array[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && Array[right] > Array[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = Array[i];
            Array[i] = Array[largest];
            Array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(Array, n, largest);
        }
    }
    public static void printArray(int[] Array) {
        for (int j : Array) {
            System.out.print(j + "  ");
        }
    }

}
