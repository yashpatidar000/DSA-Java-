
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
public class incredecre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printdi(n);
        
    }
    
    public static void printdi(int n)
    {
        
        if(n==0)
        {
            return;
        }
        System.out.println(n);
         printdi(n-1);
         System.out.println(n);
        
    }
}


