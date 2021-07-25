
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class DPsherlock{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1=sc.nextInt();
        for(int t=0;t<t1;t++){
           int n= sc.nextInt(); 
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           sol(arr);
        }
    }
    
    public static void sol(int B[]){
        int maxVar = Math.abs(B[1] - 1);
        int maxOne = Math.abs(B[0] - 1);

        for (int i =2; i < B.length; i++) {
            int newMaxVar = Math.max(Math.abs(B[i] - 1) + maxOne,  
                Math.abs(B[i] - B[i-1]) + maxVar);
            int newMaxOne = Math.abs(B[i-1] - 1) + maxVar;
            maxVar = newMaxVar;
            maxOne = newMaxOne;
        }

        int s= Math.max(maxVar, maxOne);
        System.out.println(s);
    }
}