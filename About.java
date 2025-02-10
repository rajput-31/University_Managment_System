
package university.managment.system;

import javax.swing.*;
import java.awt.*;


public class About extends JFrame {
    
    
    About(){
        setSize (700 ,500);
        setLocation(400 ,200);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/> Managment System </html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma" , Font.BOLD ,30));
        add(heading);
        
        JLabel name = new JLabel("Developed By Harshada & Darshan 💻 ");
        name.setBounds(70, 220, 600, 40);
        name.setFont(new Font("Tahoma" , Font.BOLD ,30));
        add(name);
        
        
        JLabel rollno = new JLabel("Roll no : 210105011116");
        rollno.setBounds(70, 280, 500, 40);
        rollno.setFont(new Font("Tahoma" , Font.BOLD ,30));
        add(rollno);
        
        JLabel Cource = new JLabel("Cource : TYBCA");
        Cource.setBounds(70, 340, 500, 50);
        Cource.setFont(new Font("Tahoma" , Font.BOLD ,30));
        add(Cource);
        
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        
        new About();
    }
}
