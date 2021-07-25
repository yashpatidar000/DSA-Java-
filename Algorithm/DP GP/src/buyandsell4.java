import java.util.*;
public class buyandsell4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();   
        }
        
        int bsp=-arr[0];
        int ssp=0;
        int csp=0;
        
        for(int i=1;i<n;i++)
        {
        int nbsp=0;
        int nssp=0;
        int ncsp=0;   
        if(csp-arr[i]>bsp){
            nbsp=csp-arr[i];
        }else{
            nbsp=bsp;
        }
        if(arr[i]+bsp>ssp){
            nssp=arr[i]+bsp;
        }else{
            nssp=ssp;
        }
        if(ssp>csp){
            ncsp=ssp;
        }else{
            ncsp=csp;
        }
        bsp=nbsp;
        ssp=nssp;
        csp=ncsp;
        }
        System.out.println(ssp);
        
    }
}
