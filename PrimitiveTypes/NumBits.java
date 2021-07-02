package PrimitiveTypes;

public class NumBits {
    public static void main(String[] args){
        for( int i = 0; i < 100; i++ ){
            System.out.print(countBits(i) + " ");
        }
        System.out.println();
    }

    public static short countBits(int x){
        short numBits = 0;
        while(x != 0){
            numBits += (x & 1);
            x >>>= 1;
        }
        return numBits;
    }
}
