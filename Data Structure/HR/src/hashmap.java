import java.util.*;
import java.io.*;
public class hashmap {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.nextLine();
//        String ss = br.readLine();
       HashMap<Character, Integer> hm = new HashMap<>();
       for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           if(hm.containsKey(c)){
               int val = hm.get(c);
               val++;
               hm.put(c, val);
           }else{
               hm.put(c, 1);
           }
       }
       int max=Integer.MIN_VALUE;
       char a = s.charAt(0);
       for(char c: hm.keySet()){
           if(hm.get(c) > max){
               max=hm.get(c);
               a=c;
           }
       }
        System.out.println(a);
    }
}
