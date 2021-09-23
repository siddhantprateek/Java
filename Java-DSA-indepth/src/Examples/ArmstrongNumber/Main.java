package Examples.ArmstrongNumber;

public class Main {
    public static void main(String[] args){
        Armstrong arm = new Armstrong();
        int n = 1;
        System.out.println("the number " + n + " is :" +  arm.armstrong(n));

        System.out.println("All the Armstrong Number between 100 - 1000 ");
        for (int i = 100; i < 1000; i++){
            if(arm.armstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
}
