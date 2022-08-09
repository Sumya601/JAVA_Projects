import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEmployee frame = new AddEmployee();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(154, 47, 138, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Get Information");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetInformation frame = new GetInformation();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(154, 81, 138, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Increase Salary");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IncreaseSalary frame = new IncreaseSalary();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(154, 115, 138, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(154, 181, 138, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblChooseYourOption = new JLabel("Choose Your Option");
		lblChooseYourOption.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChooseYourOption.setBounds(10, 0, 157, 36);
		contentPane.add(lblChooseYourOption);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(335, 214, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Display List");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display frame = new Display();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBounds(154, 149, 138, 23);
		contentPane.add(btnNewButton_5);
	}

}
