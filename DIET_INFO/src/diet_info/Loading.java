package diet_info;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Loading extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading().setVisible(true);
	}

	public void setUploading() {
            setVisible(false);
            th.start();
	}

	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                        new Login_user().setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading() {
           
            super("Live Healthy");
            th = new Thread((Runnable) this);

            setBounds(430, 200, 600, 400);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lbllibraryManagement = new JLabel("Diet Info");
            lbllibraryManagement.setForeground(new Color (72, 209, 204));
            lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            lbllibraryManagement.setBounds(220, 80, 500, 35);
            contentPane.add(lbllibraryManagement);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBounds(130, 135, 300, 25);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
            lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            lblNewLabel_2.setForeground(new Color(160, 82, 45));
            lblNewLabel_2.setBounds(200, 165, 150, 20);
            contentPane.add(lblNewLabel_2);

            JPanel panel = new JPanel();
            panel.setBackground(Color.BLACK);
            panel.setBounds(0, 0, 590, 390);
            contentPane.add(panel);
                
            setUploading();
	}
}