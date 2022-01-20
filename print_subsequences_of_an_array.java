package Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class print_subsequences_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of elements in an array.
        int[] arr = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = sc.nextInt();

        }
        List<Integer> list = new ArrayList<>();
        subsequences(arr, 0, list);

    }

    private static void subsequences(int[] arr, int i, List<Integer> list) {
        if(i==arr.length){
            System.out.println(list);
            return;
        }

        list.add(arr[i]);
        subsequences(arr, i+1, list);
        list.remove(list.size()-1);
        subsequences(arr, i+1, list);

    }
}
