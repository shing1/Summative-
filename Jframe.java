package code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


 /*class ButtonListener extends Jframe implements ActionListener {

    public void actionPerformed (ActionEvent e, double mass1){

      if (e.getSource()== Convert){
          
        if (e.getSource().equals("mg to g")){
            
            double mass1 = Double.parseDouble(t1.getText());
            double mg2g = mass1/m;
            String value=String.format("%.3f", mg2g);
            t2.setText(value);   }
       
       else if (e.getSource().equals("mg to kg")){
            double mg2kg = mass1*n;
            String value=String.format("%.3f", mg2g);
            t2.setText(value);    


        }

      }  
        
    } 
 }
*/





class tabbedpanels extends Jframe {
    public void gui(){
   
     f.setSize(500,300);

 
     f.setVisible(true); 
     
    f.getContentPane().add(tabs);
    
    //for the MASS tab 
    P_mass.setBackground(Color.YELLOW); 
    JButton Convert= new JButton ("CONVERT");
    P_mass.add(Convert);
    Convert.setSize(10,20);
    JTextField m_value= new JTextField ();
    TextField m_t1,m_t2;  
    m_t1=new TextField("Enter a value");  
    m_t1.setBounds(50,100, 90,30);  
    m_t2=new TextField("result");  
    m_t2.setBounds(50,150, 90,30);  
    P_mass.add(m_t1); 
    P_mass.add(m_t2); 
    String [] list = {"mg to g", "mg to kg", "g to mg", "g to kg","kg to mg","kg to g"  };
    JComboBox m_choice = new JComboBox(list); 
    P_mass.add(m_choice);
    m_choice.setBounds(300, 100,90, 20);
    
    //for the TIME tab 
    JTextField t_value= new JTextField ();
    P_Time.setBackground(Color.GREEN); 
    JButton t_Convert= new JButton ("CONVERT");
    P_Time.add(t_Convert);
    t_Convert.setSize(10,20);
    
    
    TextField t_t1,t_t2;  
    t_t1=new TextField("Enter a value");  
    t_t1.setBounds(50,100, 90,30);  
    t_t2=new TextField("result");  
    t_t2.setBounds(50,150, 90,30);  
    P_Time.add(t_t1); 
    P_Time.add(t_t2); 
    String [] time_list = {"seconds to minutes", "seconds to hours", "minutes to seconds", "minutes to hours","hours to seconds","hours to minutes"  };
    JComboBox t_choice = new JComboBox(time_list); 
    P_Time.add(t_choice);
    t_choice.setBounds(300, 100,90, 20);
    
 
    // FOR THE DISTANCE TAB 
    
    
    // FOR THE TEMPERATURE TAB 
    
    
    
     tabs.addTab("MASS", P_mass);
     tabs.addTab("TIME", P_Time);
     tabs.addTab("DISTANCE",  P_Distance);
     tabs.addTab("TEMPERATURE",  P_Temperature);
     tabs.addTab("SI UNIT TABLE", P_Table ); 

    }
 
    
}


public class Jframe {

     double m = 1000;
     double n =1000000;
     JTabbedPane tabs= new JTabbedPane ();
     JLabel L = new JLabel("MASS");
     JPanel P_mass =  new JPanel();
   
     JPanel P_Time =  new JPanel();
     JPanel P_Distance =  new JPanel();
     JPanel P_Temperature =  new JPanel();
     JPanel P_Table =  new JPanel();
     JFrame f = new JFrame("Umeasure");
  
   
 

    public static void main(String[] args) {
        
      tabbedpanels frame = new  tabbedpanels ();
      frame.gui();
      
        
        
        
    }
 
    }