import java.util.*;
import java.io.*;
class A implements Comparable{
int i;
A(int i){
this.i=i;
}

public String toString(){
   return ""+i;
}
@Override
public int compareTo(Object obj){
    return i - ((A)obj).i;
}
}

public class AL{
public static void main(String args[])
{
ArrayList list = new ArrayList();
list.add(new A(120));
list.add(new A(10));
list.add(new A(102));
list.add(new A(190));
System.out.println(list);
Collections.sort(list);
System.out.println(list);

}
}