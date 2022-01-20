package Hard;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_Paths_With_Jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> result = getMazePathWithJumps(n-1, m-1, 0, 0);
        System.out.println(result);
    }

    private static ArrayList<String> getMazePathWithJumps(int n, int m, int i, int j) {

        if(n==i && m==j){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> totalPaths = new ArrayList<>();
        for (int hp = 1; hp <= m- j ; hp++) {
            ArrayList<String> hPaths = getMazePathWithJumps(n, m, i, j+hp);
            for (String h: hPaths) {
                totalPaths.add("h"+hp+h);
            }
        }
        for (int vp = 1; vp <= n- i ; vp++) {
            ArrayList<String> vPaths = getMazePathWithJumps(n, m, i+vp, j);
            for (String v: vPaths) {
                totalPaths.add("v"+vp+v);
            }
        }
        for (int dp = 1; dp <= m- j && dp <= n-i ; dp++) {
            ArrayList<String> dPaths = getMazePathWithJumps(n, m, i+dp, j+dp);
            for (String d: dPaths) {
                totalPaths.add("d"+dp+d);
            }
        }
        return totalPaths;
    }
}
