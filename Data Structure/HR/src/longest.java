import java.util.*;
import java.io.*;
public class longest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        
        HashMap<Integer,Boolean> hm = new HashMap<>();
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
            hm.put(a[i],true);
        }
        for(int val: hm.keySet()){
            if(hm.containsKey(val-1)){
                hm.put(val, false);
            }
        }
        
        int ml=0;int msp=0;
        for(int val: hm.keySet()){
            if(hm.containsKey(val) == true){
                int tl=1;
                int tsp=val;
                while(hm.containsKey(tsp+tl)){
                    tl++;
                }
                if(tl>ml){
                    ml=tl;msp=tsp;
                }
            }
        }
        while(ml>0){
            System.out.println(msp);
            msp++;ml--;
        }
    }
}
