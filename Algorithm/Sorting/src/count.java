import java.io.*;
import java.util.*;

public class count {

  public static void countSort(int[] arr, int min, int max) {
      int range=max-min+1;
      int fre[]=new int[range];
      int val=max-min;
      for(int i=0;i<arr.length;i++){
          int idx=arr[i]-min;
          fre[idx]++;
      }
      for(int i=1;i<fre.length;i++){
          fre[i]=fre[i]+fre[i-1];
      }
      int ans[]=new int[arr.length];
      for(int j=ans.length-1;j>=0;j--){
          int pos = fre[arr[j]-min];
          int idx=pos-1;
          ans[idx]=arr[j];
          fre[arr[j]-min]--;
      }
      for(int i=0;i<arr.length;i++){
          arr[i]=ans[i];
      }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}