package Easy;

import java.util.Scanner;

public class First_Occurrence_In_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int ele = sc.nextInt();
        int ind = first_Occurrence(arr, 0, ele);
        System.out.println(ind);
    }

    private static int first_Occurrence(int[] arr, int index, int ele) {
        if(arr[index] == ele){
            return index+1;
        }
        if(index == arr.length-1){
            return -1;
        }
        return first_Occurrence(arr, index+1, ele);
    }
}
