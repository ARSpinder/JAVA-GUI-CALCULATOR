import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textFieldN;
	
	double num1;
	double num2;
	String opetation;
	String answer;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//---------------------------Frame-----------------------//
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Segoe WP", Font.BOLD, 11));
		frame.setBounds(100, 100, 256, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 234, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//----------------------BUTTON---------------------//
		
		JButton bt7 = new JButton("7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + bt7.getText();
				
				textField.setText(EnterNumber);
			}
		});
		bt7.setBounds(10, 54, 50, 50);
		bt7.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt7);
		
		JButton bt8 = new JButton("8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + bt8.getText();
				
				textField.setText(EnterNumber);
						
			}
		});
		bt8.setBounds(63, 54, 50, 50);
		bt8.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt8);
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
         String EnterNumber = textField.getText() + bt9.getText();
				
				textField.setText(EnterNumber);
			}
		});
		bt9.setBounds(116, 54, 50, 50);
		bt9.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt9);
		
		JButton btmul = new JButton("*");
		btmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				
				textField.setText("");
				
				opetation = "*";
			}
		});
		btmul.setBounds(171, 54, 50, 50);
		btmul.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btmul);
		
		JButton bt4 = new JButton("4");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                   String EnterNumber = textField.getText() + bt4.getText();
				
				textField.setText(EnterNumber);
			}
		});
		bt4.setBounds(10, 118, 50, 50);
		bt4.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
           String EnterNumber = textField.getText() + bt5.getText();
				
				textField.setText(EnterNumber);
			}
		});
		bt5.setBounds(63, 118, 50, 50);
		bt5.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.setBounds(116, 118, 50, 50);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
         String EnterNumber = textField.getText() + bt6.getText();
				
				textField.setText(EnterNumber);
			}
		});
		bt6.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt6);
		
		JButton btminis = new JButton("-");
		btminis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
num1 = Double.parseDouble(textField.getText());
				
				textField.setText("");
				
				opetation = "-";
			
			}
		});
		btminis.setBounds(171, 118, 50, 50);
		btminis.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btminis);
		
		JButton bt1 = new JButton("1");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
String EnterNumber = textField.getText() + bt1.getText();
				
				textField.setText(EnterNumber);
			}
		});
		bt1.setBounds(10, 179, 50, 50);
		bt1.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
String EnterNumber = textField.getText() + bt2.getText();
				
				textField.setText(EnterNumber);
			}
		});
		bt2.setBounds(63, 179, 50, 50);
		bt2.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
String EnterNumber = textField.getText() + bt3.getText();
				
				textField.setText(EnterNumber);
			}
		});
		bt3.setBounds(116, 179, 50, 50);
		bt3.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt3);
		
		JButton btplus = new JButton("+");
		btplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				num1 = Double.parseDouble(textField.getText());
								
								textField.setText("");
								
								opetation = "+";
			}
		});
		btplus.setBounds(171, 179, 50, 50);
		btplus.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btplus);
		
		JButton btdot = new JButton(".");
		btdot.setBounds(63, 240, 50, 50);
		btdot.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btdot);
		
		JButton btequal = new JButton("=");
		btequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				
				num2 = Double.parseDouble(textField.getText());
				
				 if(opetation == "+")
				 {
					 result = num1 + num2;
					 answer=String.format("%.2f", result);
					 textField.setText(answer);
					 
				 }
				 
						 
				 else if(opetation == "-")
				 {
					   result = num1-num2;
					 answer = String.format("%.2f", result);
					 textField.setText(answer);
							 
				 }
				 
				 else if(opetation == "*")
				 {
					 result = num1*num2;
					 answer = String.format("%.2f", result);
					 textField.setText(answer);
							 
				 }
				
				 else if(opetation == "/")
				 {
					 result = num1/num2;
					 answer = String.format("%.2f", result);
					 textField.setText(answer);
							 
				 }
				
			}
			
		});
		btequal.setBounds(171, 240, 50, 50);
		btequal.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btequal);
		
		textFieldN = new JTextField();
		textFieldN.setBounds(10, 297, 96, 24);
		textFieldN.setBackground(Color.GREEN);
		textFieldN.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldN.setText(" NIGHT CODER");
		frame.getContentPane().add(textFieldN);
		textFieldN.setColumns(10);
		
		JButton bt0 = new JButton("0");
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
String EnterNumber = textField.getText() + bt0.getText();
				
				textField.setText(EnterNumber);
			}
		});
		bt0.setBounds(10, 240, 50, 50);
		bt0.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(bt0);
		
		JButton btdivide = new JButton("/");
		btdivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
								
								textField.setText("");
								
								opetation = "/";
				
			}
		});
		btdivide.setFont(new Font("Tahoma", Font.BOLD, 13));
		btdivide.setBounds(116, 240, 50, 50);
		frame.getContentPane().add(btdivide);
	}
}
