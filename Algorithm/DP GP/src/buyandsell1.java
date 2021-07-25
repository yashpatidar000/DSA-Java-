import java.util.*;
public class buyandsell1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();   
        }
        int lsf=Integer.MAX_VALUE;
        int op=0;
        int pist=0;
        
        for(int i=1;i<n;i++){
            if(arr[i]<lsf){
                lsf=arr[i];
            }
            pist=arr[i]-lsf;
            
            if(op<pist){
                op=pist;
            }
        }
        System.out.println(op);
    }
    
}
