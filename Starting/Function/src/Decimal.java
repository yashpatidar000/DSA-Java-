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
public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int f = get(n,b);
        System.out.println(f);
    }
    public static int get(int n,int b)
    {
        int re=0;
        int i=1;
        while(n>0)
        {
        int rem=n%b;
        n=n/b;
        
        //int power= (int)Math.pow(10,i);
        
        re += rem*i;
        i = i*10;
        }
       return re;
    }
}
