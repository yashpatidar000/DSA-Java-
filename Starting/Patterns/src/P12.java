
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
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int no=1;
        int a=0;
        int b=1;
        
       for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=i;j++)
            {
        System.out.print(a+"\t");
        int c=a+b;
        a=b;
        b=c;
            }
            System.out.println("");
        }
       
    }
}
