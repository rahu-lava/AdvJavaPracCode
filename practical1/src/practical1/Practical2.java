/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical1;
import javax.swing.*;
import java.awt.event.*;
class Studentdetails{
JFrame f;
Studentdetails(){
f=new JFrame();
String
data[][]={{"101","Amit","670000"},{"102","Jai","7800000"},{"101","Sachin","7000000"}};
String column[]={"ID","NAME","SALARY"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp=new JScrollPane(jt);
f.add(sp);
f.setSize(300,400);
f.setVisible(true);
}
}
class SQualification{
JFrame f;
SQualification(){
f=new JFrame();
String data[][]={{"101","Amit","BSC CS"},{"102","Jai","MSCCS"},{"101","Sachin","12thPass"}};
String column[]={"ID","NAME","EDUCATION"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp=new JScrollPane(jt);
f.add(sp);
f.setSize(300,400);
f.setVisible(true);
}
}
class Subjects1{
JFrame f;
Subjects1(){
f=new JFrame();
String data[][]={{"Advance Java","Shivani mam"},{".Net","Nilammam"},{"Android","Pooja mam"}};
String column[]={"SUBJECT","FACULTY"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp=new JScrollPane(jt);
f.add(sp);
f.setSize(300,400);
f.setVisible(true);
}
}
public class Practical2 implements ActionListener{
JFrame f;
JMenuBar mb;
JMenu Teachers,Students,help;
JMenuItem Subjects,SQualification,Studentdetails;
Practical2(){
f=new JFrame();
mb=new JMenuBar();
Teachers=new JMenu("Teachers");
Students=new JMenu("Students");
help=new JMenu("help");
Subjects= new JMenuItem("Subjects");
SQualification=new JMenuItem("SQualification");
Studentdetails=new JMenuItem("Studentdetails");
Students.add(Subjects);
Students.add(SQualification);
Students.add(Studentdetails);
mb.add(Teachers);
mb.add(Students);
mb.add(help);
f.add(mb);
f.setJMenuBar(mb);
Subjects.addActionListener(this);
SQualification.addActionListener(this);
Studentdetails.addActionListener(this);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==Subjects)
    new Subjects1();
if(e.getSource()==SQualification)
    new SQualification();
if(e.getSource()==Studentdetails)
    new Studentdetails();
}
public static void main(String[] args) {
    new Practical2();
}
}