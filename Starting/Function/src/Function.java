import java.util.*;

public class Function {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) 
    { 
        int count=0;
        int div=1;
        while(n!=0)
        {
        div = n%10;
        n=n/10;
        
        if(div==d)
        {
            count++;
        }
        }
        return count;
        // write code here
    }
}
