package Hard;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> result = getMazePaths(0, 0, n-1, m-1);
        System.out.println(result);
        System.out.println(result.size());
    }

    private static ArrayList<String> getMazePaths(int i1, int j1, int i2, int j2) {

        if(i1 == i2 && j1 == j2){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        ArrayList<String> horizontalPaths = new ArrayList<>();
        ArrayList<String> verticalPaths = new ArrayList<>();

        if(j1<j2){
            horizontalPaths = getMazePaths(i1, j1+1, i2, j2);
        }
        if(i1<i2) {
            verticalPaths = getMazePaths(i1 + 1, j1, i2, j2);
        }

        ArrayList<String> totalPaths = new ArrayList<>();

        for (String e: horizontalPaths) {
            totalPaths.add(e+"h");
        }
        for (String e: verticalPaths) {
            totalPaths.add(e+"v");
        }
        return totalPaths;
    }
}
