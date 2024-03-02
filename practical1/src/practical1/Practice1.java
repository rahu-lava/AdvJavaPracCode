/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.JLabel;

/**
 *
 * @author rahul
 */
public class Practice1 extends JFrame implements ActionListener , ItemListener {


    JLabel l1;
    JButton jb;
    JTextField jtf;
    JComboBox jcb;
    JRadioButton jrb1 , jrb2;
    JCheckBox jcbx ;
    JFrame f;
    String s  = "" ;
    Practice1(){
        
        l1 = new JLabel("Registration", SwingConstants.CENTER);
        jb = new JButton("Say Hello");
        jtf = new JTextField(20);
//        jtf.setFont(new java.awt.Font("Tahoma",1,30)) 
        jcb = new JComboBox();
        jcb.addItem("Please Specify your gender");
        jcb.addItem("Male");
        jcb.addItem("Female");
        jrb1 = new JRadioButton("Home");
        jrb2 = new JRadioButton("At work");
        ButtonGroup bgp = new ButtonGroup();
        bgp.add(jrb1);
        bgp.add(jrb2);
        JPanel mainP = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel nestedP = new JPanel(new GridLayout(0,1));
//        f = new JFrame();
//        jb.setBounds(25,25,100,25);
//        l1.setBounds(50,50,100,50);
        nestedP.add(l1);
        nestedP.add(new JLabel());
        
//        add(new JLabel("Hello"));
        nestedP.add(jtf);
        nestedP.add(jb);
        nestedP.add(jcb);
        nestedP.add(jrb1);
        nestedP.add(jrb2);
        
        jcb.addItemListener(this);
        jb.addActionListener(this);
        
        mainP.add(nestedP);
        add(mainP);
//        setLayout(new GridLayout(0,1));
        setSize(300,300);
        setVisible(true);
//        l1.addActionListener(this);
//        System.out.println("I'm here");
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb){
            System.out.println("Hey the Button is Clicked");
            if (s.equals("Male")) {
                System.out.println("aree re tum toh male baarve fail ho..");
            } else {
                System.out.println("Aree re tum toh female ho , saar pe lagate teel ho!");
                        
            }
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        s = (String) e.getItem();
        
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args){

        new Practice1();
    }
    
}


