package Hard;

import java.util.Scanner;

public class Print_Stairs_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_Stairs_path(n, "");
    }

    private static void print_Stairs_path(int n, String s) {
        if(n==0){
            System.out.println(s);
            return;
        }
        if(n<0){
            return;
        }

        print_Stairs_path(n-1, s+"1");
        print_Stairs_path(n-2, s+"2");
        print_Stairs_path(n-3, s+"3");

    }
}
