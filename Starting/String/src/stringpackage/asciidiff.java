

package stringpackage;
import java.io.*;
import java.util.*;
import java.lang.*;

public class asciidiff {
public static String toggle(String str){
		// write your code here
                 StringBuilder s = new StringBuilder();
                 s.append(str.charAt(0));
                 
                 for(int i=1;i<str.length();i++)
                {
                char curr=str.charAt(i);
                char prev=str.charAt(i-1);
                
                int diff=curr-prev;
                s.append(diff);
                s.append(curr);
                
                }
                return s.toString();
        }
                
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggle(str));
		  
	}

}