
import java.util.ArrayList;
import java.util.Scanner;

/*public class Stairs{
public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = stairs(n);
        System.out.println(ans);
    }

    public static ArrayList<String> stairs(int n)
    {
    
    if(n==0)
    {
        ArrayList<String> bres = new ArrayList<>();
        bres.add("");
        return bres;
    }else if(n<0)
    {
        ArrayList<String> bres = new ArrayList<>();
        return bres;
    }
    
    
    ArrayList<String> nm1 = stairs(n-1);
    ArrayList<String> nm2 =  stairs(n-2); 
    ArrayList<String> nm3 =  stairs(n-3); 
    
    ArrayList<String> mres = new ArrayList<>();
    
    for(String psf:nm1)
    {
    mres.add(psf + 1);
    }
    
    for(String psf:nm2)
    {
    mres.add(psf + 2);
    }
    
    for(String psf:nm3)
    {
    mres.add(psf + 3);
    }
    return mres; 
    }
}*/

public class Stairs {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int ans = stairs(n, new int[n + 1]);
        int ans = countpathtab(n);
        System.out.println(ans);
    }

    public static int stairs(int n, int[] qb) {

        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else if (qb[n] != 0) {
            return qb[n];
        }

        int nm1 = stairs(n - 1, qb);
        int nm2 = stairs(n - 2, qb);
        int nm3 = stairs(n - 3, qb);
        int tcount = nm1 + nm2 + nm3;

        qb[n] = tcount;

        return tcount;
    }
    
    public static int countpathtab(int n) {

        int[] dp = new int[n+1];
        dp[0] = 1;
        
        for(int i=1;i<=n;i++)
        {
        if(i==1)
        {dp[i]=dp[i-1];}
        
        else if(i==2)
        {dp[i]=dp[i-1] + dp[i-2];}
        
        else
        {
        dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        }
        
        return dp[n];
    }
}
