
package com.coderbd.event;

import java.awt.Dimension;
import static java.awt.SystemColor.window;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.SwingUtilities;


public class Sketcher implements WindowListener{
    public static void main(String[] args) {
        Sketcher theApp = new Sketcher();
        SwingUtilities.invokeLater(new Runnable(){
        public void run(){
        theApp.creatGUI();
        }
        });
        
        private void creatGUI(){
        window = new SketcherFrame("Sketcher");
        Toolkit theKit = window.getToolkit();
        Dimension wndSize= theKit.getScreenSize();
        
        window.setBounds(wndSize.width/4, wndSize.height/4,wndSize.width/2, wndSize.height/2);
        
        window.addWindowListener(this);
        window.setVisible(true);
        }
       

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
         window.dispose();
            System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
    
    

