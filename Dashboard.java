 
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem mi1,mi2,mi3,mi4;
    
    public Dashboard() {
       mb=new JMenuBar();
       add(mb);
       
       m1=new JMenu("Hotel Management");
       m1.setForeground(Color.RED);
       mb.add(m1);
       
       m2=new JMenu("Admin");
       m2.setForeground(Color.BLUE);
       mb.add(m2);
       
       mi1=new JMenuItem("RECEPTION");
       m1.add(mi1);
       mi1.addActionListener(this);
       
       mi2=new JMenuItem("ADD EMPLOYEES");
       m2.add(mi2);
       mi2.addActionListener(this);
       mi3=new JMenuItem("ADD ROOMS");
       m2.add(mi3);
       mi3.addActionListener(this);
       mi4=new JMenuItem("ADD DRIVERS");
       m2.add(mi4);
       mi4.addActionListener(this);
       
       mb.setBounds(0, 0, 1900, 30);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel l2 = new JLabel("ABC GROUP WELCOMES YOU");
	l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 46));
	l2.setBounds(600, 60, 1000, 85);
	NewLabel.add(l2);
       
        setLayout(null);
        setBounds(0, 0, 1950, 1020);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("RECEPTION")){
            new Reception().setVisible(true);
        }
        else if(e.getActionCommand().equals("ADD EMPLOYEES")){
            new AddEmployee().setVisible(true);
            
        }
        else if(e.getActionCommand().equals("ADD ROOMS")){
            new AddRoom().setVisible(true);
        }
        else if(e.getActionCommand().equals("ADD DRIVERS")){
            new AddDrivers().setVisible(true);
        }
    }
    
}



