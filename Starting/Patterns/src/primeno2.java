/*import java.util.*;

public class primeno2{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int m = sc.nextInt();
        
        for(int i=n; i<=m;i++)
        {
            //int m1 = sc.nextInt();
            
        int count = 0;
        for(int j=2;j*j<=m;j++)
        {
        //i=n++;
        if(i%j==0)
        {
            count++;
            break;
        }
        }
        if(count==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
        }
    }
}*/

import java.util.*;

public class primeno2{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=n; i<=m;i++)
        {
            int count = 0;
            
            for(int j=2;j*j<=i;j++)
            {
            if(i % j == 0)
            {
                count++;
                break;
            }
            }
              
        if(count==0)
        {
            System.out.println(i);
        }
        
        }
    }
}