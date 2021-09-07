package Recursion.Permutation;

import java.util.ArrayList;

public class Permute {
    public static ArrayList<String> Permutation = new ArrayList<>();
    public static void main(String[] args){
        String str = "abc";
        permute(str, 0, str.length());
        System.out.print(Permutation.toString());
    }

    public static String swapString(String str, int i, int j){
        char[] result = str.toCharArray();
        char ch = result[i];
        result[i] = result[j];
        result[j] = ch;
        return String.valueOf(result);
    }



    public static void permute(String str, int start, int end){
        if(start == end - 1){
//            System.out.println(str);
            Permutation.add(str);
        }

        for(int i = start; i < end; i++){
            str = swapString(str, start, i);
            permute(str, start + 1, end);
//          Backtracking
            str = swapString(str, start, i);
        }
    }
}
