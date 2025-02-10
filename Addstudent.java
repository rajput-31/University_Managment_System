
package university.managment.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Addstudent extends JFrame implements ActionListener{
    
    JTextField tfname,tffname, tfaddress , tfphone , tfemail ,tfx , tfxii , tfaadhar; // Student persoal details declare
    JLabel labelrollno; // roll number declare
    JDateChooser dcdob; //DOB declare
    JComboBox cbcource , cbbranch; // dropdown option declare
    JButton submit ,cancel; // declare button
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
            
    Addstudent(){
        
        //Set frame size for student details 
        setSize(900,700);
        setLocation(350,50);
        
        setLayout(null);
        
        JLabel heading = new JLabel ("New Student Details");
        heading.setBounds(310 ,30,500,50);
        heading.setFont(new Font("seril" , Font.BOLD, 30));
        add(heading);
        
        //-----------------------------------------------name --------------------------------------
        
        JLabel lblname = new JLabel ("Name");
        lblname.setBounds(50 ,150,100,30);
        lblname.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
        //------------------------------------father name-------------------------------------------
        
        JLabel lblfname = new JLabel ("Last Name");
        lblfname.setBounds(400 ,150,200,30);
        lblfname.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        
        //---------------------------------Roll number-----------------------------------------------
        
        JLabel lblrollno = new JLabel ("Roll Number");
        lblrollno.setBounds(50 ,200,200,30);
        lblrollno.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblrollno);
        
        labelrollno = new JLabel ("21010"+first4);
        labelrollno.setBounds(200 ,200,200,30);
        labelrollno.setFont(new Font("seril" , Font.BOLD, 20));
        add(labelrollno);
        
        //-------------------------------------DOB---------------------------------------------------
        
        JLabel lbldob = new JLabel ("Date of Birth");
        lbldob.setBounds(400 ,200,200,30);
        lbldob.setFont(new Font("seril" , Font.BOLD, 20));
        add(lbldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600,200, 150, 30);
        add(dcdob);
        
        //-------------------------------------------address------------------------------------------
        JLabel lbladdress = new JLabel (" Address");
        lbladdress.setBounds(50 ,250,200,30);
        lbladdress.setFont(new Font("seril" , Font.BOLD, 20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
        
        //-----------------------------------------Phone details ------------------------------------
        
        JLabel lblphone = new JLabel ("Phone Number");
        lblphone.setBounds(400 ,250,200,30);
        lblphone.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        
        //----------------------------------------------Email ID-------------------------------------------------
        
         JLabel lblemail = new JLabel (" Email ID");
        lblemail.setBounds(50 ,300,200,30);
        lblemail.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        //-----------------------------------------Class 10th % ------------------------------------
        
        JLabel lblx = new JLabel ("Class X (%)");
        lblx.setBounds(400 ,300,200,30);
        lblx.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblx);
        
        tfx = new JTextField();
        tfx.setBounds(600,300,150,30);
        add(tfx);
        
        //------------------------------------------Class 12th %----------------------------------------------------
        JLabel lblxii = new JLabel (" Class XII (%)");
        lblxii.setBounds(50 ,350,200,30);
        lblxii.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblxii);
        
        tfxii = new JTextField();
        tfxii.setBounds(200,350,150,30);
        add(tfxii);
        
        //-------------------------------------------Adhar number ----------------------------------------------------
        
        JLabel lblaadhar = new JLabel ("Aadhar number");
        lblaadhar.setBounds(400 ,350,200,30);
        lblaadhar.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600,350,150,30);
        add(tfaadhar);
        
        //------------------------------------Cource------------------------------------------------------------------
        
        JLabel lblcource = new JLabel ("Cource");
        lblcource.setBounds(50 ,400,200,30);
        lblcource.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblcource);
        
       //-----Dropdown for cources
       
       String cource[]={"BCA" ,"MCA" , "BBA" ,"MBA","B.tech" ,"M.tech","B.com","M.com","B.A" , "M.A"};//ceate array for cource dorpdown
                                               
        
        cbcource= new JComboBox(cource);// array passing
        cbcource.setBounds(200 , 400 ,150 , 30);
        cbcource.setBackground(Color.WHITE); //Background color for dropdow box
        add(cbcource);
        
        //---------------------------------------------Branches---------------------------------------------
        
        JLabel lblbranch = new JLabel ("Branches");
        lblbranch.setBounds(400 ,400,200,30);
        lblbranch.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblbranch);
        
       //-----dropdown for branches
       
       String branch[]={"Computer Science " ,"Law" , "Mechanical " , "Electric  " ,"Electronic " , "Aeronotical " ,"Civil" ,"IT"};//ceate array for cource dorpdown
                                               
        
        cbbranch= new JComboBox(branch);// array passing
        cbbranch.setBounds(600 , 400,150 , 30);
        cbbranch.setBackground(Color.WHITE); //Background color for dropdow box
        add(cbbranch);
        
        
        //-------------------------------------------Create button Submit & Cancel --------------------------------------
        
        submit =  new JButton("Submit");
        submit.setBounds(250 , 550 , 120 , 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma" ,Font.BOLD , 15));
        add(submit);
        
        
        cancel =  new JButton("Cancel");
        cancel.setBounds(450 , 550 , 120 , 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        submit.addActionListener(this);
        cancel.setFont(new Font("Tahoma" ,Font.BOLD , 15));
        add(cancel);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==submit) {
            String name = tfname.getText();
            String fname= tffname.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField)this.dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String cource =(String)cbcource.getSelectedItem();
            String branch =(String)cbbranch.getSelectedItem();
            
            try{
                String query = "insert into student values ('"+name+"' , '"+fname+"' ,'"+rollno+"' , '"+dob+"' , '"+address+"' ,'"+phone+"' , '"+email+"' , '"+x+"' , '"+xii+"' ,'"+aadhar+"' , '"+cource+"'  ,'"+branch+"' )";//DML command for database (update)
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student details inserted successfully !!");
                
                setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Addstudent();
    }
    
}
