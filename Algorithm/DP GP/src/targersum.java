import java.util.*;

public class targersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        int tar = sc.nextInt();
        
        boolean dp[][]=new boolean[n+1][tar+1];
        
        for(int i=0;i<dp.length;i++)
        {
        for(int j=0;j<dp[0].length;j++)
        {
        if(i==0 && j==0)
        {
        dp[i][j]=true;
        }
        else if(i==0)
        {
         dp[i][j]=false;   
        }
        else if(j==0)
        {
         dp[i][j]=true;
        }
        else
        {
            if(arr[i-1]==j)
        {dp[i][j]=true;}
           
            else if(dp[i-1][j]==true)
        {dp[i][j]=true;}
           
            else if(dp[i-1][j-arr[i-1]]==true)
        {dp[i][j]=true;}    
        }
        }
        }
        
        
        
        for(int i=1;i<dp.length;i++)
        {
        for(int j=1;j<dp[0].length;j++)
        {
          if(dp[i][tar]==true)  
          {
              System.out.println(true);
          }
          else
          {System.out.println(false);}
        }
        }
    }
}
