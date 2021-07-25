
import java.util.*;
import java.io.*;
import java.math.*;
import java.text.DecimalFormat;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        double pos=0.0;double zero=0.0;double neg=0.0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0){pos++;}
            else if(arr[i]<0){neg++;}
            else{zero++;}
        }
        
        System.out.println(zero);
        float p=(float) (pos/n);
        float z=(float) (zero/n);
        float nv=(float) (neg/n);
        
        System.out.printf("%.6f",p);
        System.out.println();
        System.out.printf("%.6f",nv);
        System.out.println();
        System.out.printf("%.6f",z);
        System.out.println();
        
    }
}
