package Hard;

import java.util.Scanner;

public class Print_Maze_Paths_With_Jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        int m = sc.nextInt()-1;
        String str = "";
        printMazePathsWithJumps(0, 0,n,m,"");
    }

    private static void printMazePathsWithJumps(int in, int fi, int n, int m, String str) {

        if(in==n && m==fi){
            System.out.println(str);
            return;
        }

        for (int i = 1; i <= m-fi; i++) {
            printMazePathsWithJumps(in,fi+i,n,m,(str+"h"+i));
        }
        for (int i = 1; i <= n-in; i++) {
            printMazePathsWithJumps(in+i,fi,n,m,(str+"v"+i));
        }
        for (int i = 1; i <= m-fi && i<=n-in; i++) {
            printMazePathsWithJumps(in+i,fi+i,n,m,(str+"d"+i));
        }

    }
}
