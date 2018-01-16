package javabasics;
/** @author Madhu Prabha
    Purpose: To demonstrate Shopping app in a GUI.
    Logic:   NIL
    Classes: public class GuiApp, public void actionPerformed(ActionEvent event)
    Methods: NIL
    Variables: NIL
    Input: NIL
    Output: A GUI with major shopping items to select from.
**/
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class GuiApp {
   
    //Note: Typically the main method will be in a
    //separate class. As this is a simple one class
    //example it's all in the one class.
    public static void main(String[] args) {
       
        new GuiApp();
    }
 
    public GuiApp()
    {
        JFrame guiFrame = new JFrame();
       
        //to exit the program when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("SHOPPING LIST");
        guiFrame.setSize(300,250);
     
        //To center the JFrame in the middle of the screen.
        guiFrame.setLocationRelativeTo(null);
       
        //Options for the JComboBox
        String[] clothingOptions = {"Ethnic wear", "Western Wear", "Night wear"
                ,"Sports wear", "Sarees", "Kurtis", "Leggings", "Scarfs", "Dresses"};
        
        //Options for the JList
        String[] accessoriesOptions = {"neckpieces", "Chains", "Rings", "Cosmetics"
                , "Modern art jewellery", "Make-up items", "Sunglasses", "Bracelets", "Wrist-watches"
                , "Hair-dryers", "Hair-colour", "Nail-art", "Shoes", "Sandals"
                , "Party-footwear"};
       
        //JLabel and JComboBox
        final JPanel comboPanel = new JPanel();
        JLabel comboLbl = new JLabel("Clothing:");
        JComboBox clothing = new JComboBox(clothingOptions);
       
        comboPanel.add(comboLbl);
        comboPanel.add(clothing);
       
       //Creating the second JPanel.
        final JPanel listPanel = new JPanel();
        listPanel.setVisible(false);
        JLabel listLbl = new JLabel("Accessories:");
        JList accessories = new JList(accessoriesOptions);
        accessories.setLayoutOrientation(JList.HORIZONTAL_WRAP);
         
        listPanel.add(listLbl);
        listPanel.add(accessories);
       
        JButton accessoriesClothingBut = new JButton( "Clothing or Accessories");
       
        accessoriesClothingBut.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
              //SetVisible switched from true to false.
               listPanel.setVisible(!listPanel.isVisible());
               comboPanel.setVisible(!comboPanel.isVisible());
 
            }
        });
       
        //JFrame uses the BorderLayout layout manager.
        //to put the two JPanels and JButton in different areas.
        guiFrame.add(comboPanel, BorderLayout.NORTH);
        guiFrame.add(listPanel, BorderLayout.CENTER);
        guiFrame.add(accessoriesClothingBut,BorderLayout.SOUTH);
       
        //to make sure that the JFrame is visible
        guiFrame.setVisible(true);
    }
   
}