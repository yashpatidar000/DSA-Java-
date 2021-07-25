import java.util.*;
import java.io.*;
public class gce2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
            if(hm.containsKey(a1[i])){
                hm.put(a1[i], 2);
            }else{
                hm.put(a1[i], 1);
            }
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
            if(hm.containsKey(a2[i]) && hm.get(a2[i])>0){
                System.out.println(a2[i]);
                int val = hm.get(a2[i]);
                val--;
                hm.put(a2[i], val);
            }
        }
        
//        HashMap<Integer,Integer> hm = new HashMap<>();
        
    }
}
