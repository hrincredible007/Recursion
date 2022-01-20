package Easy;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int[] k = array_Reverse(arr, 0);
        System.out.println(Arrays.toString(k));
    }



    private static int[] array_Reverse(int[] arr, int i) {
        if(i>arr.length/2)
            return arr;
        swap(arr, i,arr.length-1-i);
        return array_Reverse(arr, ++i);
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;

    }
}
