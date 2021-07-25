/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpackage;

import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author Yash patidar
 */
public class stringg {
    
    public static void main(java.lang.String[] args) {
        Scanner sc =new Scanner(System.in);
//        String s1=sc.nextLine();
//        String s2=sc.nextLine();
//        System.out.println(s1);
//        System.out.println(s2);
//        
//    
// String s="abcdef";
//         System.out.println(s.length());
//         for(int i=0;i<s.length();i++)
//         {System.out.println(s.charAt(i));}
//         
//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<=s.length();j++)
//             {
//                 System.out.println(s.substring(i,j));
//             }
//         }
//         
    String s="abc def ghi jkl";
    String[] parts=s.split(" ");
    for(int i=0;i<parts.length;i++){
        System.out.println(parts[i]);}
    }
    String str=s.charAt(0);
    
}
    

