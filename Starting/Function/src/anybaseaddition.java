import java.util.*;
  
  public class anybaseaddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int rv =0;
       int quo=0;
       int i=1;
       while(n1!=0 || n2!=0 || quo!=0)
       {
       int nn1=n1%10;
       int nn2=n2%10;
       n1=n1/10;
       n2=n2/10;
       
       int r = nn1+nn2+quo;
       quo = r/b;
       r=  r % b;
       rv += r *i;
       i = i *10;
       }
       return rv;
   }
      
  }