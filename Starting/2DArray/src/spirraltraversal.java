
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
public class spirraltraversal {
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
        
        int minr=0;
        int minc=0;
        int maxr=a.length-1;
        int maxc=a[0].length-1;
        int ele=n*m;
        int cnt=0;
        
        while(cnt<ele)
        {
        for(int i=minr,j=minc;i<=maxr && cnt<ele;i++)
        {
            System.out.println(a[i][j]);
            cnt++;
        }
        minc++;
        
        for(int i=maxr,j=minc;j<=maxc && cnt<ele;j++)
        {
            System.out.println(a[i][j]);
            cnt++;
        }
        maxr--;
        
        for(int i=maxr,j=maxc;i>=minr && cnt<ele;i--)
        {
            System.out.println(a[i][j]);
            cnt++;
        }
        maxc--;
        
        for(int i=minr,j=maxc;j>=minc && cnt<ele;j--)
        {
            System.out.println(a[i][j]);
            cnt++;
        }
        minr++;
        
                
        }
        
    }
}
