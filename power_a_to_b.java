package Easy;

import java.util.Scanner;

public class power_a_to_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = pow(a, b);
        System.out.println(result);
    }


//Method 1: O(n)

    private static int power(int a, int b) {
        if(b==0){
            return 1;
        }
        return a*power(a,--b);
    }
//Method 2: O(log(n))
    private static int pow(int a, int b){
        if(b ==0){
            return 1;
        }
        int k = pow(a, b/2);
        if(b%2 ==0) {
            return k * k;
        }
        else{
            return k * k * a;
        }
    }
}