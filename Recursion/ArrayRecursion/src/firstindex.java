import java.io.*;
import java.util.*;

public class firstindex {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int x = sc.nextInt();
        
        int max = firstIndex(arr,0,x);
        System.out.println(max);
        
    }
    
    public static int firstIndex(int[] arr,int idx,int x)
{
    if(idx==arr.length)
    {
    return -1;
    }
        int fisa = firstIndex(arr,idx+1,x);
        
        if(arr[idx] == x)
        {
        return idx;
        }
        else{
        return fisa;
        }
    
}

}