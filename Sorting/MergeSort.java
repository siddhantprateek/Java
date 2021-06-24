public class MergeSort {
    public static void main(String[] args){
        int[] array = {4, 3, 2, 1, 7, 8, 9, 2};
        mergeSort(array, 0, array.length - 1);
        printArray(array);
    }
    static void merge(int[] Array, int left, int middle, int right){
        int[] leftArray = new int[middle - left + 2];
        int[] rightArray = new int[right - middle + 1];
        // for (int i = 0; i <= middle - left; i++) leftArray[i] = Array[left + i];
        if (middle - left + 1 >= 0) System.arraycopy(Array, left, leftArray, 0, middle - left + 1);
        for (int i = 0; i < right - middle; i++) rightArray[i] = Array[middle + 1 + i];

        leftArray[middle - left + 1] = Integer.MAX_VALUE;
        rightArray[right - middle] = Integer.MAX_VALUE;

        int leftPointer = 0, rightPointer = 0;
        for (int k = left; k <= right; k++){

            if (leftArray[leftPointer] < rightArray[rightPointer]){
                Array[k] = leftArray[leftPointer];
                leftPointer++;
            }else{
                Array[k] = rightArray[rightPointer];
                rightPointer++;
            }
        }
    }

    public static void mergeSort(int[] array,int left, int right){
        if (right > left){
            int mid = (left + right)/ 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void printArray(int []array) {
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }
}
