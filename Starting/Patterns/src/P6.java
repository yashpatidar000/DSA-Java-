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

public class P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 1;
        int st = (n / 2)+1;

        for (int i = 1; i <= n; i++) {

            for (int k = 0; k < st; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < st; k++) {
                System.out.print("*");
            }

            if (i <= n / 2) {
                sp += 2;
                st--;
            } else {
                sp -= 2;
                st++;
            }
            System.out.println(" ");
        }

    }
}
