import java.io.*;
import java.util.*;

public class LAH{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    
    Stack<Integer> st = new Stack<>();
    int rb[]=new int[n];
    st.push(n-1);
    rb[n-1]=a.length;
    for(int i=n-2;i>=0;i--){
        while(st.size()>0 && a[st.peek()]>a[i]){
            st.pop();
        }
        if(st.size()==0){
            rb[i]=a.length;
        }else{
            rb[i]=st.peek();
        }
        st.push(i);
    }
    int lb[]=new int[n];
    lb[0]=-1;
    Stack<Integer> stt = new Stack<>();
    stt.push(0);
    for(int i=1;i<n;i++){
        while(stt.size()>0 && a[st.peek()] > a[i]){
            stt.pop();
        }
        if(stt.size()==0){
            lb[i]=-1;
        }else{
            lb[i]=stt.peek();
        }
        stt.push(i);
    }
    int max=0;
    for(int i=0;i<n;i++){
        int width=rb[i]-lb[i]-1;
        int area=a[i]*width;
        if(area>max){
            max=area;
        }
    }
    System.out.println(max);
 }
}