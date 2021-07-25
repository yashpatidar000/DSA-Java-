
import java.util.*;
import java.io.*;

public class Btree {

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
    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node=node;
            this.state=state;
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {1,null};
        Stack<Pair> s = new Stack<>();
        Node root = new Node(arr[0],null,null);
        Pair(root,)
    }

}

