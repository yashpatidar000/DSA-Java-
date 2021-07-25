import java.io.*;
import java.util.*;

public class printpermu{

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String ques,String asf) {
        
        if(ques.length()==0)
        {
        System.out.println(asf);
        return;
        }
        for(int i=0;i<ques.length();i++){
        char ch = ques.charAt(i);
        String lpart = ques.substring(0,i);
        String rpart = ques.substring(i+1);
        String roq = lpart + rpart;
        printPermutations(roq , asf+ch);
        }
        
    }

}