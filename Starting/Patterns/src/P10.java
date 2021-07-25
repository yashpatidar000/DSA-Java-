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

public class P10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int osp=n/2;
        int isp=-1;
        
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=osp;j++)
        {
            System.out.print("\t");
        }
            System.out.print("*\t");
            
        for(int k=1;k<=isp;k++)
        {
            System.out.print("\t");
        }
        if(isp>0)
        {
            System.out.print("*\t");
        }    
            
            if(i<=n/2)
            {isp +=2;
                osp--;}
            else
            {
            isp -=2;
            osp++;
            }
            System.out.println("");
    }
    }
    
    }

