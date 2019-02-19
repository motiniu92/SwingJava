package com.coderbd.util;

import com.coderbd.view.About;
import com.coderbd.view.DashBoard;
import com.coderbd.view.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class CommonMenu {

    public static JMenuBar getCommonMenu(JFrame f) {

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem itemAbout = new JMenuItem("About");
        itemAbout.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));

         itemAbout.addActionListener(new ActionListener() {
            @Override
         public void actionPerformed(ActionEvent e) {
           f.setVisible(false);
            new About().setVisible(true);
         }
         });
         
         
        JMenuItem itemDash = new JMenuItem("Dashboard");
        itemDash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashBoard().setVisible(true);
            }
        });

        JMenuItem itemExit = new JMenuItem("Exit");
        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                //new Login().setVisible(true);
                System.exit(0);
            }
        });

       // JMenuItem intemAbout = new JMenuItem("About");
       // itemAbout.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));

        JMenu help = new JMenu("Help");
        file.add(itemDash);
        file.add(itemAbout);
        file.add(itemExit);

        menuBar.add(file);
        menuBar.add(help);
        f.setJMenuBar(menuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        return menuBar;
    }
}
