
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
public class matrixmulti {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int arr1[][]=new int[n1][m1];
        
        for(int i=0;i<n1;i++)
        {
        for(int j=0;j<m1;j++)
        {
            arr1[i][j]=sc.nextInt();
        }
        }
        
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        int arr2[][]=new int[n2][m2];
        
        for(int i=0;i<n2;i++)
        {
        for(int j=0;j<m2;j++)
        {
            arr2[i][j]=sc.nextInt();
        }
        }
        
        int arr3[][]=new int[n1][m2];
        
        if( m1!=n2)
        {
            
        
        }
        for(int i=0;i<n1;i++)
        {
        for(int j=0;j<m2;j++)
        {
            for(int k=0;k<n1;k++)
            {
            arr3[i][j] +=arr1[i][k]*arr2[k][j];
                    }
        }
        }
        for(int i=0;i<n1;i++)
        {
        for(int j=0;j<m2;j++)
        {
            System.out.print(arr3[i][j] + " ");
        }
            System.out.println("");
        }
        
        
        
    }
}
