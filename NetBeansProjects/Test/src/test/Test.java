/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author himanshi sharma
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    void cdf(){
        int x=0,y=0;
        x= 5 + y++;
        System.out.println(x+" "+y);
        x=5+ ++y;
        System.out.println(x+" "+y);
    }
    void abc(){
        int x=100;
        double y=100.1;
    //    boolean b=(x=y);
   //     System.out.println(b);
    }
    
    void m1(){
        boolean flag=true;
        int x=5;
        int result=(16)%x;
        System.out.println(!(result>0)^true^(flag=false));
        System.out.println(flag);
    }
    void m2(){
        int a=5,b=6,c=7;
        System.out.println("Value is "+b+c);
    }
    void m3(){
        double a=295.04;
        int b=300;
        byte c=(byte)a;
        byte d=(byte)b;
        System.out.println(c+" "+d);
    }
    public static void main(String[] args) {
        // TODO code application logic here
      Test t1=new Test();
       //t1.m2(); 
       t1.m3();
      //t1.m1();
      //t1.cdf();
      //t1.abc();
    }
    
}
