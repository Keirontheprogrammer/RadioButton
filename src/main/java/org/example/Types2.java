package org.example;

import javax.swing.*;
import java.awt.*;

public class Types2 extends JFrame {
    JComboBox box2;
    Types2(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(500,200));

        ImageIcon icon=new ImageIcon("BG.jpg");

        JLabel label=new JLabel();
        label.setPreferredSize(new Dimension(300,150));
        label.setBackground(Color.orange);
        label.setIcon(icon);

        String[] type2={" Cheese burger"," Veggie burger","Chicken burger"};
        box2=new JComboBox(type2);

        this.add(label);
        this.add(box2);
        this.pack();
        this.setVisible(true);
    }
}
