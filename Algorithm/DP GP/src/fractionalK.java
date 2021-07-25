import java.util.*;

public class fractionalK {
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
        
        int f[]=new int[n];
        for(int i=0;i<n;i++)
        {
            f[i]=v[i]/w[i];
        }
        
        
        for(int i=0;i<cap;i++)
        {
        
        }
        System.out.println(dp[cap]);
    }
}
