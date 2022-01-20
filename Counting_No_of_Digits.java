package Easy;

import java.util.Scanner;

public class Counting_No_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countDigits(n));
    }

    private static int countDigits(int n) {
        if(n/10 ==0){
            return 1;
        }
        return 1+ countDigits(n/10);
    }
}