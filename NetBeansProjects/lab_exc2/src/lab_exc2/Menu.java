/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc2;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
public class Menu {
    Scanner st=new Scanner(System.in);
    int arr[]=new int[10];
    int size,i,num;
     void input(){
       // st=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        size=st.nextInt();
        System.out.println("Enter an array: ");
        for(i=0;i<size;++i){
            arr[i]=st.nextInt();
        }
        
    }
    
    void disp(){
         System.out.println("The array is : ");
        for(i=0;i<size;++i){
            System.out.println(arr[i]+" ");
        }
    }
    
    void search(){
        int flag=0;
        System.out.println("Enter the element to be searched : ");
        num=st.nextInt();
        for(i=0;i<size;++i){
            if(arr[i]==num){
                flag=1;
                System.out.println("The index value of the element is "+(i+1));
            }
        }
        if(flag==0){
            System.out.println("The element is not present in the array.");
        }
    }   
    
    void sort(){
        //sorting logic
        for(i=0;i<size;i++){
           for(int j=0;j<i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
        System.out.println("The sorted array is :");
        for(i=0;i<size;++i){
            System.out.print(arr[i]+" ");
            
        }
    }
    
  //shows a menu for the user and takes choice
  public static void main(String[] args){
      int choice,ch;
      Menu m=new Menu();
     Scanner s=new Scanner(System.in);
       do{
      System.out.println("-----MENU-----");
      System.out.println("1.Accepts elements of an array.");
      System.out.println("2.Display the elements of an array.");
      System.out.println("3.Search the elements within the array.");
      System.out.println("4.Sort the elements using bubble sort.");
          System.out.println("Enter your choice:");
          choice=s.nextInt();
          
          switch(choice){
              case 1: m.input();
                        break;
              case 2: m.disp();
                        break;
              case 3: m.search();
                        break;
              case 4: m.sort();
                        break;
              default: System.out.println("please enter a valid choice.");          
          }
          System.out.println("Do you want to continue?(yes-1)");
          ch=s.nextInt();
  }while(ch==1);    
}
}
