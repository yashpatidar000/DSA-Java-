
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
public class factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = factorial(n);
        System.out.println(val);
    }

    public static int factorial(int n) {
        int val = 1;
        if (n == 0) {
            return val;
        }

        val = n * factorial(n - 1);

        return val;
    }
}
