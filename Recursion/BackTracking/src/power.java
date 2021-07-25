
import java.util.Scanner;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yash patidar
 */
public class power {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        int p = power(x,n);
        System.out.println(p);
    }

    /*public static int power(int x,int n) 
    {
        if(n==0)
        {
        return 1;
        }
        
        int vv = power(x,n-1);
        int val = x*vv;
        
        return val;
    }*/
    
     public static int power(int x,int n) 
    {
        if(n==0)
        {
        return 1;
        }
        
        int xnm1 = power(x,n/2);
        int xn = xnm1 * xnm1;
        
        if(n%2==1)
        {
        xn = x*xn;
        }
        
        return xn;
    }
}
