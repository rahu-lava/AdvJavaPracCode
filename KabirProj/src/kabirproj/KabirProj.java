/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kabirproj;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JLabel;

/**
 *
 * @author rahul
 */
public class KabirProj extends JFrame implements ActionListener {

    JLabel head, usrn, pass;
    JTextField tfUser, tfPass;
    JButton login;
    JCheckBox jcb;

    KabirProj() {

        head = new JLabel("Login Page", SwingConstants.CENTER);
        usrn = new JLabel("username");
        pass = new JLabel("password");

        tfUser = new JTextField(15);
        tfPass = new JTextField(15);

        jcb = new JCheckBox("Accept Terms and Condition");

        login = new JButton("Login");

        JPanel mf = new JPanel(new FlowLayout());
        JPanel nf = new JPanel(new GridLayout(0, 1));

        nf.add(head);

        nf.add(new JLabel());

        nf.add(usrn);
        nf.add(tfUser);

        nf.add(new JLabel());

        nf.add(pass);
        nf.add(tfPass);

        nf.add(jcb);

        nf.add(new JLabel());

        nf.add(login);

        login.addActionListener(this);

        mf.add(nf);
        add(mf);

        setSize(300, 300);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new KabirProj();
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Statement st;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kabirdb", "root", "");
            st = con.createStatement();

            if (e.getSource() == login) {

                String username = tfUser.getText();
                String password = tfPass.getText();

                ResultSet rs = st.executeQuery("Select * from logindb");

                while (rs.next()) {

                    if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {

                        System.out.println("Welcome " + username + "!");

                    }

                }

            }

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

}
