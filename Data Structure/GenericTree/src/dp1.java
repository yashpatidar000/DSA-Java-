
import java.util.*;
import java.io.*;
public class dp1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        long a[]=new long[k+1];
        a[0]=1;
        for(int i=0;i<n;i++){
            for(int j=arr[i];j<a.length;j++){
                a[j]+=a[j-arr[i]];
            }
        }
        System.out.println(a[k]);
    }
  
}