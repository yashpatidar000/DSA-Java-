
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
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=sc.nextInt();
        }
        }
        for(int i=0;i<arr.length;i++)
        {
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.print(arr[i][j]);
        }
            System.out.println("");
        }
    }
}
