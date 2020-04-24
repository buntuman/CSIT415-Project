package home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employees{

	private JFrame frmEmployees;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employees window = new Employees();
					window.frmEmployees.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employees() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		frmEmployees = new JFrame();
		frmEmployees.getContentPane().setBackground(new Color(255, 51, 0));
		frmEmployees.getContentPane().setForeground(new Color(0, 0, 0));
		frmEmployees.setBounds(100, 100, 450, 300);
		frmEmployees.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployees.getContentPane().setLayout(null);
		
		JButton btnProfileButton = new JButton("Create Profile");
		btnProfileButton.setBounds(126, 11, 166, 74);
		btnProfileButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmEmployees.getContentPane().add(btnProfileButton);
		
		JButton btnActivitiesButton = new JButton("View Emp Activities");
		btnActivitiesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActivitiesButton.setBounds(105, 146, 212, 81);
		btnActivitiesButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnActivitiesButton.setBackground(new Color(153, 255, 102));
		btnActivitiesButton.setForeground(new Color(0, 0, 0));
		frmEmployees.getContentPane().add(btnActivitiesButton);
	}

	

}
