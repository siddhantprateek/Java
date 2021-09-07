package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ArrayMethods {
    public static void main(String[] args){
        int[] intArray = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray);
        // will print the reference value of intArray
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArrayString);

        //Create an ArrayList from an array
        String[] stringArray = {"a", "b", "c", "d", "e"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.print(arrayList+"\n");

        // Check if an array contains a certain value
        // String[] stringsArray = {"a", "b", "c", "d", "e"};
        boolean b = Arrays.asList(stringArray).contains("b");
        boolean c = Arrays.asList(stringArray).contains("f");
        System.out.println(b);
        System.out.println(c);

        // Concatenate two arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

//todo      arraycopy (Object source, int source_position, Object destination, int destination_position, int length)
        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);

        System.out.println(Arrays.toString(result));

        // Joins the elements of the provided array into a single String
//        String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
//        System.out.println(j);

//        Convert an ArrayList to an array
        String[] stringArray1 = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayLists = new ArrayList<String>(Arrays.asList(stringArray1));
        String[] stringArr = new String[arrayLists.size()];
        arrayList.toArray(stringArr);
        for (String s : stringArr)
            System.out.print(s + " ");
        System.out.println();

        // Convert an array to a set
        String[] stringArray2 = { "a", "b", "c", "d", "e", "e", "e", "a", "A"};
        Set<String> set = new HashSet<String>(Arrays.asList(stringArray2));
        System.out.println(set);

        //Reverse an array
        // int[] intArray2 = { 1, 2, 3, 4, 5 };
        // Arrays.reverse(intArray2);
        System.out.println(Arrays.toString(intArray));
    }
}
