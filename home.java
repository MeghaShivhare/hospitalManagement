/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.awt.event.*;
import java.awt.*;  
import javax.swing.*;  

/**
 *
 * @author user
 */
public class home {
    public static void main(String args[])
    {
        cHome obj = new cHome();
    }
    
}

class cHome extends JFrame
{
    JPanel panel;
    JLabel l1,l2,logo,hospital;
    JButton b1,b2;
    
    public cHome()
    {
    setTitle("V-care: Home");
    setVisible(true);
    panel=new JPanel();  
    panel.setBounds(0,0,1100,700);    
    panel.setBackground(Color.black); 
    
    l1 = new JLabel("WE SAVE LIFES");
    l1.setForeground(Color.WHITE);
    l1.setFont(new Font("Serif", Font.BOLD, 60)); 
    l1.setBounds(160,60,600,60);
    
    l2 = new JLabel("V-care multispeciality hospital");
    l2.setForeground(Color.WHITE);
    l2.setFont(new Font("Serif", Font.BOLD, 25)); 
    l2.setBounds(170,115,600,60);
    
    logo = new JLabel(new ImageIcon("logo1.png")); 
    logo.setBounds(20,30,143,160);
    
    hospital = new JLabel(new ImageIcon("hospital1.jpg")); 
    hospital.setBounds(325,200,700,400);
    
    b1=new JButton("DOCTORS");  
    b1.setBounds(50,400,175,60); 
    b1.setForeground(Color.WHITE);
    b1.setBackground(Color.black);
    b1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
    cDocLogin f=new cDocLogin();
    dispose();
     
    }}
    );
    
    b2=new JButton("PATIENTS");  
    b2.setBounds(50,500,175,60); 
    b2.setForeground(Color.WHITE);
    b2.setBackground(Color.black);
    b2.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
    cPatient f=new cPatient();
    dispose();
     
    }}
    );

    panel.setLayout(null); 
    panel.setVisible(true);
    panel.add(l1);
    panel.add(l2); 
    panel.add(logo); 
    panel.add(hospital);
    panel.add(b1);
    panel.add(b2); 
    
    add(panel);  
    setSize(1100,700);    
    setLayout(null);    
    setVisible(true);
  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

