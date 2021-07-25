import java.io.*;
import java.util.*;

public class NewClass{

  public static void radixSort(int[] arr) {
    int max=Integer.MIN_VALUE;
    for(int val:arr){
        if(val>max){
        max=val;
    }}
    int exp=1;
    while(exp<=max){
        countSort(arr,exp);
        exp=exp*10;
    }
  }
  public static void countSort(int[] arr, int exp) {
    
    int fre[]=new int[10];
      for(int i=0;i<arr.length;i++){
          int idx=(arr[i]/exp)%10;
          fre[idx]++;
      }
      for(int i=1;i<fre.length;i++){
          fre[i]=fre[i]+fre[i-1];
      }
      int ans[]=new int[arr.length];
      for(int j=ans.length-1;j>=0;j--){
          int pos = fre[(arr[j]/exp)%10];
          int idx=pos-1;
          ans[idx]=arr[j];
          fre[(arr[j]/exp)%10]--;
      }
      for(int i=0;i<arr.length;i++){
          arr[i]=ans[i];
      }
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}