package org.example;

import javax.swing.*;
import java.awt.*;

public class Types extends JFrame {
    JComboBox box1;
    Types(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(500,200));

        ImageIcon icon=new ImageIcon("pz.jpg");

        JLabel label=new JLabel();
        label.setPreferredSize(new Dimension(300,150));
        label.setBackground(Color.orange);
        label.setIcon(icon);

        String[] type1={"Neapolitan","Sicilian","Margherita"};
        box1=new JComboBox(type1);

        this.add(label);
        this.add(box1);
        this.pack();
        this.setVisible(true);

    }
}
