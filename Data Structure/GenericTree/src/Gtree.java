//import java.util.*;
//import java.io.*;
//public class Gtree {
//    
//    public static void main(String[] args) {
//        int arr[] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,20,-1,-1,90,-1,-1,40,100,-1,-1,-1};
//        
//        Node root;
//        Stack<Node> s = new Stack<>();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==-1){
//                s.pop();
//            }else{
//                 Node t = new Node();
//                 t.data=arr[i];
//                if(s.size()==0){
//                    root=t;
//                }else{
//                    s.peek().child.add(t);
//                }
//                s.push(t);
//            }
//        }
//    }
//}
//class Node{
//        int data;
//        ArrayList<Node> child = new ArrayList<>();
//    }
//
import java.util.*;
import java.io.*;
public class Gtree{
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    public static void main(String[] args) {
        int arr[] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,20,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        
        Node root = null;
        Stack<Node> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            Node t = new Node();
            t.data=arr[i];
            if(t.data==-1){
                s.pop();
            }else{
            if(s.size()>0){
                s.peek().children.add(t);
            }else{
                root = t;
            }
            s.push(t);
        }
        }
        print(root);
    }
    public static void print(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data + " -> ");
        for(Node val: node.children){
            System.out.print(val.data + "");
        }
        System.out.println("");
        for(Node child: node.children){
            print(child);
        }
}
}