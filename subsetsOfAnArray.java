package Medium;

import java.util.*;

public class subsetsOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{1, 2, 3};
        // GenerateAll the subArrays of this array 'nums';


        List<List<Integer>> listFinal = new ArrayList<>();
        int n = (int)Math.pow(2, nums.length);
        for(int i = 0; i< n ;i++){
            int temp = i;
            Deque<Integer> list = new ArrayDeque<>();
            for (int j = nums.length -1; j >=0; j--) {
                if(temp%2 ==1){
                    list.addFirst(nums[j]);
                }
                temp = temp/2;
            }
            List<Integer> list2 = new ArrayList<>(list);
            listFinal.add(list2);
        }
        System.out.println(listFinal);
        listFinal.sort((o1, o2) -> Math.max(o1.size(), o2.size()));
        System.out.println(listFinal);
    }


}
