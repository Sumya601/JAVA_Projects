import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEmployee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddEmployee frame = new AddEmployee();
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
	public AddEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChooseYourOption = new JLabel("Choose Your Option");
		lblChooseYourOption.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChooseYourOption.setBounds(10, 11, 159, 27);
		contentPane.add(lblChooseYourOption);
		
		JButton btnNewButton = new JButton("Salaried Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salaried frame = new Salaried();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(151, 62, 176, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Hourly Employee");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hourly frame = new Hourly();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(151, 109, 176, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Commission Employee");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Commission frame = new Commission();
				frame.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton_2.setBounds(151, 153, 176, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
