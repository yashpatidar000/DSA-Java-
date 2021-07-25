////import java.util.*;
////import java.io.*;
////public class Heap{
////    public static void main(String[] args) throws Exception {
////        PriorityQueue<Integer> pq = new PriorityQueue<>();
////        int a[] = {22,3,54,7,90,45,4,8,1,35,99};
////        for(int val: a){
////            pq.add(val);
////        }
////        
////        while(pq.size()>0){
////            System.out.println(pq.remove());
////        }
////    }
////}
//
//import java.io.*;
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        int k = Integer.parseInt(br.readLine());
//        for(int i=0;i<arr.length;i++){
//            if(i<k){
//                pq.add(arr[i]);
//            }else{
//                if(arr[i]>pq.peek()){
//                    pq.remove();
//                    pq.add(arr[i]);
//                }
//            }
//        }
//        for(int i=0;i<k;i++){
//            System.out.println(pq.remove());
//        }
//    }
//    
//}

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      PriorityQueue<Integer> pq = new PriorityQueue<>(); 
      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      for(int i=0;i<=arr.length+k;i++){
          if(i<=k){
              pq.add(arr[i]);
          }else{
              System.out.println(pq.remove());
              if(i<arr.length){
              pq.add(arr[i]);
              }
          }
      }
   }

}