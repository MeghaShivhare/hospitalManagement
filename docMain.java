/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;
import java.awt.event.*;
import java.awt.*;  
import javax.swing.*; 
import java.io.*;
/**
 *
 * @author user
 */
public class docMain {
    public static void main(String[] args)
    {
        cDocMain obj = new cDocMain();
    }
    
}

class cDocMain extends JFrame{
  JFrame frame = new JFrame();
  JLabel l1,l2,l3,lExp,img;
  JTextField t1,t2,t3;
  JButton b1,b2;
  JPanel panel,panel1;
  
  public cDocMain()
  {
  setTitle("V-Care: Doctor Main");
  setVisible(true);
  
  l1 = new JLabel("Symptom you want to add: ");
  l1.setBounds(50,150,400,30);
  l1.setForeground(Color.white);
  l1.setFont(new Font("Serif", Font.BOLD, 20)); 

  l2 = new JLabel("Remedies");
  l2.setBounds(50,250,400,30);
  l2.setForeground(Color.white);
  l2.setFont(new Font("Serif", Font.BOLD, 20));

  l3 = new JLabel("Medicines");
  l3.setBounds(50,350,400,30);
  l3.setForeground(Color.white);
  l3.setFont(new Font("Serif", Font.BOLD, 20));


  lExp = new JLabel();
  lExp.setBounds(50,200,400,60);
  
  img = new JLabel(new ImageIcon("docMain.jpg")); 
  img.setBounds(525,0,575,500);

  t1 = new JTextField();
  t1.setBounds(50,200,400,30);

  t2 = new JTextField();
  t2.setBounds(50,300,400,30);

  t3 = new JTextField();
  t3.setBounds(50,400,400,30);
  
  panel = new JPanel();
  panel.setBounds(525, 500, 575, 200);
  panel.setBackground(Color.black);
  panel.setForeground(Color.white);
  
  panel1 = new JPanel();
  panel1.setBounds(0, 0, 525, 700);
  panel1.setBackground(Color.gray);
  panel1.setForeground(Color.white);

  //button to add information about a new symptom
  b1 = new JButton("Add");
  b1.setBounds(50,500,100,30);
  b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e) 
   { 
    try {
    //Adding content to files-----------------remedies
    String sym = t1.getText();
    String txt = ".txt";
    String c = sym.concat(txt);
    FileWriter fos1 = new FileWriter(c); 

    String symrem = t2.getText();
    fos1.write(symrem);
    fos1.close(); 

    //Adding content to files-----------------medicines
    String txtmed = "med.txt";
    String cmed = sym.concat(txtmed);
    FileWriter fos2 = new FileWriter(cmed); 

    String symmed = t3.getText();
    fos2.write(symmed);
    fos2.close(); 
    }
    catch(Exception exp)
    { System.out.println(exp); 
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


  add(b2);
  add(l1);
  add(l2);
  add(l3);
  add(lExp);
  add(t1);
  add(t2);
  add(t3);
  add(b1);
  add(img);
  add(panel);
  add(panel1);
  

  setLayout(null);
  setSize(1100,700);
   
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }
}
