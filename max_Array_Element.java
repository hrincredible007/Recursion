package Easy;

import java.util.Scanner;

public class max_Array_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = maxArray(arr, n -1);
        System.out.println(max);
    }


//Method 1
    private static int maxArray(int[] arr, int index, int max) {
        if(index == arr.length){
            return max;
        }
        if(arr[index]>max){
            max = arr[index];
        }
        return maxArray(arr, index+1, max);
    }
//Method 2
    private static int maxArray(int[] arr, int n){
        if(n==0){
            return arr[0];
        }
        return Math.max(arr[n-1], maxArray(arr, n-1));
    }
}
