package Easy;

import java.util.Scanner;

public class printing1Ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1toN(n);
    }

    private static void print1toN(int n) {
        if(n==0){
            return;
        }
        print1toN(--n);
        System.out.println(n+1);
    }
}