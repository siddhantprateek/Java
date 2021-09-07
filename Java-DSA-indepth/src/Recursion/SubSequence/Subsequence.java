package Recursion.SubSequence;

import java.util.*;
import java.util.ArrayList;

public class Subsequence {
    public static ArrayList<String> subSequences = new ArrayList<>();
    public static void main(String[] args){
        String str = "abc";
        subSequence(str, "", 0);
        System.out.println(subSequences);
        System.out.println("Total No. of SubSequence: "+ subSequences.size());

    }

    public static void subSequence(String unproc, String proc, int index){
        if(unproc.length() == index){
            subSequences.add(proc);
            return;
        }
        char ch = unproc.toCharArray()[index];
        subSequence(unproc, proc, index + 1);
        subSequence(unproc, proc + ch, index + 1);

    }
}
