import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.sql.rowset.JoinRowSet;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtScreen;
	private double answer,number;
	int operation,result;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public void addInput(String str) {
	txtScreen.setText(txtScreen.getText() + str);
	
	}
public void calculate() {
	switch (operation){
	case 1:
		
		answer = number + Double.parseDouble(txtScreen.getText());
		result = (int) answer;
		txtScreen.setText(Integer.toString(result));
		break;
	case 2:
		answer = number - Double.parseDouble(txtScreen.getText());
		result = (int) answer;
		txtScreen.setText(Integer.toString(result));
		
		break;
	case 3:
		answer = number * Double.parseDouble(txtScreen.getText());
		result = (int) answer;
		txtScreen.setText(Integer.toString(result));
		break;
	case 4:
		answer = number / Double.parseDouble(txtScreen.getText());
		if(answer % 2 == 0) {
		result = (int) answer;
		txtScreen.setText(Integer.toString(result));
		}else {
			txtScreen.setText(Double.toString(answer));
		}
		break;
		
		default: 
		
		
	}
}
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlScreen = new JPanel();
		pnlScreen.setBounds(10, 10, 347, 107);
		contentPane.add(pnlScreen);
		pnlScreen.setLayout(null);
		
		txtScreen = new JTextField();
		txtScreen.setBackground(new Color(255, 255, 255));
		txtScreen.setEditable(false);
		txtScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtScreen.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtScreen.setBounds(0, 37, 347, 59);
		pnlScreen.add(txtScreen);
		txtScreen.setColumns(10);
		
		JLabel lblScreen = new JLabel("Welcome");
		lblScreen.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblScreen.setBounds(0, 0, 347, 39);
		pnlScreen.add(lblScreen);
		
		JPanel pnlControl = new JPanel();
		pnlControl.setBounds(10, 127, 347, 368);
		contentPane.add(pnlControl);
		pnlControl.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton_5_1 = new JButton("7");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_3 = new JButton("8");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_2 = new JButton("9");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_6 = new JButton("+");
		btnNewButton_5_6.setBackground(new Color(0, 0, 0));
		btnNewButton_5_6.setForeground(new Color(255, 255, 255));
		btnNewButton_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 1;
				number = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				lblScreen.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_5_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_6);
		
		JButton btnNewButton_5_5 = new JButton("4");
		btnNewButton_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_5);
		
		JButton btnNewButton_5_4 = new JButton("5");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5);
		
		JButton btnNewButton_5_7 = new JButton("-");
		btnNewButton_5_7.setBackground(new Color(0, 0, 0));
		btnNewButton_5_7.setForeground(new Color(255, 255, 255));
		btnNewButton_5_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 2;
				number = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				lblScreen.setText(number + e.getActionCommand());
						
			}
		});
		btnNewButton_5_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_7);
		
		JButton btnNewButton_5_9 = new JButton("1");
		btnNewButton_5_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_9);
		
		JButton btnNewButton_5_8 = new JButton("2");
		btnNewButton_5_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_8);
		
		JButton btnNewButton_5_10 = new JButton("3");
		btnNewButton_5_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_10);
		
		JButton btnNewButton_5_10_1 = new JButton("x");
		btnNewButton_5_10_1.setBackground(new Color(0, 0, 0));
		btnNewButton_5_10_1.setForeground(new Color(255, 255, 255));
		btnNewButton_5_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 3;
				number = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				lblScreen.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_5_10_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_10_1);
		
		JButton btnNewButton_5_11 = new JButton("C");
		btnNewButton_5_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtScreen.setText("");
			}
		});
		btnNewButton_5_11.setBackground(Color.RED);
		btnNewButton_5_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_11);
		
		JButton btnNewButton_5_10_2 = new JButton("0");
		btnNewButton_5_10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
		});
		btnNewButton_5_10_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_10_2);
		
		JButton btnNewButton_5_10_3 = new JButton("=");
		btnNewButton_5_10_3.setBackground(new Color(152, 251, 152));
		btnNewButton_5_10_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lblScreen.setText("");
			}
		});
		btnNewButton_5_10_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_10_3);
		
		JButton btnNewButton_5_10_4 = new JButton("÷");
		btnNewButton_5_10_4.setBackground(new Color(0, 0, 0));
		btnNewButton_5_10_4.setForeground(new Color(255, 255, 255));
		btnNewButton_5_10_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 4;
				number = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				lblScreen.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_5_10_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlControl.add(btnNewButton_5_10_4);
	}
}
