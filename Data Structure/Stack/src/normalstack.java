import java.util.*;
import java.io.*;
public class normalstack{
    public static class Custom{
        int data[];int tos;
        
        public Custom(int cap){
        data = new int[cap];tos = -1;
    }
        int size(){
            int siz = tos+1;
            return siz;
        }
        void display(){
            for(int i=tos;i>=0;i--){
            System.out.print(data[i] + " ");
            }
            System.err.println();
        }
        void push(int val){
            if(tos == data.length-1){
                System.out.println("Stack overflow");
            }else{
            tos++;
            data[tos]=val;
            }
        }
        int pop(){
            if(tos == -1){
                System.out.println("Stack Underflow");
                return -1;
            }else{
            int ret=data[tos];
            tos--;
            return ret;
            }
        }
        int top(){
             if(tos == -1){
                System.out.println("Stack Underflow");
                return -1;
            }else{
            int ret=data[tos];
            return ret;
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Custom cs = new Custom(n);
        
        String str=br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                cs.push(val);
            }else if(str.startsWith("pop")){
                int ret = cs.pop();
                if(ret!=-1){
                    System.out.println(ret);
                }
            }
            else if(str.startsWith("top")){
                int ret = cs.top();
                if(ret!=-1){
                    System.out.println(ret);
                }
        }else if(str.startsWith("size")){
                int ret = cs.size();
                System.out.println(ret);
        }else if(str.startsWith("display")){
            cs.display();
        }
        str = br.readLine();
    }
}}
        