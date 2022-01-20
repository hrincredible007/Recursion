package Hard;

import java.util.Scanner;

public class Print_Encodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print_Encodings(str, "");
    }

    private static void print_Encodings(String str, String s) {

        if(str.length() == 0){
            System.out.println(s);
            return ;
        }
        else if(str.length() == 1){
            char ch = str.charAt(0);
            if(ch == '0'){

                return;
            }
            else{
                int val = ch - '0';
                char valInChar = (char) ('a'+val-1);
                str = str.substring(1);
                print_Encodings(str, s+valInChar);
            }
        }

        else{
            char ch = str.charAt(0);
            if(ch == '0'){
                return ;
            }
            int val = ch - '0';
            char valInChar = (char) ('a'+val-1);
            print_Encodings(str.substring(1), s+valInChar);

            String ss = str.substring(0,2);
            int tt = Integer.parseInt(ss);
            char valInChar12 = (char) ('a'+tt-1);
            print_Encodings(str.substring(2),s+valInChar12);


        }


    }
}
