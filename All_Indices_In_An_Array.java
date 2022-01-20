package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class All_Indices_In_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int [] a = index_All(arr, element, 0, 0);
        System.out.println(Arrays.toString(a));

    }

    private static int[] index_All(int[] arr, int element, int index, int esf) {
        if(arr.length == index){
            return new int[esf];
        }
        int[] newArr;
        if(arr[index] == element){
            newArr = index_All(arr, element, index + 1, esf + 1);
            newArr[esf] = index;
        }
        else{
            newArr = index_All(arr, element, index + 1, esf);

        }

        return newArr;
    }
}
