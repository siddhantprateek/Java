package Array.ThreeSumClosest;

import java.util.*;
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int closest = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i] != nums[i - 1]){
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right){
                    int sum = nums[i] + nums[left] + nums[right];
                    if(Math.abs(sum - target) < min){
                        min = Math.abs(sum - target);
                        closest = sum;
                    }
                    if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return closest;
    }


}
