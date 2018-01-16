/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readdata_7a;

/**
 * @author himanshi sharma
 * Title:Define a class readDataDemo which contains main method.  Within the main() method, create objects 
 * for StringValue, IntegerValue and DoubleValue classes and invoke the readString(), readInteger() and readDouble() methods.
 * Logic:All the classes are in the same package so their methods can be called within any class using a fully qualified name.
 * Classes:ReadDataDemo,DoubleValue,IntegerValue,StringValue
 * Methods: readInteger(),doubleValue(),readString()
 * Variables: strObject1,intObject1,doubleObject1,doubObj,intObj,strObj,strObject1,intObject1,doubleObject1
 */

public class ReadDataDemo {
   
    public static void main(String[] args){
    
        String strObject1;
        int intObject1;
        double doubleObject1;
        
        DoubleValue doubObj=new DoubleValue();
        IntegerValue intObj=new IntegerValue();
        StringValue strObj=new StringValue();
        
        strObject1=strObj.readString();
        intObject1=intObj.readInteger();
        doubleObject1=doubObj.readDouble();
        
        System.out.println("String: "+strObject1);
        System.out.println("Integer: "+intObject1);
        System.out.println("Double: "+doubleObject1);
        
        
   }    
}
