import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.io.*
;public class CurrentAc extends JFrame {


private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static String filename = "account.txt";
	private JTextField textField_2;
	

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public CurrentAc() {
		setTitle("Current Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBounds(287, 129, 97, 25);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAccount frame = new CreateAccount();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBackground(Color.YELLOW);
		contentPane.add(btnNewButton_2);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(41, 40, 56, 16);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(74, 115, 56, -35);
		contentPane.add(lblNewLabel);
		
		JLabel lblAmmount = new JLabel("Amount");
		lblAmmount.setBounds(39, 86, 56, 16);
		contentPane.add(lblAmmount);
		
		textField = new JTextField();
		textField.setBounds(107, 37, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 83, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(287, 82, 97, 25);
		btnEnter.setBackground(Color.PINK);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				String name = textField.getText();
				double balance=Double.parseDouble(textField_1.getText());
				String tdlicense = textField_2.getText();
				if(balance>=2000) {
				String b=Main.ba.addAccount(name,balance,2000);
				JOptionPane.showMessageDialog(null, "Account Created");
				JOptionPane.showMessageDialog(null, b);}
				else {
					JOptionPane.showMessageDialog(null, "enter balance more than 2000");
				}
				}
				catch(Exception r){
					JOptionPane.showMessageDialog(null, "enter in correct form");
				}
			}

	

			
		});
		contentPane.add(btnEnter);
		
		JLabel lblTradeL = new JLabel("Trade L");
		lblTradeL.setBounds(41, 133, 56, 16);
		contentPane.add(lblTradeL);
		
		textField_2 = new JTextField();
		textField_2.setBounds(107, 130, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnBackToHome = new JButton("Back To Home");
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBackToHome.setBounds(151, 199, 124, 41);
		contentPane.add(btnBackToHome);
	}
}
