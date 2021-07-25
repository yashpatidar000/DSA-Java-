/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpackage;

import java.util.Scanner;

/**
 *
 * @author Yash patidar
 */
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
        for(int j=i+1;j<=s.length();j++)
        {
        String value=s.substring(i,j);
        if(check(value)==true)
        {
            System.out.println(value);
        }
        }
        }
    }
    
    public static boolean check(String value)
    {
        int i=0;int j=value.length()-1;
        
        while(i<=j)
        {
        char a=value.charAt(i);
        char b=value.charAt(j);
        if(a==b)
        {
         i++;j--;
        }
        else{
            return false;
            
        }
      }
        return true;
    }
}
