
package university.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; // resultset class import

public class Updateteacher extends JFrame implements ActionListener{
    
    JTextField tfcource, tfaddress , tfphone , tfemail ,tfbranch ; // Student persoal details declare
    JLabel labelEmpId; // roll number declare
    JButton submit ,cancel; // declare button
    Choice cEmpId;
    
    Updateteacher(){
        
        //Set frame size for student details 
        setSize(900,650);
        setLocation(350,50);
        
        setLayout(null);
        
        JLabel heading = new JLabel ("Update Teacher Details");
        heading.setBounds(50 ,10,500,50);
        heading.setFont(new Font("Tahoma" , Font.BOLD, 35));
        add(heading);
        
        JLabel lblrollnumber =new JLabel("Select Teacher Id");
        lblrollnumber.setBounds(50, 100, 200, 20);
        lblrollnumber.setFont(new Font("serif" , Font.PLAIN, 20));
        add(lblrollnumber);
        
        cEmpId =new Choice();
        cEmpId.setBounds(250, 100, 200, 20);
        add(cEmpId);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher"); //sql query
            while (rs.next()){
                cEmpId.add(rs.getString("empid"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        //-----------------------------------------------name --------------------------------------
        
        JLabel lblname = new JLabel ("Name");
        lblname.setBounds(50 ,150,100,30);
        lblname.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblname);
        
        
        
        JLabel labelname = new JLabel();
        labelname.setBounds(200,150,150,30);
        labelname.setFont(new Font("Tahoma" , Font.PLAIN, 18));
        add(labelname);
        
        //------------------------------------father name-------------------------------------------
        
        JLabel lblfname = new JLabel ("Father's Name");
        lblfname.setBounds(400 ,150,200,30);
        lblfname.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblfname);
        
        JLabel labelfname = new JLabel();
        labelfname.setBounds(600,150,150,30);
        labelfname.setFont(new Font("Tahoma" , Font.PLAIN, 18));
        add(labelfname);
        
        //---------------------------------Emp ID-----------------------------------------------
        
        JLabel lblrollno = new JLabel ("Teacher Id");
        lblrollno.setBounds(50 ,200,200,30);
        lblrollno.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblrollno);
        
        labelEmpId = new JLabel ();
        labelEmpId.setBounds(200 ,200,200,30);
        labelEmpId.setFont(new Font("seril" , Font.PLAIN, 20));
        add(labelEmpId);
        
        //-------------------------------------DOB---------------------------------------------------
        
        JLabel lbldob = new JLabel ("Date of Birth");
        lbldob.setBounds(400 ,200,200,30);
        lbldob.setFont(new Font("seril" , Font.BOLD, 20));
        add(lbldob);
        
        JLabel labeldob = new JLabel();
        labeldob.setBounds(600,200, 150, 30);
        labeldob.setFont(new Font("Tahoma" , Font.PLAIN, 18));
        add(labeldob);
        
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
        
        JLabel labelx = new JLabel();
        labelx.setBounds(600,300,150,30);
        labelx.setFont(new Font("seril" , Font.PLAIN, 18));
        add(labelx);
        
        //------------------------------------------Class 12th %----------------------------------------------------
        JLabel lblxii = new JLabel (" Class XII (%)");
        lblxii.setBounds(50 ,350,200,30);
        lblxii.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblxii);
        
        JLabel labelxii = new JLabel();
        labelxii.setBounds(200,350,150,30);
        labelxii.setFont(new Font("seril" , Font.PLAIN, 18));
        add(labelxii);
        
        //-------------------------------------------Adhar number ----------------------------------------------------
        
        JLabel lblaadhar = new JLabel ("Aadhar number");
        lblaadhar.setBounds(400 ,350,200,30);
        lblaadhar.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblaadhar);
        
        JLabel labelaadhar = new JLabel();
        labelaadhar.setBounds(600,350,150,30);
        labelaadhar.setFont(new Font("seril" , Font.PLAIN, 18));
        add(labelaadhar);
        
        //------------------------------------Education------------------------------------------------------------------
        
        JLabel lblcource = new JLabel ("Education");
        lblcource.setBounds(50 ,400,200,30);
        lblcource.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblcource);
       
        tfcource= new JTextField();
        tfcource.setBounds(200 , 400 ,150 , 30);
        add(tfcource);
        
        //---------------------------------------------Department---------------------------------------------
        
        JLabel lblbranch = new JLabel ("Department");
        lblbranch.setBounds(400 ,400,200,30);
        lblbranch.setFont(new Font("seril" , Font.BOLD, 20));
        add(lblbranch);
        
       
        tfbranch= new JTextField();
        tfbranch.setBounds(600 , 400,150 , 30);
        add(tfbranch);
        
        
        //-------------------------------------------Create button Submit & Cancel --------------------------------------
        
        try{
            
            Conn c = new Conn();
            String query = "select * from teacher where empId='"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labelname.setText(rs.getString("name"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
                labelEmpId.setText(rs.getString("empId"));
                tfcource.setText(rs.getString("education"));
                tfbranch.setText(rs.getString("department"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie){
                
                      
        try{
            
             Conn c = new Conn();
            String query = "select * from teacher where empId='"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labelname.setText(rs.getString("name"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
                labelEmpId.setText(rs.getString("empId"));
                tfcource.setText(rs.getString("education"));
                tfbranch.setText(rs.getString("department"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }                
                
            }
            
        });
        
        submit =  new JButton("Update");
        submit.setBounds(250 , 500 , 120 , 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma" ,Font.BOLD , 15));
        add(submit);
        
        
        cancel =  new JButton("Cancel");
        cancel.setBounds(450 , 500 , 120 , 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        submit.addActionListener(this);
        cancel.setFont(new Font("Tahoma" ,Font.BOLD , 15));
        add(cancel);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==submit) {
            
            String empId = labelEmpId.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String cource =tfcource.getText();
            String branch =tfbranch.getText();
            
            try{
                   String query = "update teacher set address='" + address + "', phone='" + phone + "', email='" + email + "', education='" + cource + "', department='" + branch + "' where empId='" + empId + "'";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student details Updated Successfully !!");
                
                setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Updateteacher();
    }
    
}

