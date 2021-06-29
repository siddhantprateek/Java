# Sorting Algorithm

### Insertion Sort
In insertion sort we take a element and arrange in sorted array, where the left most part of the array is sorted and right most part are unsorted 
* Each item is picked and swapped into the sorted left part of the array until `Array[j] < Array[j - 1]`
* The index should not be less then zero.

_Worst complexity: n^2_
_Average complexity: n^2_
_Best complexity: n_
_Space complexity: 1_

```java
for (int i = 1; i < Array.length; i++){  
    int j = i;  
    while(j > 0 && Array[j] < Array[j - 1]){  
        swap(j, j - 1, Array);  
        j--;  
    }  
}
```
### Bubble Sort
_Worst complexity: n^2_ 
_Average complexity: n^2_
_Best complexity: n_
_Space complexity: 1_
```java
for (int i = 0; i < n-1; i++) {  
    for (int j =0; j < n-i-1; j++) {  
        if (arr[j] > arr[j+1]) { 
            swap(arr[j], arr[j + 1]);  
        }  
    }  
}
```
### Merge Sort
_Worst complexity: n*log(n)_
_Average complexity: n*log(n)_
_Best complexity: n*log(n)_
_Space complexity: n_

```java
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
```

### Heap Sort
HeapSort Algorithm uses a binary tree. HeapSort comprises of two steps:
* Insert data to Binary heap Tree
* Extract data from Binary Heap
Binary heap is best suited for an Array, it does not work with LinkedList.

**Binary Heap** is a binary tree with special properties
- The value of any given node must be less or equal of its children (min heap)
- The value of any given node must be greater or equal of its children(max Heap)