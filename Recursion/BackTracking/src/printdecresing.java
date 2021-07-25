
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
public class printdecresing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasing(n);
        
    }
    
    public static void printDecreasing(int n) {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
        
    }
}
