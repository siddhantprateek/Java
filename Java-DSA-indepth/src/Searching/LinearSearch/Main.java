package Searching.LinearSearch;

public class Main {
    public static void main(String[] args){
        int[] arr = {2, 4, 11, 7, 8, 15, 21, 12};
        LinearSearch ls = new LinearSearch();
        int target = 10;
        System.out.println(target + " is found at index: " + ls.find(arr, target));
    }
}
