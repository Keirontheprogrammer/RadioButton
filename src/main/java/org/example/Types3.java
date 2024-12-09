package org.example;

import javax.swing.*;
import java.awt.*;

public class Types3 extends JFrame {
    JComboBox box3;
    Types3(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(500,200));

        ImageIcon icon=new ImageIcon("hd.jpg");

        JLabel label=new JLabel();
        label.setPreferredSize(new Dimension(300,150));
        label.setBackground(Color.orange);
        label.setIcon(icon);

        String[] type3={" Dodger Dog"," Puka Dog"," Sonoran dog"};
        box3=new JComboBox(type3);

        this.add(label);
        this.add(box3);
        this.pack();
        this.setVisible(true);
    }
}
