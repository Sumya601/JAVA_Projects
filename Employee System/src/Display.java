import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Display extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Display frame = new Display();
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
	public Display() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 73, 414, 151);
		contentPane.add(list);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main frame = new Main();
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(335, 235, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ControlAll.employee.clear();
				for(Employee e1:ControlAll.uc.employees) {
					if(e1==null)
						break;
					ControlAll.employee.addElement(e1.toString());
				}
				
			  list.setModel(ControlAll.employee);
			  
			}
		});
		btnDisplay.setBounds(0, 37, 89, 23);
		contentPane.add(btnDisplay);
		
		JLabel lblEmployeeInformation = new JLabel("Employee Information");
		lblEmployeeInformation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEmployeeInformation.setBounds(121, 0, 218, 23);
		contentPane.add(lblEmployeeInformation);
	}
}
