
import static java.lang.Double.min;
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
public class exitpointmatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        
        for(int i=0;i<a.length;i++)
        {
        for(int j=0;j<a[0].length;j++)
        {
        a[i][j]=sc.nextInt();
        }
        }
        
        int dir=0;
        int i=0;
        int j=0;
        
        
        while(true)
        {
        dir=(dir+a[i][j])%4;
        
        if(dir==0)
        {j++;}
        else if(dir==1)
        {i++;}
        else if(dir==2)
        {j--;
        }
        else if(dir==3)
        {i--;}
        
        
        if(i<0){i++;break;}
        else if(j<0){j++;break;}
        else if(i==a.length){i--;break;}
        else if (j==a[0].length){j--;break;}
        }
        
       
        System.out.println(i);
        System.out.println(j);
    }
}
