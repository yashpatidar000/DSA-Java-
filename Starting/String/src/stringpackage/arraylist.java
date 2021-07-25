

package stringpackage;
import java.io.*;
import java.util.*;
import java.lang.*;

public class arraylist {

                
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
                for(int i=0;i<n;i++)
                {
                al.add(scn.nextInt());
                }
                solution(al);
                System.out.println(al);
                
	}
        public static void solution(ArrayList<Integer> al)
        {
            for(int i=al.size()-1;i>=0;i--)
                {
                    int val=al.get(i);
                    if(isprime(val)==true)
                    {
                        al.remove(i);
                    }
                }
                
        }
        
        public static boolean isprime(int val)
        {
            for(int j=2;j*j<=val;j++)
                    {
                    if(val%j==0)
                    {
                     return false;
                    }
                    }
            return true;
                    
        }

}