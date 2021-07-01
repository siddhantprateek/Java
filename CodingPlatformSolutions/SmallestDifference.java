package CodingPlatformSolutions;

import java.util.Arrays;

public class SmallestDifference {

    public static void main(String[] args){
        int[] array1 = {1, 3, 15, 11, 2};
        int[] array2 = {23, 127, 235, 19, 8};

        System.out.println(BruteForceSolution(array1, array2));
        System.out.println(OptimalSolution(array1, array2));
    }

    public static int BruteForceSolution(int[] array1, int[] array2){
        if(array1.length == 0 || array2.length == 0){
            return -1;
        }

        int min = Integer.MAX_VALUE;
        for (int item1 : array1) {
            for (int item2 : array2) {
                if (Math.abs(item2 - item1) < min) {
                    min = Math.abs(item2 - item1);
                }
            }
        }
        return min;
    }

    public static int OptimalSolution(int[] array1, int[] array2){
        Arrays.sort(array1); // O(A log A)
        Arrays.sort(array2); // O(B log B)
        int a = 0, b = 0;
        int difference = Integer.MAX_VALUE;
        // Takes O(A + B) to find min Difference
        while(a < array1.length && b < array2.length){
            if (Math.abs(array1[a] - array2[b]) < difference){
                difference= Math.abs(array1[a] - array2[b]);
            }
            // Move to the next smaller value in any of the array.
            if (array1[a] < array2[b]){
                a += 1;
            }else{
                b += 1;
            }
        }
        return difference;
    }

}

