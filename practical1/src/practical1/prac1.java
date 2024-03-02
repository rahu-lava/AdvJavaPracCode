/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author rahul
 */
public class prac1 extends JFrame implements ActionListener , ItemListener {
    
    JLabel l1;
    JComboBox jcb ;
    JTextField tf ;
    JButton jb;
    String S = "";
 
    prac1(){
    
        l1 = new JLabel("Hello World");
        Container cp = getContentPane();
        cp.add(l1);
        cp.setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
        
        
    }
    
    public static void main(String[] a){
        
        new prac1();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb){
            
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

