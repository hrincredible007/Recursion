package Easy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{10,25,51,54,56,68,75};
        int n = arr.length;
        int k = 68; // element to be searched...
        int position = binarySearch(arr, 0, n-1, k);
        System.out.println(position);
    }


    private static int binarySearch(int[] arr, int low, int high, int element) {
        int mid = (low+high)/2;
        if(arr[mid] == element){
            return mid;
        }
        if(low == high){
            return -1;
        }
        else if(arr[mid]< element){
            return binarySearch(arr, mid+1, high, element);
        }
        else{
            return binarySearch(arr, low, mid-1, element);
        }
    }
}
