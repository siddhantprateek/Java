package Searching.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    boolean binary_search(int[] nums, int target){
        if(nums.length == 0){
            return false;
        }

        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = (start + end)/ 2;
            if(target == nums[mid]){
                return true;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
