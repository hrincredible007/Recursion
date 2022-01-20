package Medium;

import java.util.Scanner;

/*
            Input:
                    2
            Output:
                    2	1	1	1	2	1	1	1	2


*/

public class Print_Zig_Zag {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printZigZag(n);
    }

    private static void printZigZag(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+"\t");
        printZigZag(n-1);
        System.out.print(n+"\t");
        printZigZag(n-1);
        System.out.print(n+"\t");
    }
}
