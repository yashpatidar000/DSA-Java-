import java.util.*;

public class M9{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int no = sc.nextInt();
  
  for(int div=2;div*div<=no;div++)
  {
      while(no%div==0)
      {
          no=no/div;
          System.out.print(div+" ");
      }
  }
  if(no!=1)
  {
      System.out.print(no);
  }
 }
}