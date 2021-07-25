
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
public class M8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        /*if(a>b && a>c)
        {
            if(a*a == b*b + c*c)
            {
                System.out.println("true");
            }
            else
            {
            System.out.println("false");
            }
        }
        else if(b>c && b>a)
        {
            if(b*b == a*a + c*c)
            {
                System.out.println("true");
            }
            else
            {
            System.out.println("false");
            }
        }
        else
        {
            if(c*c == b*b + a*a)
            {
                System.out.println("true");
            }
            else
            {
            System.out.println("false");
            }
        }*/
        int max = a;
        if(b>=max)
        {max=b;}
        if(c>=max)
        {max=c; }
        
        
        if(max==a)
        {
        boolean flag = (a*a) == (b * b + c * c);
            System.out.println(flag);
        }
        else if(max==b)
        {
        boolean flag = (b*b) == ((a*a)+(c*c));
            System.out.println(flag);
        }
        else
        {
        boolean flag = (c*c) == ((b*b)+(a*a));
            System.out.println(flag);
        }
       
    }
}
