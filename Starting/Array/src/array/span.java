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
public class span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<arr.length;i++)
        {
        arr[i] = sc.nextInt();
        
        }
        int max = arr[0];
        int min = arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
        if(arr[i]>max)
        {
        max=arr[i];
        }
        if(arr[i]<min)
        {
        min=arr[i];
        }
        }
        int span=max-min;
        System.out.println(span);
        
    }
    
}
