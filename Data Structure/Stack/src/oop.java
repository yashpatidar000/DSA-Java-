/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
public class oop {
    public static class Person{
        String name;int age;
        void hi(){
            System.out.println(age + " " + name);
        }
        Person(){
            System.out.println("constructor");
    } 
        {
        System.out.println("IIB");
        }
        static{
        System.out.println("SIB");
        }
    }
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=10;p1.name="A";
        p1.hi();
        Person p2=new Person();
        p2.age=20;p2.name="B";
        p2.hi();
    }
}
