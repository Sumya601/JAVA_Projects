import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IncreaseSalary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					IncreaseSalary frame = new IncreaseSalary();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public IncreaseSalary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(33, 46, 48, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(191, 43, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIncreamentAmmount = new JLabel("Increament Ammount");
		lblIncreamentAmmount.setBounds(33, 97, 148, 14);
		contentPane.add(lblIncreamentAmmount);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 94, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(335, 227, 89, 23);
		contentPane.add(btnBack);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i=textField.getText();
				double b=Double.parseDouble(textField_1.getText());
				
				ControlAll.uc.increaseSalary(i,b);
			}
		});
		btnSubmit.setBounds(201, 135, 75, 23);
		contentPane.add(btnSubmit);
	}

}
