/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_10;
import java.lang.annotation.*;
import java.lang.reflect.*;

/**
 * @author himanshi sharma
 * Title:Reflection is the feature that enables information about a class to be obtained at run time. The reflection API
 * is contained in the java.lang.reflect package. Create annotation Myanno with values str() of type string and val() of
 * type integer. Apply Retention policy to RUNTIME. Using which annotate a method myMethod(), which obtains the annotation 
 * for this method and display the values of the members i.e First, get a Class object that represents this class. Secondly,
 * get a Method object that represents this method. Next, get the annotation for this class. Finally, display the values.
 * Logic: A custom annotation is created in this program.
 * Classes: AnnotationImplementation,AnnotationDemo
 * Methods: myMethod(),main()
 * Variables: str,val
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Myanno{
 String str();
 int val();
}

//Applying annotation
class AnnotationImplementation{
    @Myanno(str="hello",val=10)
    public void myMethod(){
        System.out.println("Hello Annotation!!!");
    }
}
//Accessing annotation
public class AnnotationDemo {
    public static void main(String[] args){
         try{
            AnnotationImplementation obj=new AnnotationImplementation();
            Method m=obj.getClass().getMethod("Say Hello");
            Myanno a=m.getAnnotation(Myanno.class);
            System.out.println(" String value is: "+a.str()+" "+"\n nteger Value is: "+a.val());
            
        }catch(NoSuchMethodException e){
            System.out.println("Exception thrown from class AnnotationDemo: \n"+e);
        }
   }
}
