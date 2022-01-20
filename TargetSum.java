package Hard;

import java.util.ArrayList;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        targetSum(arr, 0, target, 0, new ArrayList<Integer>());
    }

    private static void targetSum(int[] arr, int i, int target, int sum, ArrayList<Integer> arrayList) {

        if(i == arr.length){
            if(sum == target)
                System.out.println(arrayList);
            return;
        }

        targetSum(arr, i+1, target, sum, arrayList);
        int k = arr[i];
        arrayList.add(k);
        targetSum(arr, i+1, target,sum+k, arrayList);
        arrayList.remove(arrayList.size()-1);
    }
}