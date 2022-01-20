package Hard;

import java.util.Scanner;

public class Print_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        printPermutations(str, "");
    }

    private static void printPermutations(String str, String s) {
        if(str.length()==0){
            System.out.println(s);
            return;
        }
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);

            printPermutations(str.substring(0,i)+str.substring(i+1), s+ch);
        }
    }
}
