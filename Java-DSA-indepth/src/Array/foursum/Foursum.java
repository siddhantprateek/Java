package Array.foursum;

import java.util.*;

public class Foursum {
    public static List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length - 4; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < nums.length - 3; j++){

                int secondaryTarget = target - nums[i] - nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while(left > right){
                    int sum = nums[left] + nums[right];
                    if((sum == secondaryTarget)){
                        set.add(Arrays.asList(nums[i],
                                nums[j],
                                nums[left],
                                nums[right]));
                    }else if(sum < secondaryTarget){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args){

        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.print(fourSum(nums, target));

    }

}
