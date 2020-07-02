/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener{
    
     
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JComboBox c1;
    JRadioButton male,female;
            
    public AddEmployee(){
        getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("ADD EMPLOYEE DETAILS");
            
        JLabel name=new JLabel("NAME");
        name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        name.setBounds(60, 30, 150, 27);
        add(name);
        
        t1 = new JTextField();
            t1.setBounds(200, 30, 150, 27);
            add(t1);
        
        JLabel age = new JLabel("AGE");
        age.setFont(new Font("Tahoma", Font.PLAIN, 17));
        age.setBounds(60, 80, 150, 27);
        add(age);
        
        t2 = new JTextField();
            t2.setBounds(200, 80, 150, 27);
            add(t2);
        
        JLabel Gender = new JLabel("GENDER");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Gender.setBounds(60, 120, 150, 27);
        add(Gender);
        
         male = new JRadioButton("MALE");
            male.setBackground(Color.WHITE);
            male.setBounds(200, 120, 70, 27);
            add(male);
	
             female = new JRadioButton("FEMALE");
            female.setBackground(Color.WHITE);
            female.setBounds(280, 120, 70, 27);
            add(female);
        
        JLabel job = new JLabel("JOB");
        job.setFont(new Font("Tahoma", Font.PLAIN, 17));
        job.setBounds(60, 170, 150, 27);
        add(job);
        
        String course[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
            c1 = new JComboBox(course);
            c1.setBackground(Color.WHITE);
            c1.setBounds(200,170,150,30);
            add(c1);
            
        JLabel salary = new JLabel("SALARY");
        salary.setFont(new Font("Tahoma", Font.PLAIN, 17));
        salary.setBounds(60, 220, 150, 27);
        add(salary);
        
        t3 = new JTextField();
            t3.setBounds(200, 220, 150, 27);
            add(t3);
        
        JLabel phone = new JLabel("PHONE");
        phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
        phone.setBounds(60, 270, 150, 27);
        add(phone);
        
        t4 = new JTextField();
            t4.setBounds(200, 270, 150, 27);
            add(t4);
            
        JLabel aadhar = new JLabel("AADHAR");
            aadhar.setFont(new Font("Tahoma", Font.PLAIN, 17));
            aadhar.setBounds(60, 320, 150, 27);
            add(aadhar);  
            
         t5 = new JTextField();
            t5.setBounds(200, 320, 150, 27);
            add(t5);
        
        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma", Font.PLAIN, 17));
        email.setBounds(60, 370, 150, 27);
        add(email);
        
        t6 = new JTextField();
            t6.setBounds(200, 370, 150, 27);
            add(t6);
        
        JLabel Addemployees = new JLabel("ADD EMPLOYEE DETAILS");
            Addemployees.setForeground(Color.BLUE);
            Addemployees.setFont(new Font("Tahoma", Font.PLAIN, 31));
            Addemployees.setBounds(450, 24, 442, 35);
            add(Addemployees);
            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/tenth.jpg"));
            Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel image = new JLabel(i2);
            image.setBounds(410,80,480,410);
            add(image);
        
        JButton b1 = new JButton("SUBMIT");
            b1.setBounds(200, 420, 150, 30);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            add(b1);
            
        setLayout(null);
        setBounds(530, 200, 900, 600);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        String name = t1.getText();
        String age = t2.getText();
        String salary = t3.getText();
        String phone = t4.getText();
        String aadhar = t5.getText();
        String email = t6.getText();
        String gender = null;
                    
                    if(male.isSelected()){
                        gender = "male";
                    
                    }else if(female.isSelected()){
                        gender = "female";
                    }
        String s6 = (String)c1.getSelectedItem();
        try {
                        conn c = new conn();
                        String str = "INSERT INTO employee values( '"+name+"', '"+age+"', '"+gender+"','"+s6+"', '"+salary+"', '"+phone+"','"+aadhar+"', '"+email+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Employee Added");
                        setVisible(false);
                    
                    } catch (Exception ex) {
                        ex.printStackTrace();
        	    }
    }
    
    public static void main(String[] args){
        new AddEmployee();
    }  

    
}
