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
public class docLogin {
    public static void main(String[] args)
    {
        cDocLogin obj = new cDocLogin();
    }
    
}

class cDocLogin extends JFrame
{
JLabel l1,Exp,img;
JTextField t1;
JButton b1,b2;
JPanel panel; 

public cDocLogin()
{
  setTitle("V-care: Login");
  setVisible(true);
  
  panel = new JPanel();
  panel.setBounds(250,125,550,400);
  panel.setBackground(new Color(0,0,0,125));
  
  l1 = new JLabel("VERIFICATION ");
  l1.setBounds(375,185,500,50);
  l1.setForeground(Color.WHITE);
  l1.setFont(new Font("Serif", Font.BOLD, 40)); 

  Exp = new JLabel();
  Exp.setBounds(385,425,270,60);
  Exp.setForeground(Color.WHITE);
  Exp.setFont(new Font("Serif", Font.BOLD, 14));

  t1 = new JTextField();
  t1.setBounds(325,325,400,30);
   
  img = new JLabel(new ImageIcon("hLogin.jpg")); 
  img.setBounds(0,0,1100,700);

  //button for ------------------ verification
  b1 = new JButton("VERIFY");
  b1.setBounds(475,375,100,30);
  b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
   {
    String pass = "WESAVELIFES";
    String enterpass = t1.getText();
    if (pass.equals(enterpass)) {
        cDocMain d=new cDocMain();
        dispose();
    }
    else {
      Exp.setText("      Wrong password, ENTRY DENIED!!!");
      
    }
     
  }}
);
  
  
  //button ----------------------- to go back
  b2 = new JButton("Back");
  b2.setBounds(25,25,70,30);
  b2.setForeground(Color.WHITE);
  b2.setFont(new Font("Serif", Font.BOLD, 15));
  b2.setBackground(Color.black);
  b2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
   {
    cHome f=new cHome();
    dispose();
  }}
);


  add(l1);
  add(Exp);
  add(t1);
  add(b1);
  add(img);
  img.add(panel);
  img.add(b2);
  

  setLayout(null);
  setSize(1100,700);
   
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
