package home;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.Checkbox;
import java.awt.List;
import java.awt.Choice;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

public class CreateProfile {

	private JFrame frmCreateProfile;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtRold;
	private JTextField txtSsn;
	private JTextField txtWage;
	private JTextField txtSex;
	private JTextField txtAdress;
	private JTextField txtPhoneNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateProfile window = new CreateProfile();
					window.frmCreateProfile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreateProfile = new JFrame();
		frmCreateProfile.setBounds(100, 100, 450, 406);
		frmCreateProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCreateProfile.getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setText("Name");
		txtName.setToolTipText("");
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setBounds(23, 33, 86, 20);
		frmCreateProfile.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setEditable(false);
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setText("Date of Birth");
		txtAge.setBounds(23, 64, 86, 20);
		frmCreateProfile.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		txtRold = new JTextField();
		txtRold.setEditable(false);
		txtRold.setHorizontalAlignment(SwingConstants.CENTER);
		txtRold.setText("Position");
		txtRold.setBounds(23, 95, 86, 20);
		frmCreateProfile.getContentPane().add(txtRold);
		txtRold.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setToolTipText("First");
		textPane.setBounds(119, 33, 103, 20);
		frmCreateProfile.getContentPane().add(textPane);
		
		txtSsn = new JTextField();
		txtSsn.setEditable(false);
		txtSsn.setText("SSN\r\n");
		txtSsn.setHorizontalAlignment(SwingConstants.CENTER);
		txtSsn.setBounds(23, 126, 86, 20);
		frmCreateProfile.getContentPane().add(txtSsn);
		txtSsn.setColumns(10);
		
		txtWage = new JTextField();
		txtWage.setEditable(false);
		txtWage.setText("Wage");
		txtWage.setHorizontalAlignment(SwingConstants.CENTER);
		txtWage.setBounds(23, 157, 86, 20);
		frmCreateProfile.getContentPane().add(txtWage);
		txtWage.setColumns(10);
		
		txtSex = new JTextField();
		txtSex.setEditable(false);
		txtSex.setHorizontalAlignment(SwingConstants.CENTER);
		txtSex.setText("Sex");
		txtSex.setBounds(23, 188, 86, 20);
		frmCreateProfile.getContentPane().add(txtSex);
		txtSex.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setEditable(false);
		txtAdress.setText("Adress");
		txtAdress.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdress.setBounds(23, 219, 86, 20);
		frmCreateProfile.getContentPane().add(txtAdress);
		txtAdress.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setEditable(false);
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhoneNumber.setBounds(23, 283, 86, 20);
		frmCreateProfile.getContentPane().add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(232, 33, 103, 20);
		frmCreateProfile.getContentPane().add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(119, 64, 216, 20);
		frmCreateProfile.getContentPane().add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(119, 95, 216, 20);
		frmCreateProfile.getContentPane().add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(119, 126, 49, 20);
		frmCreateProfile.getContentPane().add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(139, 157, 43, 20);
		frmCreateProfile.getContentPane().add(textPane_5);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setBounds(119, 219, 216, 20);
		frmCreateProfile.getContentPane().add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setBounds(200, 126, 49, 20);
		frmCreateProfile.getContentPane().add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setBounds(286, 126, 49, 20);
		frmCreateProfile.getContentPane().add(textPane_9);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setBounds(119, 250, 88, 20);
		frmCreateProfile.getContentPane().add(textPane_10);
		
		JEditorPane dtrpnFirst = new JEditorPane();
		dtrpnFirst.setText("First:");
		dtrpnFirst.setEditable(false);
		dtrpnFirst.setBounds(151, 11, 31, 20);
		frmCreateProfile.getContentPane().add(dtrpnFirst);
		
		JEditorPane dtrpnLast = new JEditorPane();
		dtrpnLast.setText("Last:");
		dtrpnLast.setEditable(false);
		dtrpnLast.setBounds(264, 11, 31, 20);
		frmCreateProfile.getContentPane().add(dtrpnLast);
		
		Checkbox checkbox = new Checkbox("Male");
		checkbox.setBounds(119, 188, 95, 22);
		frmCreateProfile.getContentPane().add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Female\r\n");
		checkbox_1.setBounds(240, 188, 95, 22);
		frmCreateProfile.getContentPane().add(checkbox_1);
		
		TextField textField = new TextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField.setText("$");
		textField.setEditable(false);
		textField.setBounds(119, 157, 24, 22);
		frmCreateProfile.getContentPane().add(textField);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setBounds(286, 250, 49, 20);
		frmCreateProfile.getContentPane().add(textPane_6);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setBounds(119, 283, 216, 20);
		frmCreateProfile.getContentPane().add(textPane_11);
		
		JButton btnNewButton = new JButton("Submit\r\n");
		btnNewButton.setBounds(160, 333, 89, 23);
		frmCreateProfile.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("/hr");
		lblNewLabel.setBounds(183, 163, 24, 14);
		frmCreateProfile.getContentPane().add(lblNewLabel);
	}
}
