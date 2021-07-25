import java.util.*;

public class countseqABC{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str = sc.next();
    
    int a=0;
    int ab=0;
    int abc=0;
    
    for(int i=0;i<str.length();i++)
    {
    char c = str.charAt(i);
     if(c=='a')
     {
     a = 2 * a+1; 
     }
     else if(c=='b')
     {
     ab = (ab+ab) +1;    
     }else{
     abc = 2*abc +1;    
     }
    }
        System.out.println(abc);
    }
}


