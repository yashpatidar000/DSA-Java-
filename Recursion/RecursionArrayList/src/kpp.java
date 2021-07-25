
import java.io.*;
import java.util.*;

public class kpp {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {

        if (str.length()==0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char c = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforc = codes[c - '0'];
        for (int i = 0; i < codeforc.length(); i++) {
            char cchar = codeforc.charAt(i);
            for (String rstr : rres) {
                mres.add(cchar + rstr);
            }
        }

        return mres;
    }

}
