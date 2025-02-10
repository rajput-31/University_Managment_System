
package university.managment.system;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class Studentfeeform extends JFrame implements ActionListener{
    
    Choice crollno;
    JComboBox cbcource , cbbranch , cbsemester;
    JLabel labletotal;
    JButton update , pay , back ;
    
    Studentfeeform(){
        setSize(900 ,500);
        setLocation(300 , 100);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 50, 500, 300);
        add(image);
        
       
        
        JLabel lblrollnumber =new JLabel("Select Roll No");
        lblrollnumber.setBounds(40, 60, 150, 20);
        lblrollnumber.setFont(new Font("Tahoma" , Font.BOLD, 16));
        add(lblrollnumber);
        
        crollno =new Choice();
        crollno.setBounds(200, 60, 150, 20);
        add(crollno);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student"); //sql query
            while (rs.next()){
                crollno.add(rs.getString("rollno"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        //-----------------------------------------------name --------------------------------------
        
        JLabel lblname = new JLabel ("Name");
        lblname.setBounds(40 ,100,150,20);
        lblname.setFont(new Font("Tahoma" , Font.BOLD, 16));
        add(lblname);
                
        JLabel labelname = new JLabel();
        labelname.setBounds(200,100,150,20);
        labelname.setFont(new Font("Tahoma" , Font.PLAIN, 16));
        add(labelname);
        
        //------------------------------------father name-------------------------------------------
        
        JLabel lblfname = new JLabel ("Father's Name");
        lblfname.setBounds(40 ,140,150,20);
        lblfname.setFont(new Font("Tahoma" , Font.BOLD, 16));
        add(lblfname);
        
        JLabel labelfname = new JLabel();
        labelfname.setBounds(200,140,150,20);
        labelfname.setFont(new Font("Tahoma" , Font.PLAIN, 16));
        add(labelfname);
        
        try{
            
            Conn c = new Conn();
            String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        crollno.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie){
                
                      
        try{
            
            Conn c = new Conn();
            String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }                
                
            }
            
        });
        
        
        JLabel lblcource = new JLabel ("Cource");
        lblcource.setBounds(40 ,180,150,20);
        lblcource.setFont(new Font("Tahoma" , Font.BOLD, 16));
        add(lblcource);
        
       //-----Dropdown for cources
       
       String cource[]={"BCA" ,"MCA" , "BBA" ,"MBA","B.com","M.com","B.sc","M.sc","B.A" , "M.A"};//ceate array for cource dorpdown
                                               
        
        cbcource= new JComboBox(cource);// array passing
        cbcource.setBounds(200 , 180 ,150 , 20);
        cbcource.setBackground(Color.WHITE); //Background color for dropdow box
        add(cbcource);
        
        //---------------------------------------------Branches---------------------------------------------
        
        JLabel lblbranch = new JLabel ("Branches");
        lblbranch.setBounds(40 ,220,150,20);
        lblbranch.setFont(new Font("Tahoma" , Font.BOLD, 16));
        add(lblbranch);
        
       //-----dropdown for branches
       
       String branch[]={"Computer Science " ,"Law" , "Mechanical " , "Electric  " ,"Electronic " , "Aeronotical " ,"Civil" ,"IT"};//ceate array for cource dorpdown
                                               
        
        cbbranch= new JComboBox(branch);// array passing
        cbbranch.setBounds(200 , 220,150 , 20);
        cbbranch.setBackground(Color.WHITE); //Background color for dropdow box
        add(cbbranch);
        
        JLabel lblsemester =new JLabel(" Semester ");
        lblsemester.setBounds(40, 260, 150, 20);
        lblsemester.setFont(new Font("Tahoma" , Font.BOLD, 16));
        add(lblsemester);
        
        String semester[] = {"semester1" ,"semester2" ,"semester3" ,"semester4" ,"semester5" ,"semester6"};
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(200, 260, 150, 20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);
        
        
        JLabel lbltotal = new JLabel ("Total Payable");
        lbltotal.setBounds(40 ,300,150,20);
        lbltotal.setFont(new Font("Tahoma" , Font.BOLD, 18));
        add(lbltotal);
        
         labletotal= new JLabel ();
        labletotal.setBounds(200 ,300,150,20);
        labletotal.setFont(new Font("Tahoma" , Font.PLAIN, 16));
        add(labletotal);
        
        //-------------------------------------------Create button Submit & Cancel --------------------------------------
        
        update =  new JButton("Update");
        update.setBounds(30 , 380 , 100 , 25);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        
        pay =  new JButton("Pay fee");
        pay.setBounds(150 , 380 , 100 , 25);
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.WHITE);
        pay.addActionListener(this);
        pay.setFont(new Font("Tahoma" ,Font.BOLD , 15));
        add(pay);
        
        
        back =  new JButton("Back");
        back.setBounds(270 , 380 , 100 , 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setFont(new Font("Tahoma" ,Font.BOLD , 15));
        add(back);
        
                      
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == update){
            String cource = (String)cbcource.getSelectedItem(); // cbcource type cast
            String semester = (String)cbsemester.getSelectedItem();
            
            try{
                Conn c = new Conn();
                ResultSet rs= c.s.executeQuery("select * from fee where cource ='"+cource+"'  ");
                
                while(rs.next()){
                    labletotal.setText(rs.getString(semester));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if (ae.getSource() == pay){
            String rollno = crollno.getSelectedItem();
            String cource = (String)cbcource.getSelectedItem(); // cbcource type cast
            String semester = (String)cbsemester.getSelectedItem();
            String branch = (String)cbbranch.getSelectedItem();
            String total = labletotal.getText();
            
            try{
                Conn c = new Conn();
                String query = "insert into collegefee values('"+rollno+"' , '"+cource+"' , '"+branch+"' , '"+semester+"' , '"+total+"')";
              c.s.executeUpdate(query);
              
              JOptionPane.showMessageDialog(null, "College fee Submitted Successfully!!!");
              setVisible(false);
              
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Studentfeeform();
    }
}
