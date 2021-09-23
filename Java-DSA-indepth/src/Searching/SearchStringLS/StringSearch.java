package Searching.SearchStringLS;

public class StringSearch {
    boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (int idx = 0; idx < str.length(); idx++){
            if(target == str.charAt(idx)){
                return true;
            }
        }
        return false;
    }

    boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (char ch: str.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        return false;
    }


}
