/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;

/**
 *
 * @author Yash patidar
 */
public class brokeneconomy {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
       
        int l=0;
        int h=arr.length-1;
        int ceil=0;
        int floor=0;
        
        
        while(l<=h)
        { 
            
            int m=(l+h)/2;
            
            if(d>arr[m])
            {
            l=m+1;
            floor=arr[m];
            }
            else if(d<arr[m])
            {
            h=m-1;
            ceil=arr[m];
            }
            else
            {
                ceil=arr[m];
                floor=arr[m];}
            }
        System.out.println(ceil);
        System.out.println(floor);
        
        
    }
}
    
