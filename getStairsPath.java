package Hard;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = getStairsRoute(n);
        System.out.println(list);
    }

    private static ArrayList<String> getStairsRoute(int n) {

        if(n==0){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }
        else if(n<0){
            return new ArrayList<>();
        }

        ArrayList<String> res1 = getStairsRoute(n-1);
        ArrayList<String> res2 = getStairsRoute(n-2);
        ArrayList<String> res3 = getStairsRoute(n-3);

        ArrayList<String> result = new ArrayList<>();
        for (String e: res1) {
            result.add(e+ "1");
        }
        for (String e: res2) {
            result.add(e+ "2");
        }
        for (String e: res3) {
            result.add(e+ "3");
        }
        return result;
    }

}
