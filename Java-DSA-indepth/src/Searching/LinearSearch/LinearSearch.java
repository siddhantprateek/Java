package Searching.LinearSearch;

public class LinearSearch {

    int find(int[] nums, int target){
        for(int idx = 0; idx < nums.length; idx++){
            if(nums[idx] == target){
                return idx;
            }
        }
        return -1;
    }
}
