package Easy;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci_Series(n- 1));
    }


    private static int fibonacci_Series(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fibonacci_Series(n-1)+ fibonacci_Series(n-2);
    }// 0 1 1 2 3 5 8 13 21 34 55
}