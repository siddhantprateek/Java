package Searching.BinarySearch;

public class Main {
    public static void main(String[] args){
        BinarySearch Bsearch = new BinarySearch();
        int[] nums = {7, 48, 9, 3, 76, 36, 8, 39, 86, 7};
        int target = 77;
        System.out.println(target + " status : " + Bsearch.binary_search(nums, target));
    }
}
