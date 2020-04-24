package home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window;
import java.awt.Font;
import javax.swing.JRadioButton;


public class ManagerMenu {

	private JFrame frmManagerView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					ManagerMenu window = new ManagerMenu();
					window.frmManagerView.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ManagerMenu() 
	{
		//Employees();
		initialize();
		
	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		frmManagerView = new JFrame();
		frmManagerView.setTitle("Manager View\r\n");
		frmManagerView.setBounds(100, 100, 450, 300);
		frmManagerView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManagerView.getContentPane().setLayout(null);
		

		
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.setBounds(250, 30, 113, 70);
		frmManagerView.getContentPane().add(btnInventory);
		
		JButton btnSales = new JButton("Sales Report");
		btnSales.setBounds(40, 160, 113, 70);
		frmManagerView.getContentPane().add(btnSales);
		
		JButton btnNewButton = new JButton("Employees");
		btnNewButton.setBounds(40, 30, 113, 70);
		frmManagerView.getContentPane().add(btnNewButton);
		
	}
	


}
