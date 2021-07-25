import java.io.*;
import java.util.*;

public class NewClass {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<arr.length;i++)
        {arr[i]=sc.nextInt();}
        int tar  = sc.nextInt();
        printTargetSumSubsets(arr,0,"",0,tar);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        
        if(idx==arr.length)
        {
        if(sos==tar)
        {   
            System.out.println(set + ".");
        }return;
        }
        
        
        int val=arr[idx];
        printTargetSumSubsets(arr,idx+1,set+val+", ",sos+val,tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
        
        
    }

}