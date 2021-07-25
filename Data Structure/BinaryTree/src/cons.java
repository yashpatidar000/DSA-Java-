
import java.util.*;
import java.io.*;

public class cons {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {

        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node node){
        if(node==null){
            return;
        }
        String s = "";
        s += node.left==null? ".":node.left.data;
        s += "<-" + node.data + "->";
        s += node.right==null? ".":node.right.data;
        
        System.out.println(s);
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Integer arr[] = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = new Node(arr[0], null, null);
        Stack<Pair> s = new Stack<>();

        Pair p = new Pair(root, 1);
        s.push(p);
        int i = 0;
        while (s.size() > 0 && arr.length>i) {
            Pair top = s.peek();
            if (top.state == 1) {
                i++;
                if (arr[i]!=null) {
                    top.node.left = new Node(arr[i],null,null);
                    Pair np = new Pair(top.node.left,1);
                    s.push(np);
                }else{
                    top.node.left=null;
                }
            } else if (top.state == 2) {
                i++;
                if (arr[i]!=null) {
                    top.node.right = new Node(arr[i],null,null);
                    Pair np = new Pair(top.node.right,1);
                    s.push(np);
                }else{
                    top.node.right=null;
                }
            } else {
                   s.pop();
            }
            top.state++;
        }
        display(root);
    }

}
