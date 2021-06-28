package Sorting;

public class SelectionSort {
    public static void main(String[] args){

        int[] arr = {10, 5, 2, 11, 16};
        selectionSort(arr);
        printArray(arr);
    }

    static void selectionSort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            int minimumIndex = j;
            for (int i = j+1; i<a.length; i++) {
                if (a[i] < a[minimumIndex]) {
                    minimumIndex = i;
                }
            }
            if (minimumIndex != j) {
                /* swapping */
                int temp = a[j];
                a[j] = a[minimumIndex];
                a[minimumIndex] = temp;
            }
        }
    }

    public static void printArray(int []array) {
        System.out.print("Sorted Array: ");
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }
}
