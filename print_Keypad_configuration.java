package Hard;

import java.util.HashMap;
import java.util.Scanner;

public class print_Keypad_configuration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "abc");
        hashMap.put(2, "def");
        hashMap.put(3, "ghi");
        hashMap.put(4, "jkl");
        hashMap.put(5, "mnop");
        hashMap.put(6, "qrst");
        hashMap.put(0, "?!");
        hashMap.put(7, "uv");
        hashMap.put(8, "wxyz");
        hashMap.put(9, ".;");//jkl  wxyz    qrst

        printKeypad_configuration(n, hashMap, "");
    }

    private static void printKeypad_configuration(int n, HashMap<Integer, String> hashMap, String res) {
        if(n == 0){
            System.out.println(res);
            return;
        }
        int rem = n%10;
        String str = hashMap.get(rem);
        n = n/10;
        for (int i = 0; i < str.length(); i++) {
            printKeypad_configuration(n, hashMap, res+str.charAt(i));
        }

    }
}
