/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical1;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//import java.lang.System.Logger.Level;
import java.sql.*;
/**
 *
 * @author rahul
 */
public class jdbcPrac extends JFrame implements ActionListener, ItemListener {

    JLabel heading, name, id;
    JFrame f;
    JTextField jtf1, jtf2;
    JButton save, update, printAll;
    JCheckBox cbx1;

    jdbcPrac() {

//        f = new JFrame();
        JPanel mainF = new JPanel(new FlowLayout());
        JPanel nestedF = new JPanel(new GridLayout(0, 1));

        heading = new JLabel("Admin Panel", SwingConstants.CENTER);

        name = new JLabel("Name");
        jtf1 = new JTextField(15);

        id = new JLabel("ID");
        jtf2 = new JTextField(15);

        save = new JButton("Save");
        update = new JButton("Update");
        printAll = new JButton("Print All");

        save.addActionListener(this);
        update.addActionListener(this);
        printAll.addActionListener(this);

        nestedF.add(heading);

        nestedF.add(name);
        nestedF.add(jtf1);

        nestedF.add(id);
        nestedF.add(jtf2);

        nestedF.add(save);
        nestedF.add(update);
        nestedF.add(printAll);

        mainF.add(nestedF);
        add(mainF);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String a[]) {

        new jdbcPrac();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Connection con;
        Statement st;
        String naam = "", ids = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            st = con.createStatement();

                naam = jtf1.getText();
                ids = jtf2.getText();

            if (e.getSource()==save) {

                System.out.println("you clicked save");
                st.executeUpdate("insert into employee Values('"+naam+"','"+ids+"')");
                System.out.println("value inserted");
//            st.executeUpdate("insert into studentdetails Values('"+naam+"','"+ids+"')");

            } else if (e.getSource() == update) {

                int exeRow = st.executeUpdate("update employee set name ='"+naam+"'where id ='"+ids+"'");
//                System.out.println("value updated");
                if (exeRow > 0) {
                    System.out.println("A record is Updated");
                }


            } else if (e.getSource() == printAll) {

                ResultSet rs = st.executeQuery("select * from employee");

                while (rs.next()) {

                    System.out.println("Roll Number:- " + rs.getString("name"));
                    System.out.println(", Student Name:- " + rs.getString("id"));

                }

            }
        } catch (ClassNotFoundException ex) {
            System.out.println("you got error" + ex);
        } catch (SQLException ex) {
            System.out.println("you got error" + ex);
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
