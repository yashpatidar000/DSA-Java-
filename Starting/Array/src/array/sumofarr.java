/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.*;
import java.io.*;
/**
 *
 * @author Yash patidar
 */
public class sumofarr {
    public static void main(String[] args) throws exception{
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=sc.nextInt();
        }
        
        int n2=sc.nextInt();
        int a2[]=new int[n2];
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=sc.nextInt();
        }
        
        int sum[]=new int[n1>n2? n1:n2];
                
        int i=a1.length-1;
        int j=a2.length-1;
        int k=sum.length-1;
        
        int c=0;
        
        while(k>=0)
        {
        int d =c;
        if(i>=0)
        {d += a1[i];
        }
        if(j>=0)
        {d += a2[j];
        }
        
        c=d/10;
        d=d%10;
        
        sum[k]=d;
        i--;
        j--;
        k--;
        }
        
        if(c>0)
        {
            System.out.println(c);
        }
        
        for(int val: sum)
        {System.out.println(val);}
    }
    
}
