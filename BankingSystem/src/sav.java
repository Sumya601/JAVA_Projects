import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sav extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sav frame = new sav();
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
	public sav() {
		setTitle("Savings Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 49, 56, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(138, 46, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 100, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Amount");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(49, 103, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
			String name = textField.getText();
			double balance=Double.parseDouble(textField_1.getText());
			double maxWithLimit = Double.parseDouble(textField_2.getText());
			if(balance>=2000) {

			String b=Main.ba.addAccount(name,balance,maxWithLimit);
			JOptionPane.showMessageDialog(null, "Account Created");
			JOptionPane.showMessageDialog(null, b);}
			else {
				JOptionPane.showMessageDialog(null, "plz give balance >=2000");
			}
			}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "entered in correct form");
					}
				}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(300, 99, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateAccount frame = new CreateAccount();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.setBounds(300, 148, 97, 25);
		contentPane.add(btnNewButton_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 149, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMaxWl = new JLabel("Max WL");
		lblMaxWl.setBounds(49, 152, 56, 16);
		contentPane.add(lblMaxWl);
		
		JButton btnNewButton_1 = new JButton("Back to Home");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(150, 215, 183, 25);
		contentPane.add(btnNewButton_1);
	}
}
