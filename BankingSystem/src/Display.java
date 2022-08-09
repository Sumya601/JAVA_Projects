import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;

public class Display extends JFrame {

	private JPanel contentPane;
	static String filename = "account.txt";
	static DefaultListModel myModel = new DefaultListModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
			
					Display frame = new Display();
					frame.setVisible(true);
					
	}
			

	/**
	 * Create the frame.
	 */
	public Display() {
		setTitle("Display");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(27, 36, 812, 457);
		contentPane.add(list);
		
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(BankAccount b1: Main.ba.accounts) {
					if(b1 ==null) 
						break;
					myModel.addElement(b1.toString());
				
			}
				list.setModel(myModel);
			}
		});
		btnNewButton.setBounds(349, 13, 109, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomePage frame = new HomePage();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(748, 496, 78, 25);
		contentPane.add(btnNewButton_1);
	}
}
