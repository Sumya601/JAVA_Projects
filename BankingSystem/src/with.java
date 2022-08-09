import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class with extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static String filename = "account.txt";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					with frame = new with();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public with() {
		setTitle("Withdraw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAccountNumber.setBounds(53, 48, 109, 16);
		contentPane.add(lblAccountNumber);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAmount.setBounds(74, 90, 56, 16);
		contentPane.add(lblAmount);
		
		textField = new JTextField();
		textField.setBounds(199, 45, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 87, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(260, 215, 75, 25);
		contentPane.add(btnNewButton);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String an = textField.getText();
				double amm = Double.parseDouble(textField_1.getText());
				Main.ba.withdraw(an, amm);
				JOptionPane.showMessageDialog(null, "Successfull");
			
			
			}
		});
		btnEnter.setBackground(Color.GREEN);
		btnEnter.setBounds(65, 215, 97, 25);
		contentPane.add(btnEnter);
	}

}
