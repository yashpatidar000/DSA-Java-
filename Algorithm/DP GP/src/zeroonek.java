import java.util.*;

public class zeroonek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[]=new int[n];
        for(int i=0;i<n;i++)
        {
        v[i]=sc.nextInt();
        }
        int w[]=new int[n];
        for(int i=0;i<n;i++)
        {
        w[i]=sc.nextInt();
        }
        int cap=sc.nextInt();
        
        int dp[][]=new int[n+1][cap+1];
        
        
        for(int i=1;i<dp.length;i++)
        {
        for(int j=1;j<dp[0].length;j++)
        {
            if(j>=w[i-1])
            {
                if(dp[i-1][j-w[i-1]] + v[i-1] > dp[i-1][j])
                {
                    dp[i][j]=dp[i-1][j-w[i-1]] + v[i-1];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
            else
            {
                dp[i][j]=dp[i-1][j];
            }
        }
        }
        System.out.println(dp[n][cap]);
    }
}
