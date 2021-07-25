import java.util.*;
import java.io.*;
import java.math.*;
public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans = Result.difference(arr);
        double an = 1.0000000;
        System.out.println(an);
    }
}
class Result{
    public static int difference(int a[][]){
        int fd=0;int sd=0;
       for(int i=0;i<a.length;i++) {
           for(int j=0;j<a.length;j++){
               if(i==j){
                   fd+=a[i][j];
               }
           }
       }
       for(int i=0;i<a.length;i++) {
           for(int j=0;j<a.length;j++){
               if(i+j == a.length-1){
                   sd+=a[i][j];
               }
           }
       }
       
      int ans = Math.abs(fd-sd);
       return ans;
    } 
}
