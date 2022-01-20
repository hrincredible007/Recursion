package Easy;

import java.util.Scanner;
public class Palindromic_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(checkPalindrome(str, 0)){//isPalindromeOrNot...
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }


    private static boolean checkPalindrome(String str, int low) {
        if(low>str.length()/2){
            return true;
        }
        if(!String.valueOf(str.charAt(low))
                .equalsIgnoreCase(String.valueOf
                        (str.charAt(str.length()-1-low)))){
            return false;
        }
        return checkPalindrome(str, low+1);
    }
}