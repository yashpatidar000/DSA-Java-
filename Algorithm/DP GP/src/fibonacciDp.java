
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
public class fibonacciDp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fib = fibonaccii(n, new int[n + 1]);
        System.out.println(fib);
    }

//    public static int fibonacci(int n) //6
//    {
//        if(n==0 || n==1)
//        {
//        return n;
//        }
//        
//        int ans = fibonacci(n-1) + fibonacci(n-2);
//        return ans;
//        
//    }
    public static int fibonaccii(int n, int[] qb) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (qb[n] != 0) {
            return qb[n];
        }
        System.out.println("yash");
        int fnm1 = fibonaccii(n - 1, qb);
        int fnm2 = fibonaccii(n - 2, qb);
        int fib = fnm1 + fnm2;
        qb[n] = fib;
        return fib;

    }
}
