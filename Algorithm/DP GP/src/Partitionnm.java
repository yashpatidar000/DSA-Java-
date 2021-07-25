import java.util.*;

public class Partitionnm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        if(n==0 || k==0 || k>n){
            System.out.println(0);
            return;
        }
        
        long dp[][]=new long[k+1][n+1];
        
        for(int t=1;t<=k;t++)
        {
        for(int p=1;p<=n;p++)
        {
        if(t  >   p){
          dp[t][p]=0;  
        }
        else if(t==p){
          dp[t][p]=1;  
        }
        else{
          dp[t][p] = (t * dp[t][p-1]) + (dp[t-1][p-1]);  
        }
        }
        
    }
        System.out.println(dp[k][n]);
    }
}
