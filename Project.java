
package university.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    Project(){
         setSize(1540 ,850);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
         
        JMenuBar mb = new JMenuBar();
        
        //--------------------------------------------------------------------------New Information
        
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
         mb.add(newInformation);
        
        //Menu items
        JMenuItem facultyinfo = new JMenuItem("New Faculty Information");
        facultyinfo.setBackground(Color.WHITE);
        facultyinfo.addActionListener(this);
        newInformation.add(facultyinfo);
        
        JMenuItem studentinfo = new JMenuItem("New Student Information");
        studentinfo.setBackground(Color.WHITE);
        studentinfo.addActionListener(this);
        newInformation.add(studentinfo);
        
        
        
        // ----------------------------------------------------------------------------------View  Details 
        
         
        JMenu details  = new JMenu("View Details");
        details.setForeground(Color.RED);
         mb.add(details);
         
        //Menu items
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        //------------------------------------------------------------------Leave  Information
        
        JMenu leave  = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
         mb.add(leave);
        
        //Menu items
        JMenuItem facultyleave = new JMenuItem(" Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem(" Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        //---------------------------------------------------------------------- Leave details
        
        JMenu leaveDetails  = new JMenu(" Leave Details");
        leaveDetails.setForeground(Color.RED);
         mb.add(leaveDetails);
        
        //Menu items
        JMenuItem facultyleavedetails = new JMenuItem(" Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem(" Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);
        
        //-------------------------------------------------------------------------Exam details
        
        JMenu exam  = new JMenu(" Examination ");
        exam.setForeground(Color.BLUE);
         mb.add(exam);
        
        //Menu items
        JMenuItem examinationdetails = new JMenuItem(" Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem(" Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //-----------------------------------------------------------------------Update Information
        
        JMenu updateInfo  = new JMenu(" Update Details ");
        updateInfo.setForeground(Color.RED);
         mb.add(updateInfo);
        
        //Menu items
        JMenuItem updatefacultyinfo = new JMenuItem(" Update Faculty Information");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem(" Update Student Information");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        
        //--------------------------------------------------------------------------Fees details
        
        JMenu fee  = new JMenu(" Fee Details ");
        fee.setForeground(Color.BLUE);
         mb.add(fee);
        
        //Menu items
        JMenuItem feeStructure = new JMenuItem(" Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        feeStructure.addActionListener(this);
        fee.add(feeStructure);
        
        JMenuItem feeform = new JMenuItem(" Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
        
        //------------------------------------------------------------------------Utitility
        
       JMenu utility  = new JMenu(" Utitility ");
        utility.setForeground(Color.RED);
         mb.add(utility);
        
        //Menu items
        JMenuItem notepad = new JMenuItem(" Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        //-----------------------------------------------------------------------about
        
        
        JMenu about  = new JMenu(" About ");
         about.setForeground(Color.BLUE);
         about.addActionListener(this);
         mb.add(about);
         
         JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
       
        
        
        
        setJMenuBar(mb);
        
        setVisible(true);
           
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")){
            setVisible(false);
        }else if (msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){
                
                
            }
            
        } else if (msg.equals("New Faculty Information")) {
              new Addteachers(); //Addteahcers class call
          
        }else if (msg.equals("New Student Information")){
            new Addstudent(); //Addteahcers class call
            
        }else if (msg.equals("View Faculty Details")){
            new Teacherdetails();// Teachedetails class call
        
        }else if (msg.equals("View Student Details")){
            new Studentdetails(); // Studentsdetails class call
            
        }else if (msg.equals(" Faculty Leave")){
            new Teacherleave(); // teacherleave class call
        
        }else if (msg.equals(" Student Leave")){
            new Studentleave(); // studentleave class call
        
        }else if(msg.equals(" Faculty Leave Details")){
            new Teacherleavedetails(); // faculty leave detail call
        
        }else if(msg.equals(" Student Leave Details")){
            new Studentleavedetails(); // student leave detail call
        
        }else if(msg.equals(" Update Faculty Information")){
            new Updateteacher(); // faculty leave detail call
        
        }else if(msg.equals(" Update Student Information")){
            new Updatestudent(); // student leave detail call
        
        }else if(msg.equals(" Examination Results")){
            new Examinationdetails(); 
        
        }else if(msg.equals(" Enter Marks")){
            new Entermarks(); // examination details class call
       
        }else if(msg.equals(" Fee Structure")){
            new feesstructure();
        
        }else if(msg.equals("About")){
            new About();
        
        }else if(msg.equals(" Student Fee Form")){
            new Studentfeeform();
        }
        
        
    }
    
    
    public static void main(String[] args){
        new Project();
    }
}
