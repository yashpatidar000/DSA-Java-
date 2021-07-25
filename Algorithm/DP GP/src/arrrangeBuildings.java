import java.util.*;

public class arrrangeBuildings {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    
    int p0=1;  
    int p1=1;        
     
    for(int i=2;i<=n;i++)
    {
    int c0=p1;
    int c1=p0+p1;
    p0=c0;
    p1=c1;
    }    
        System.out.println((p0+p1)*(p0+p1));
    }
    
}
