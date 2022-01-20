package Hard;

import java.util.Scanner;

public class Print_Maze_Paths {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print_Maze_Paths(n, m, "");
    }

    private static void print_Maze_Paths(int n, int m, String str) {
        if(n==0 && m==0){
            System.out.println(str);
            return;
        }
        if(m>0) {
            print_Maze_Paths(n, m - 1, str + "h");
        }
        if(n>0) {
            print_Maze_Paths(n - 1, m, str + "v");
        }
    }
}
