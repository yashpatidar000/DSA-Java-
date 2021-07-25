import java.util.*;
import java.io.*;
public class LL{
    public static class Node{
        int data;Node next;
    }
    public static class LinkedList{
        int size;Node head;Node tail;
        
        void addLast(int val){
            if(size==0){
                Node temp=new Node();
                temp.data=val;
                temp.next=null;
                head=tail=temp;
            }else{
                Node temp=new Node();
                temp.data=val;
                temp.next=null;
                tail=temp;
                size++;
            }
        }
    }
    
    public static void test(LinkedList list){
        for(Node temp=list.head ; temp!=null ; temp=temp.next){
            System.out.println(temp.data);
        }
        System.out.println(list.size);
        if(list.size>0){
            System.out.println(list.tail.data);
        }
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();
        
        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.substring(0, 7) == "addLast"){
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }
            str = br.readLine();
        }         
        test(list);
    }
}