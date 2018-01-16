/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingsprac;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author himanshi sharma
 */

public class GUIforFactoryApplication extends JFrame {
   
   JFrame frameObj;
   //Constructor for this class,this will create a new JFrame object as soon as the object for the class is created.
   public GUIforFactoryApplication(){
       frameObj=new JFrame();
       frameObj.setTitle("---Factory Inventory Project---");
       frameObj.setVisible(true);
       frameObj.setSize(300,300);
   }
   
   void addElementsTGui(){
       JButton buttonObj=new JButton("Click Me");
       buttonObj.setSize(30,30);
       frameObj.add(buttonObj);
   }
   
   public static void main(String[] args){
       GUIforFactoryApplication obj=new GUIforFactoryApplication();
   }
}
