import java.io.*;
import java.util.*;

public class arrayofficial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        displayArr(arr,0);
        
    }

    public static void displayArr(int[] arr, int idx){
        
        /*if(idx==0)
        {
         return;
        }
      
        displayArr(arr,idx-1);
       System.out.println(arr[idx-1]);*/
        
        if(idx==arr.length)
        {return;}
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }

}