package Hard;

import java.util.Scanner;

public class Flood_Fills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][m];
        floodFills(arr, 0, 0, "", visited);
    }

    private static void floodFills(int[][] arr, int i, int j, String pathSoFar, boolean[][] visited) {

        if(i<0 || j<0 || i> arr.length-1 || j> arr[0].length-1 || arr[i][j] == 1 || visited[i][j]){
            return;
        }
        if(i == arr.length-1 && j == arr[0].length-1){
            System.out.println(pathSoFar);
            return;
        }
        visited[i][j] = true;
        floodFills(arr, i-1, j, pathSoFar+"t", visited);
        floodFills(arr, i, j-1, pathSoFar+"l", visited);
        floodFills(arr, i+1, j, pathSoFar+"d", visited);
        floodFills(arr, i, j+1, pathSoFar+"r", visited);
        visited[i][j] = false;
    }
}
