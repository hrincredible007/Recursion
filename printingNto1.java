package Easy;

import java.util.Scanner;
public class printingNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNTo1(n);
    }

    private static void printNTo1(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNTo1(--n);
    }
}
