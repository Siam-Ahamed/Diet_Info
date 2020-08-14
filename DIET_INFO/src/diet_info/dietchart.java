package diet_info;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class dietchart extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton b1;

    public static void main(String[] args) {
        new dietchart().setVisible(true);
    }

    public dietchart() {

        super("Diet Information");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
        setBackground(new Color(173, 216, 230));
        setBounds(100, 110, 1200, 550);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l4 = new JLabel("Diet Chart");
        l4.setForeground(new Color(61, 61, 92));
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l4.setBounds(530, 30, 350, 40);
        contentPane.add(l4);

        JLabel l5 = new JLabel("BMI                                      Breakfast                                  Lunch                                           Dinner");
        l5.setForeground(new Color(0, 153, 153));
        l5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l5.setBounds(70, 90, 1100, 35);
        contentPane.add(l5);

        JLabel l6 = new JLabel(" < 18.5      --------------->        Breed with butter and ege                   2 cup rice , fish or meet                          1 cup rice/1 bread and less");
        l6.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l6.setBounds(70, 115, 1100, 35);
        contentPane.add(l6);

        JLabel l7 = new JLabel("                                                    fruit , milk                               with Salad,Selcom or oily fish                    fried vegetables or fish or meet");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l7.setBounds(70, 130, 1100, 34);
        contentPane.add(l7);

        JLabel l8 = new JLabel("18.5-24.99 -------------->      1 cup rice/bread with salad egg                2 cup rice and fish                                 1 cup rice /1bread and less ");
        //l8.setForeground(new Color(0, 153, 153));
        l8.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l8.setBounds(70, 165, 1100, 34);
        contentPane.add(l8);

        JLabel l9 = new JLabel("                                                                                                       or meet with salad                                   fried vegetable,1 cup milk");
        l9.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l9.setBounds(70, 185, 1100, 34);
        contentPane.add(l9);

        JLabel l10 = new JLabel("25-34.99 ---------------->         2 Burned bread , 2 boiled                    3/4 baked fish or chicken,                         1 cup rice , 1 bread and less ");
        l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.BOLD, 15));
        l10.setBounds(70, 210, 1100, 50);
        contentPane.add(l10);

        JLabel l11 = new JLabel("                                                egg, 1 apple / fruits                     1 cup rice with vegetable salad                 less fried vegetable , or fish or meat ");
        l11.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l11.setBounds(70, 230, 1100, 34);
        contentPane.add(l11);

        JLabel l12 = new JLabel("35-39.99 ---------------->        2 Burned bread , 2 boiled                  3/4 baked fish or chicken,vegetable            1 cup rice , 1 bread and less ");
        l12.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l12.setBounds(70, 250, 1100, 50);
        contentPane.add(l12);

        JLabel l13 = new JLabel("                                       egg without yolk,1 apple / fruits              salad with little quantity of rice                       fried vegetable  ");
        l13.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l13.setBounds(70, 260, 1100, 70);
        contentPane.add(l13);

        JLabel l14 = new JLabel("  40+         ---------------->       2 Burned bread , 2 boiled                      3/4 baked fish or chicken,                        1 cup rice , 1 bread and less ");
        l14.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l14.setBounds(70, 295, 1100, 70);
        contentPane.add(l14);

        JLabel l15 = new JLabel("                                                   egg without yolk                                       vegetable salad                                         fried vegetable  ");
        l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l15.setBounds(70, 318, 1100, 70);
        contentPane.add(l15);

        JLabel l16 = new JLabel("                      **********  Eat Healthy Live Healthy  **********");
        l16.setForeground(new Color(255, 153, 51));
        l16.setForeground(new Color(255, 153, 51));
        l16.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        l16.setBounds(140, 390, 900, 70);
        contentPane.add(l16);

        contentPane.setBackground(Color.WHITE);

        b1 = new JButton("Back");
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(1000, 465, 110, 40);
        contentPane.add(b1);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new home().setVisible(true);
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
