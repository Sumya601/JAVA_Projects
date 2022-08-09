import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HomePage extends JFrame {
	static Employee[] employees=new Employee[10];
	static UapCSE emp=new UapCSE();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(145, 98, 147, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblEnterToEmployee = new JLabel(" Employee Management System");
		lblEnterToEmployee.setBackground(new Color(255, 153, 153));
		lblEnterToEmployee.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblEnterToEmployee.setBounds(51, 11, 417, 31);
		contentPane.add(lblEnterToEmployee);
		
		JLabel lblPressTheEnter = new JLabel("Press the Enter button");
		lblPressTheEnter.setBounds(81, 74, 198, 14);
		contentPane.add(lblPressTheEnter);
	}
}
