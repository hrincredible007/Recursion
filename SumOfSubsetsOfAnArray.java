package Hard;

import java.util.Scanner;

public class SumOfSubsetsOfAnArray {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  5;
        int[] arr = new int[]{4, 3, 5, 7, 10, 2};
        int targetSum = 14;
        subsets(arr, 0, 0, targetSum);
        System.out.println(count);
    }

    private static void subsets(int[] arr, int sum, int i, int targetSum) {
        if(targetSum == sum){
            count++;
            //System.out.println();
            if(i<arr.length){
                subsets(arr, sum-arr[i-1], i, targetSum);
            }
        }
        else{
            for (int ind = i; ind < arr.length; ind++) {
                subsets(arr, sum+ arr[ind],ind +1, targetSum);
            }
        }
    }
}