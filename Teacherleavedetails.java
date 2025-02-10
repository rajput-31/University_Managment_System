
package university.managment.system;


import javax.swing.*;// user for extedns JFrame class
import java.awt.*; // use for color class
import java.sql.*;// user for resulset class
import net.proteanit.sql.DbUtils; // user for directly values inset into table
import java.awt.event.*;


public class Teacherleavedetails  extends JFrame implements ActionListener{
    Choice cempId;
    JTable table;
    JButton search , print , cancel;
    
    Teacherleavedetails(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       //-------------------------------------------------------------------------Search roll number 
        JLabel heading =new JLabel("Search by Teacher Id");
        heading.setBounds(20, 20, 150, 20);
        add(heading);
        
        cempId =new Choice();
        cempId.setBounds(180, 20, 150, 20);
        add(cempId);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher"); //sql query
            while (rs.next()){
                cempId.add(rs.getString("empId"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        table = new JTable();
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacherleave"); //sql query
            
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
       
       
       cancel = new JButton("Cancel");
       cancel.setBounds(220, 70, 80, 20);
       cancel.addActionListener(this);
       add(cancel);
       
       
               
        //Set frame size for student details 
        setSize(900,700);
        setLocation(350,100);
        setVisible(true); // display frame
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == search){
            String query = "select * from teacherleave where rollno = '"+cempId.getSelectedItem()+"'";
            
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
        } else {
            setVisible(false); // reflect cancel button
        }
    }
    
    public static void main(String[]args){
        new  Teacherleavedetails();
    }
}
