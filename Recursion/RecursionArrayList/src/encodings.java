
import java.io.*;
import java.util.*;

public class encodings {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str,"");
    }
     
    public static void printEncodings(String ques , String asf) {
       
        if(ques.length()==0)
        {
            System.out.println(asf);
            return;
        }
        else if(ques.length() == 1)
        {
        char ch = ques.charAt(0);
                if(ch == '0')
                {return;}
                else
                {
                int chv = ch - '0';
                char chcode = (char)('a' + chv - 1);
                System.out.println(asf + chcode);
                }
        }
        else{    
            char ch = ques.charAt(0);
            String roq = ques.substring(1);
            
            if(ch=='0')
            {
                return;
            }
            else
            {
            int chv = ch - '0';
            char code = (char)('a' + chv - 1);
            printEncodings(roq,asf+code);
            }
        
            String ch2 = ques.substring(0,2);
            String roq2 = ques.substring(2);
            int val = Integer.parseInt(ch2);
            
            if(val <= 26)
            {
            char code2 = (char)('a' + val -1);
            printEncodings(roq2,asf+code2);
            }
            
           
        }
        }
        
        
    }


