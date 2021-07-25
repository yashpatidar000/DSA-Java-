
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
public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul=0;
        for(int i=1;i<=10;i++)
        {
          mul =  n*i;
            System.out.println(n + "*" + i + "=" + mul);
        }
    }
}
