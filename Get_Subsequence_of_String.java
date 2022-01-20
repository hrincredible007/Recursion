package Hard;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Subsequence_of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();// abc
        ArrayList<String> list = subSequence(str);
        System.out.println(list);
    }
    //Method 1:

    //Faith: bc ->   b-, --, bc, -c
    //Expectation: abc ->  -b-, ---, -bc, --c, ab-, a--, abc, a-c
    private static ArrayList<String> subSequence(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char firstCharacter = str.charAt(0);//a
        String restString = str.substring(1);//bc
        ArrayList<String> resultRecursion = subSequence(restString);

        ArrayList<String> finalAnswer = new ArrayList<>();
        for (String e: resultRecursion) {
            finalAnswer.add(""+e);
        }
        for (String e: resultRecursion) {
            finalAnswer.add(firstCharacter+e);
        }
        return finalAnswer;
    }

    //Method 2:
}
