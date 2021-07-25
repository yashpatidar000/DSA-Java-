import java.util.*;
public class buyandsell3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();   
        }
        int fee=sc.nextInt();
        
        int obsp=-arr[0];
        int ossp=0;
        for(int i=1;i<n;i++){
            int nbsp=0;
            int nssp=0;
            if(ossp-arr[i] > obsp){
               nbsp=ossp-arr[i];
            }
            else{
                nbsp=obsp;
            }
            
            if((arr[i]-fee) + obsp > ossp){
                nssp = arr[i] + obsp - fee;
            }else{
                nssp=ossp;
            }
            obsp=nbsp;
            ossp=nssp;
        }
        System.out.println(ossp);
    }
}
