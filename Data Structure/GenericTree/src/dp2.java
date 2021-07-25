
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class dp2{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        int n= sc.nextInt();
        
   
        long a=t1;
        long b=t2;
        long c=0;
        BigInteger aa = BigInteger.valueOf (a);
        BigInteger bb = BigInteger.valueOf (b);
        BigInteger cc = BigInteger.valueOf (c);
        for(int i=1;i<n;i++){
//           c=a+b*b;
//           a=b;
//           b=c;
           cc= aa.add(bb.multiply(bb));
           aa=bb;
           bb=cc;
        }
        System.out.println(aa);
    }
}