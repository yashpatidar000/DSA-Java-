/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
import java.util.*;
public class anytoany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        
        int f = get(n,b1,b2);
        System.out.println(f);
    }
    public static int get(int n,int b1,int b2)
    {
        int re=0;
        int i=1;
        while(n>0)
        {
        int rem=n%b2;
        n=n/b2;
        
        //int power= (int)Math.pow(10,i);
        
        re += rem*i;
        i = i*b1;
        }
       return re;
    }
}
