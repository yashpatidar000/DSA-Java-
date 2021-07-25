
import java.util.Scanner;

public class encoding2 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String str = sc.next();
        getEncodings(str,"");
    }
    
    public static void getEncodings(String ques, String asf)
    {
    if(ques.length()==0)
    {   
        System.out.println(asf);
        return;
    }
    else if(ques.length()==1)
    {   
        char ch = ques.charAt(0);
        
        if(ch=='0')
        {return;}
        else
        {
        int chv = ch-'0';
        char code = (char)('a' + chv - 1);
        System.out.println(asf+code);
        }
    }
    
    else
    {
    
    char ch = ques.charAt(0);
    String roq = ques.substring(1);
    if(ch==0)
    {
    return;
    }
    else{
        int chv = ch-'0';
        char code = (char)('a' + chv - 1);
        getEncodings(roq,asf+code);
    }
    
    String ch2 = ques.substring(0,2);
    String roq2 = ques.substring(2);
    int val = Integer.parseInt(ch2);
    
    if(val <= 26)
    {
        char code = (char)('a' + val - 1);
        getEncodings(roq2,asf+code);
    }
    }
    }
}
