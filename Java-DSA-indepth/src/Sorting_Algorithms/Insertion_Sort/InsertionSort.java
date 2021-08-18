package Sorting_Algorithms.Insertion_Sort;

public class InsertionSort {
    public static void main(String[] args){
        int[] Array = {4, 3, 2, 1, 7, 8, 9, 2};
        insertionSort(Array);
        printArray(Array);
    }

    public static void insertionSort(int[] Array){
        for(int i = 1; i < Array.length; i++){
            int j = i;
            while(j > 0 && Array[j] < Array[j - 1]){
                swap(j, j - 1, Array);
                j--;
            }
        }
    }

    public static void swap(int i, int j, int[] Array){
        int temp = Array[i];
        Array[i] = Array[j];
        Array[j] = temp;
    }

    public static void printArray(int[] Array){
        for (int j : Array) {
            System.out.print(j + " ");
        }
    }
}
