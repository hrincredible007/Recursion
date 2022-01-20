package Hard;

import java.util.Scanner;

public class print_Subsequences_of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        printSubsequences(str, "");
    }

    private static void printSubsequences(String str, String s) {
        if(str.length() == 0){
            System.out.println(s);
            return;
        }

        char ch = str.charAt(0);
        String rest = str.substring(1);
        printSubsequences(rest,s+"");
        printSubsequences(rest,s+ch);

    }
}
