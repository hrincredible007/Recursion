package Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class getKeypadConfiguration {
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
        hashMap.put(9, ".;");

        ArrayList<String> result = getKeypadConfig(hashMap, String.valueOf(n));

        System.out.println(result+"\n"+result.size());
    }

    private static ArrayList<String> getKeypadConfig(HashMap<Integer, String> hashMap, String n){

        if(n.length() == 1){
            int num = Integer.parseInt(n);
            String getIt = hashMap.get(num);
            ArrayList<String> baseCase = new ArrayList<>();
            for (int i = 0; i < getIt.length(); i++) {
                char ch = getIt.charAt(i);
                baseCase.add(ch+"");
            }
            return baseCase;
        }

        char ch = n.charAt(n.length()-1);
        String str = n.substring(0,n.length()-1);
        String get = hashMap.get(Character.getNumericValue(ch));
        ArrayList<String> rec = getKeypadConfig(hashMap, str);

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < get.length(); i++) {
            char chh = get.charAt(i);

            for (String e: rec) {
                String wd = e+ chh;
                result.add(wd);
            }
        }
        return result;

    }

}
