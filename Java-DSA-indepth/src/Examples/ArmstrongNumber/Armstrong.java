package Examples.ArmstrongNumber;

public class Armstrong {

    // if xyx is number a armstrong is number x^3 + y^3 + z^3 == xyz

    boolean armstrong(int num){
        int original = num;
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;
            sum += rem*rem*rem;
        }
        return sum == original;
    }
}
