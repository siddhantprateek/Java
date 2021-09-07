package Recursion.Subset;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args){
        List<List<Integer>> list = new ArrayList<>();
        int[] nums = {1, 2, 3};
        Subset(list, nums, 0, new ArrayList<>());
        System.out.println(list);
    }

    public static void Subset(List<List<Integer>> result, int[] nums, int index, ArrayList<Integer> sub){

        result.add(new ArrayList<>(sub));
        for(int i=index; i < nums.length; i++){
            sub.add(nums[i]);
            Subset(result, nums, i + 1, sub);
            sub.remove(sub.size() - 1);
        }
    }
}
