/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiacctest;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author himanshi sharma
 */
public class NewWindowAdapter extends WindowAdapter {
    
    @Override
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}
