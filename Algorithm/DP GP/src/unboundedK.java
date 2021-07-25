import java.util.*;

public class unboundedK {
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
        
        int dp[]=new int[cap+1];//8
        dp[0]=0;
        
        for(int j=1;j<dp.length;j++)
        { int max=0;  
        for(int i=0;i<n;i++)//n=5
        {
            
            if(j>=w[i])
            {
                int rbagc = j-w[i];
                int rbagv = dp[rbagc];
                int tbagv = rbagv + v[i];
                if(tbagv>max)
                {
                    max=tbagv;
                }
            }
        }
        dp[j]=max;
        }
        System.out.println(dp[cap]);
    }
}
