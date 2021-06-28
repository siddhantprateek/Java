package Stacks;

import java.util.ArrayList;
public class GenerateValidParenthesis {
    public static void main(String[] args){
        System.out.print(generateParenthesis2(5));
    }

    // method 1
    public static List<String> generateParenthesis2(int n){
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis2(c))
                    for (String right: generateParenthesis2(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        return ans;
    }

    // Method 2
    public static List<String> generateParenthesis(int n){
        List<String> combination = new ArrayList();
        generateAll(new char[2*n], 0, combination);
        System.out.print(combination);
        return combination;
    }


    public static void generateAll(char[] current, int pos, List<String> result){
        if (pos == current.length){
            if (valid(current)){
                result.add(new String(current));
            }
        }else{
                current[pos] = '(';
                generateAll(current, pos + 1, result);
                current[pos] = ')';
                generateAll(current, pos + 1, result);
            }


    }
    public static boolean valid(char[] current){
        int balance = 0;
        for (char c: current){
            if (c == 'c'){
                balance++;
            }else{
                balance--;
                if (balance < 0){
                    return false;
                }
            }
        }
        return (balance == 0);

    }

}
