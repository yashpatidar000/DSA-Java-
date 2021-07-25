import java.util.Scanner;
        
public class goldman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
        for(int j =0;j<m;j++)
        {
        arr[i][j]=sc.nextInt();
        }
        }
        
        int dp[][] = new int[n][m];
        
        for(int j=m-1;j>=0;j--)
        {    
            for(int i=0;i<=n-1;i++)
            {
            if(j==m-1)
            {
            dp[i][j]=arr[i][j];
            }
            else if(i==0)
            {
            dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1]) + arr[i][j];
            }
            else if(i==n-1)
            {
            dp[i][j]=Math.max(dp[i][j+1],dp[i-1][j+1]) + arr[i][j];
            }
            else
            {
            dp[i][j]= arr[i][j]+ Math.max(dp[i][j+1], Math.max(dp[i-1][j+1],dp[i+1][j+1]));
            }
            }
        }
        
        int max=dp[0][0];
        for(int i=0,j=0;i<n;i++)
        {
        max = Math.max(max,dp[i][j]);
        }
        System.out.println(max);
    }
    
}
