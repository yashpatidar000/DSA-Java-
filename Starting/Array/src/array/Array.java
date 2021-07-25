/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Yash patidar
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1,2,3,4,5,6};
                
                arr[0]=110;
                arr[1]=101;
                arr[2]=103;
                
                arr[4]=130;
                
                
                for(int i=0;i<arr.length;i++)
                {
                System.out.println(arr[i]);
                }
    }
    
}
