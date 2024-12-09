package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizza;
    JRadioButton burger;
    JRadioButton hotdog;
    JLabel label;
    ButtonGroup group;
    ImageIcon pizzaicon;
    ImageIcon burgericon;
    ImageIcon hotdogicon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(500,200));


        pizza=new JRadioButton();
        pizza.setText("PIZZA");
        pizza.setFocusable(false);
        pizza.addActionListener(this);


        burger=new JRadioButton();
        burger.setText("BURGER");
        burger.setFocusable(false);
        burger.addActionListener(this);

        hotdog=new JRadioButton();
        hotdog.setText("HOTDOG");
        hotdog.setFocusable(false);
        hotdog.addActionListener(this);

        group=new ButtonGroup();

        ImageIcon icon=new ImageIcon("order.png");

        label=new JLabel();
        label.setText("SELECT AN ORDER :");
        label.setFocusable(false);
        label.setOpaque(true);
        label.setForeground(Color.DARK_GRAY);
        label.setIcon(icon);

        group.add(pizza);
        group.add(burger);
        group.add(hotdog);


        this.add(label);
        this.add(pizza);
        this.add(burger);
        this.add(hotdog);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizza){
            pizzaicon=new ImageIcon("pizza.png");
            //            System.out.println("YOU ORDERED PIZZA :) !!");
            JOptionPane.showMessageDialog(null,"YOU ORDERED PIZZA, CHOOSE TYPE : ) !!","your order",JOptionPane.INFORMATION_MESSAGE, pizzaicon);
            this.dispose();
            Types type=new Types();

        }
        else if (e.getSource()==burger){
            burgericon=new ImageIcon("burger.png");
            JOptionPane.showMessageDialog(null,"YOU ORDERED BURGER : ) !!","your order",JOptionPane.INFORMATION_MESSAGE, burgericon);
            Types2 type2=new Types2();
        }
        else if(e.getSource()==hotdog){
            hotdogicon=new ImageIcon("hotdog.png");
            JOptionPane.showMessageDialog(null,"YOU ORDERED HOTDOG : ) !!","your order",JOptionPane.INFORMATION_MESSAGE, hotdogicon);
            Types3 type3=new Types3();
        }
    }
}
