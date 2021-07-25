
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Dpcons{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int n= sc.nextInt(); 
           int k= sc.nextInt();  
           int x= sc.nextInt(); 
           long mod = (long) 10e+8 + 7;
           long a[]=new long[n];
           long b[]=new long[n];
           a[0] = x==1?1:0;
           b[0] = x==1?0:1;
           for(int i=1;i<n;i++){
               a[i]=b[i-1]%mod;
               b[i]=(a[i-1]*(k-1) + b[i-1]*(k-2)) % mod;
           }
           System.out.println(a[n-1]);
        }
    
}