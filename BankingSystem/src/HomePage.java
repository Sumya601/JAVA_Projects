import java.awt.BorderLayout;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class HomePage extends JFrame {

//	static Bank ba=new Bank();
	private JPanel contentPane;
	//static String filename = "account.txt";
	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setTitle("Banking System by Sumya Akter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 587);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.setBounds(172, 148, 917, 31);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CreateAccount frame = new CreateAccount();
				frame.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(1159, 501, 89, 25);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ObjectOutputStream oos = null;
				try {
				oos = new ObjectOutputStream(new FileOutputStream(Main.filename));
				oos.writeObject(Main.ba);
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				finally {
					try {
						oos.close();
					}
				
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
				
				System.exit(0);
			
			}
		});
		btnNewButton_2.setFont(new Font("Sylfaen", Font.BOLD, 14));
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("ABC BANK");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(456, 36, 325, 71);
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Deposite");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dep frame = new dep();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(172, 238, 917, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Withdraw");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				with frame = new with();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(170, 317, 919, 31);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Display");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Display frame = new Display();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_4.setBounds(170, 393, 919, 33);
		contentPane.add(btnNewButton_4);
	}
}
