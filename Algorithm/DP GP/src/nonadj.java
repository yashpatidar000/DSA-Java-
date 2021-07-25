import java.util.*;

public class nonadj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int inc[]=new int[n];
        int exe[]=new int[n];
        inc[0]=arr[0];
        exe[0]=0;
        
        for(int i=1;i<n;i++)
        {
        inc[i]=arr[i]+exe[i-1];
        exe[i]=Math.max(inc[i-1],exe[i-1]);
        }
        int max = Math.max(inc[n-1],exe[n-1]);
        System.out.println(max);
    }
    
}
