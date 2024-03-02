/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical_1;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

class Login extends JFrame implements ActionListener {

    JPanel panel = new JPanel(new GridLayout(3, 1));
    JLabel lb_usr = new JLabel("User Name");
    JLabel lb_pass = new JLabel("Password");
    JLabel lb = new JLabel();
    JTextField txt_usr = new JTextField(15);
    JPasswordField txt_pass = new JPasswordField(15);
    JButton Submit = new JButton("Submit");

    Login() {
        panel.add(lb_usr);
        panel.add(txt_usr);
        panel.add(lb_pass);
        panel.add(txt_pass);
        panel.add(Submit);
        panel.add(lb);

        add(panel, BorderLayout.CENTER);
        Submit.addActionListener(this);
        setTitle("Login page");
    }

    public void actionPerformed(ActionEvent a) {
        String usr = txt_usr.getText();
        String pass = txt_pass.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost/grocery",
                            "root", "");
            String sql = "Select username, password from authentication where username= ? and password = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, usr);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                lb.setText("Login successful");
                GroceryShop gs = new GroceryShop();
            }
            else{
                System.out.println("Invalid Username......");
                JOptionPane.showMessageDialog(this,"Incorrect Login","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException | ClassNotFoundException e1)
        {
            System.out.println("Error "+ e1);
        }
    }
}

public class Practical_1 {

    public static void main(String[] args) {
        try {
            Login frame = new Login();
            frame.setSize(500, 300);
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}

class GroceryShop extends JFrame implements ActionListener{
    
    JButton b1 = new JButton("Add Product");
    JButton b2 = new JButton("Show Products");
    
    GroceryShop() {
        JFrame f = new JFrame();

        b1.setBounds(50,50,150,30);
        b2.setBounds(200,50,150,30);

        f.add(b1);
        f.add(b2);
        f.setSize(400,200);
        f.setLayout(null);
        f.setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) 
        {
            AddProduct ap = new AddProduct();
        } 
        if(e.getSource()==b2) 
        {
            ShowProducts sp = new ShowProducts();
        }
    }
}

class ShowProducts extends JFrame {

    DefaultTableModel model = new DefaultTableModel();
    Container cnt = new Container();
    JTable jtbl = new JTable(model);

    public ShowProducts() {

        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
        model.addColumn("Product ID");
        model.addColumn("Product Name");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost/grocery",
                            "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from Products");
            while(rs.next()){
                model.addRow(new Object[]{rs.getInt(1),rs.getString(2)});
            }
        } catch (Exception e) {
            System.out.println("Error..........."+e);
        }
        JScrollPane pg = new JScrollPane(jtbl);
        cnt.add(pg);
        JFrame frame = new JFrame();
        frame.add(cnt);
        frame.setTitle("Show Products");
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}

class AddProduct extends JFrame implements ActionListener {

    JTextField txt_productId, txt_productName, txt_productPrice;
    JButton btn_submit;

    AddProduct() {
        JFrame f = new JFrame("Add Product");

        // create text fields for product details
        txt_productId = new JTextField(15);
        txt_productName = new JTextField(15);
        txt_productPrice = new JTextField(15); // new text field for product price

        // create labels for the text fields
        JLabel lbl_productId = new JLabel("Product ID");
        JLabel lbl_productName = new JLabel("Product Name");
        JLabel lbl_productPrice = new JLabel("Product Price/kg"); // new label for product price

        // create submit button
        btn_submit = new JButton("Submit");

        // add action listener to the submit button
        btn_submit.addActionListener(this);

        // create panel to add components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2)); // change grid layout to 4x2

        // add components to the panel
        panel.add(lbl_productId);
        panel.add(txt_productId);
        panel.add(lbl_productName);
        panel.add(txt_productName);
        panel.add(lbl_productPrice); // add new label to the panel
        panel.add(txt_productPrice); // add new text field to the panel
        panel.add(btn_submit);

        // add panel to the frame
        f.add(panel);
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String productId = txt_productId.getText();
        String productName = txt_productName.getText();
        String productPrice = txt_productPrice.getText(); // get product price from the text field

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/grocery", "root", "");
            String sql = "INSERT INTO Products VALUES (?, ?, ?)"; // modify SQL query to insert product price
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, productId);
            pstmt.setString(2, productName);
            pstmt.setString(3, productPrice); // set product price in the prepared statement
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added successfully!");
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
