
import java.util.*;
import java.io.*;

class Node {

    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    /* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
     */
    public static void levelOrder(Node root) {
        Queue<Node> m = new ArrayDeque<>();
        m.add(root);
        while (m.size() > 0) {
            int c = m.size();
            for(int i=0;i<c;i++){
              root = m.remove();
            System.out.print(root.data + " ");  
            if(root.left!=null){
                m.add(root.left);
            }
            if(root.right!=null){
                m.add(root.right);
            }
            }
            System.out.println("");
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }
}
