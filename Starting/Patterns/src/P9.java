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

public class P9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=n;j++)
        {
            if(i==j || i+j==n+1 )
                System.out.print("*");
            else
                System.out.print(" ");
        }
            System.out.println("");
        }
    }
}
