import java.io.*;
import java.util.*;

public class targetsum{

  public static void targetSumPair(int[] arr, int target){
    //Arrays.sort(arr);
    int arrr[]=mergesort(arr,0,arr.length-1);
    int i=0;int j=arrr.length-1;
    while(i<j){
    if(arrr[i]+arrr[j]<target){
        i++;
    }else if(arrr[i]+arrr[j]>target){
        j--;
    }
    else{
        System.out.println(arrr[i]+","+arrr[j]);
        i++;j--;
    }
    }
  }
  public static int[] mergesort(int arr[], int lo,int hi){
      if(lo==hi){
          int bs[]=new int[1];
          bs[0]=arr[lo];
          return bs;
      }
      int mid=(lo+hi)/2;
      int a[]=mergesort(arr,lo,mid);
      int b[]=mergesort(arr,mid+1,hi);  
      int sorted[] = mergetwo(a,b);
      return sorted;
  }
  public static int[] mergetwo(int a[],int b[]){
      int i=0;int j=0;int idx=0;
      int farr[]=new int[a.length+b.length];
      while(i<a.length && j<b.length){
          if(a[i]<b[j]){
              farr[idx]=a[i];i++;idx++;
          }else{
              farr[idx]=b[j];j++;idx++;
          }
      }
      while(i<a.length){
           farr[idx]=a[i];i++;idx++;
      }
      while(j<b.length){
          farr[idx]=b[j];j++;idx++;
      }
      return farr;
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}