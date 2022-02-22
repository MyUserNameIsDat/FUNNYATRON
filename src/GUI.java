import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
 

public class GUI extends JFrame implements ActionListener{  
    JLabel l;  
    JTextField tf;  
    JButton b;  
    JButton b2;
GUI(){  
    super("Is Me Funny?");  
    l=new JLabel("Do you agree to the TOS? Y/N:");  
    l.setBounds(50,70,300,20);;
    tf=new JTextField();  
    tf.setBounds(50,100,200,20);  
    this.getContentPane().setBackground(Color.BLACK);
    b=new JButton("Enter");  
    b.setBounds(50,150,80,30);  
    b.addActionListener(this); 
    l.setForeground(Color.RED);
    
    add(l);  // JLabel
    add(tf);  // TextField 
    add(b);  // JButton
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);  
    b2=new JButton("Test It");
    b2.setBounds(50,150,80,30);
    b2.addActionListener(this);
    add(b2); // JButton 2
    setSize(300,300);
    setLayout(null);
    setVisible(true);
    
}  
public void actionPerformed(ActionEvent e){  

    if (e.getSource()==b) {

    String termAgreeal=tf.getText();  
    termAgreeal.toLowerCase();
    int yesNo = termAgreeal.indexOf("Y");
    
    if (yesNo != -1) {
        System.out.println("\nTerms Accepted.\n");
        l.setText("Insert your Funny");
        tf.setText(null);
        b.setVisible(false);
        b2.setVisible(true);
    } else {

          l.setText("leave n00b");
          b.setVisible(false);
          tf.setVisible(false);
          b2.setVisible(false);
    }
} else if (e.getSource()==b2) {

    String getJoke=tf.getText();
    String output;
    if (!isFunny.whitelist(getJoke).equals("failed")) {
        output=isFunny.whitelist(getJoke);
        l.setText(output);
        tf.setText(null);
     } else { 
         if (isFunny.Funny()) {
             App.funny=true;
             int gudNumber = (int)(Math.random() * 41+80); // 30-100
              output="YEs!!!! Very Funny!!!! joke is "+gudNumber+"/100";
              l.setText(output);
              tf.setText(null);
         } else {
                 App.funny=false;
                 int badNumber = (int)(Math.random() * 31*-1); // 0-30
                 output = "Bad!!!! Not Funny!!!! >:( your joke is "+badNumber+"/100";
                 l.setText(output);
                 tf.setText(null);
            }
         }
        }  
    } 
}

