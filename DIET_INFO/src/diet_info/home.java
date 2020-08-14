package diet_info;


import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import static java.awt.image.ImageObserver.ABORT;

public class home extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6;

	public static void main(String[] args) {
            new home ().setVisible(true);
	}
        
        public home() {
	
            setBounds(250, 100, 900, 590);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            
            JMenuBar menuBar = new JMenuBar();
            menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
            menuBar.setBackground(Color.PINK);
            menuBar.setBounds(0, 10, 1000, 35);
            contentPane.add(menuBar);

            JMenu mnRecord = new JMenu("More");
            //mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            

            JMenuItem bookdetails = new JMenuItem("About Us");
            bookdetails.addActionListener(this);
            bookdetails.setBackground(new Color(211, 211, 211));
            bookdetails.setForeground(Color.BLACK);
            mnRecord.add(bookdetails);

            JMenuItem studentdetails = new JMenuItem("Logout");
            studentdetails.setBackground(new Color(211, 211, 211));
            studentdetails.setForeground(Color.BLACK);
            studentdetails.addActionListener(this);
            mnRecord.add(studentdetails);
            
            menuBar.add(mnRecord);

            JLabel l1 = new JLabel("Diet Info");
            l1.setForeground(new Color(204, 51, 102));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(400, 30, 701, 80);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("diet_info/icons/3.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(140, 140, 159, 152);
            contentPane.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("diet_info/icons/22.jpg"));
            Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(395, 160, 134, 128);
            contentPane.add(l3);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("diet_info/icons/4.jpg"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(610, 140, 225, 152);
            contentPane.add(l4);

            b1 = new JButton("Count Your Bmi");
            b1.addActionListener(this);
            b1.setBackground(Color.ORANGE);
            b1.setForeground(Color.BLACK);
            b1.setBounds(140, 320, 159, 44);
            contentPane.add(b1);

            b2 = new JButton("Diet Chart");
            b2.addActionListener(this);
            b2.setBackground(Color.ORANGE);
            b2.setForeground(Color.BLACK);
            b2.setBounds(393, 320, 139, 44);
            contentPane.add(b2);

            b3 = new JButton("Progress");
            b3.addActionListener(this);
            b3.setBackground(Color.ORANGE);
            b3.setForeground(Color.BLACK);
            b3.setBounds(642, 320, 167, 44);
            contentPane.add(b3);

            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Live Healthy", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(220, 20, 60)));
            panel.setBounds(100, 120, 750, 260);
            panel.setBackground(Color.WHITE);
            contentPane.add(panel);

            b4 = new JButton("Exit");
            b4.addActionListener(this);
            b4.setBackground(Color.BLACK);
            b4.setForeground(Color.WHITE);
            b4.setBounds(386, 490, 143, 41);
            contentPane.add(b4);            
	}
        
        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if(ae.getSource() == b1){
                this.setVisible(false);
                new Main().setVisible(true);
                
            }
            
            if(msg.equals("About Us")){
                setVisible(false);
		new Aboutus().setVisible(true);
            }
              if(msg.equals("Logout")){
                setVisible(false);
		new Login_user().setVisible(true);
            }
               if(ae.getSource() == b2){
                this.setVisible(false);
                new dietchart().setVisible(true);
                
            }
            
                        
        }
}
