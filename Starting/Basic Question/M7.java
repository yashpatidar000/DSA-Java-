import java.util.*;
   
   public class M7{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     int nod = 0;
     
     while(n!=0)
     {
         n = n/10;
         nod++;
     }
     
     k = k%nod;
     if(k < 0)
     {
         k = k + nod;
     }
     
     int div = 1;
     int mul = 1;
     for(int i=1;i<=nod;i++)
     {
         if(i<=k)
         {
             div = div * 10;
         }
         else
         {
             mul = mul * 10;
         }
     }
     
     int q = n/div;
     int r = n%div;
     
     int rot = r * mul + q;
     System.out.println(rot);
   }
   }