
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {
		
              setBounds(300,300,1366,565);  // frame size
                setLayout(null);
               
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first1.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1350, 560,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                l1.setBounds(0,0,1366,565);
                add(l1);
                
                JLabel l2=new JLabel("HOTEL MANAGEMENT SYSTEM");
                l2.setBounds(20, 0, 1000,90);
                l2.setForeground(Color.RED);
                l2.setFont(new Font("Arial",Font.PLAIN,50));
                l1.add(l2);
                
                b1 = new JButton("Next");
                b1.setFont(new Font("Arial",Font.PLAIN,30));
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
                b1.setBounds(1030, 460, 150, 50);
                //b1.setBounds(1170,325,150,50);
                l1.add(b1);
                b1.addActionListener(this);
                
                setVisible(true);
                while(true)
                {
                    l2.setVisible(false);
                    try{
                        Thread.sleep(500);
                    }
                    catch(Exception e)
                    {
                        
                    }
                    l2.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }
                    catch(Exception e)
                    {
                        
                    }
                }
                
		
	}
        
        public void actionPerformed(ActionEvent ae){
               new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
           new HotelManagementSystem().setVisible(true);
	}
}
