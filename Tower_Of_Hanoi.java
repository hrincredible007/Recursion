package Medium;

import java.util.Scanner;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a,b,c;
        a = sc.next().charAt(0);
        b = sc.next().charAt(0);
        c = sc.next().charAt(0);
        towerOfHanoi(n, a, b, c);


    }

    private static void towerOfHanoi(int n, char a, char b, char c) {
        if(n == 0){
            return;
        }
        towerOfHanoi(n-1, a, c, b);
        System.out.println("Move "+n+" from "+a+" to "+b);
        towerOfHanoi(n-1, c,b,a);


    }
}
