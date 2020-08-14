
package diet_info;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Aboutus extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1;

        public static void main(String[] args) {
            new Aboutus().setVisible(true);		
	}
    
        public Aboutus() {
            
            super("About Us - Diet Info");
            setIconImage(Toolkit.getDefaultToolkit().getImage("diet_info/icons/4.jpg"));
            setBackground( Color.BLUE);
            setBounds(400, 150, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("diet_info/icons/image.png"));
            Image i2 = i1.getImage().getScaledInstance(170, 140,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(220, 50, 300, 150);
            contentPane.add(l1);

            JLabel l4 = new JLabel("");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(130, 70, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 120, 100, 21);
            contentPane.add(l5);

            JLabel l6 = new JLabel("Developed By : Team Exceptional");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Contact Us : te123@gmail.com");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Subscribe us on Youtube : Exceptional team");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Follow us on Instagram : **TE**");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);

            JLabel l10 = new JLabel("**One must eat to live, not live to eat.**");
            l10.setForeground(Color.ORANGE);
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
            contentPane.setBackground(Color.BLACK);
            
            b1 = new JButton("Back");
            b1.addActionListener(this);
            b1.setBackground(Color.ORANGE);
            b1.setForeground(Color.RED);
            b1.setBounds(500, 345, 110, 40);
            contentPane.add(b1);
            
	}

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if(ae.getSource() == b1){
             this.setVisible(false);
             new home().setVisible(true);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
