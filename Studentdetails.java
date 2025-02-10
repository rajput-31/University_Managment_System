
package university.managment.system;


import javax.swing.*;// user for extedns JFrame class
import java.awt.*; // use for color class
import java.sql.*;// user for resulset class
import net.proteanit.sql.DbUtils; // user for directly values insert into table
import java.awt.event.*;


public class Studentdetails  extends JFrame implements ActionListener{
    Choice crollno;
    JTable table;
    JButton search , print , update , add , cancel;
    
    Studentdetails(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       //-------------------------------------------------------------------------Search roll number 
        JLabel heading =new JLabel("Search by Roll Number");
        heading.setBounds(20, 20, 150, 20);
        add(heading);
        
        crollno =new Choice();
        crollno.setBounds(180, 20, 150, 20);
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
        
        
        table = new JTable();
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student"); //sql query
            
            table.setModel(DbUtils.resultSetToTableModel(rs));//show dtable data
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
        
        
        //---------------------------------------------------------------------Create buttons
        
        //serach button
        search = new JButton("Serach");
       search.setBounds(20, 70, 80, 20);
       search.addActionListener(this);
       add(search);
       
       //
       
       print = new JButton("Print");
       print.setBounds(120, 70, 80, 20);
       print.addActionListener(this);
       add(print);
       
       //
       
       add = new JButton("Add");
       add.setBounds(220, 70, 80, 20);
       add.addActionListener(this);
       add(add);
       
       //
       
       update = new JButton("Update");
       update.setBounds(320, 70, 80, 20);
       update.addActionListener(this);
       add(update);
       
       //
       
       cancel = new JButton("Cancel");
       cancel.setBounds(420, 70, 80, 20);
       cancel.addActionListener(this);
       add(cancel);
       
       
               
        //Set frame size for student details 
        setSize(900,700);
        setLocation(350,100);
        setVisible(true); // display frame
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == search){
            String query = "select * from student where rollno = '"+crollno.getSelectedItem()+"'";
            
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                e.printStackTrace();
            }
                    
        }else if(ae.getSource() == print){
            try{
                table.print(); // open printer commands
                
            }catch(Exception e){
                e.printStackTrace();
            }
        } else if(ae.getSource()  == add){
            setVisible(false);
            new Addstudent(); // call addstudent class
            
        } else if(ae.getSource()  == update){
            setVisible(false);
            new Updatestudent(); // call updatestudent class
           
        }else {
            setVisible(false); // reflect cancel button
        }
    }
    
    public static void main(String[]args){
        new  Studentdetails();
    }
}
