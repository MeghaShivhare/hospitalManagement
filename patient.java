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
public class patient {
    public static void main(String[] args)
    {
        cPatient obj = new cPatient();
    }
    
}
class cPatient extends JFrame
{
    JFrame frame = new JFrame();
    JLabel l1,lExp,img;
    JTextField t1;
    JButton b1,b2,b3;
    JPanel panel,panel1;
    
    public cPatient()
    {
        //start
    setTitle("Online Medical Emergency System");
    setVisible(true);
  
    l1 = new JLabel("Enter your symptom : ");
    l1.setBounds(50,250,400,30);
    l1.setForeground(Color.white);
    l1.setFont(new Font("Serif", Font.BOLD, 20)); 

    lExp = new JLabel();
    lExp.setBounds(50,500,400,60);
    lExp.setForeground(Color.white);
    lExp.setFont(new Font("Serif", Font.BOLD, 20)); 

    t1 = new JTextField();
    t1.setBounds(50,300,400,30);
    
    img = new JLabel(new ImageIcon("patient.jpg")); 
    img.setBounds(525,0,575,500);
  
    panel = new JPanel();
    panel.setBounds(525, 500, 575, 200);
    panel.setBackground(Color.black);
    panel.setForeground(Color.white);
  
    panel1 = new JPanel();
    panel1.setBounds(0, 0, 525, 700);
    panel1.setBackground(Color.gray);
    panel1.setForeground(Color.white);

    //button to check for symptoms --------------- remedies
    b1 = new JButton("Remedies");
    b1.setBounds(50,375,100,30);
    b1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
    String sym = t1.getText();
    sym = sym.toLowerCase();
    String txt = ".txt";
    String c = sym.concat(txt);
    File file = new File(c);
    if (file.exists()) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file) )))
    {
        String line = null;
        while ((line = br.readLine()) != null) {
            lExp.setText(line);
      }
    } 
    catch (IOException exp) {
        //e.printStackTrace();
       }
    }
    else {
      lExp.setText("No data found, try visiting hospital");
    }
     
  }}
);


   //button to check for symptoms --------------- Medicines
   b2 = new JButton("Medicines");
   b2.setBounds(200,375,100,30);
   b2.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e)
   {
    String symmed = t1.getText();
    symmed = symmed.toLowerCase();
    String txtmed = "med.txt";
    String cmed = symmed.concat(txtmed);
    File filemed = new File(cmed);
    if (filemed.exists()) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filemed) )))
    {
        String line = null;
        while ((line = br.readLine()) != null) {
            lExp.setText(line);
      }
    } 
    catch (IOException exp) {
        //e.printStackTrace();
       }
    }
    else {
      lExp.setText("No medicines recommended found, try visiting the hospital");
    }
     
  }}
);
  //button ----------------------- to go back
  b3 = new JButton("Back");
  b3.setBounds(25,25,70,30);
  b3.setForeground(Color.WHITE);
  b3.setFont(new Font("Serif", Font.BOLD, 15));
  b3.setBackground(Color.black);
  b3.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
   {
    cHome f=new cHome();
    dispose();
  }}
);
 
  add(b3);
  add(l1);
  add(lExp);
  add(t1);
  add(b1);
  add(b2);
  add(panel);
  add(panel1);
  add(img);

  setLayout(null);
  setSize(1100,700);
   
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
