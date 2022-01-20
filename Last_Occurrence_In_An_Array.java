package Easy;

import java.util.Scanner;
public class Last_Occurrence_In_An_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        int ind = LastOccurrence(arr, 0, ele);

        System.out.println(ind);
    }

    //Method 1
    private static int Last_Occurrence(int[] arr, int index, int ele) {
        if (arr[index] == ele) {
            return index + 1;
        }
        if (index == 0) {
            return -1;
        }
        return Last_Occurrence(arr, index - 1, ele);
    }


    //Method 2
    private static int LastOccurrence(int[] arr, int index, int ele){
        if(index == arr.length){
            return -1;
        }
        int min = LastOccurrence(arr, index+1, ele);
        if(min == -1){
            if(arr[index] == ele){
                return index;
            }
            else{
                return -1;
            }
        }
        else{
            return min;
        }
    }
}