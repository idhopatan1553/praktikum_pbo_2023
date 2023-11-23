package Program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Kalkukator {

	private JFrame frame;
	private JTextField textField;

		// inisialisasi
		double firstnum, secondnum, result;
		String operation, answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkukator window = new Kalkukator();
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
	public Kalkukator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(127, 344, 89, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn0.getText();
				textField.setText(Number);
			}
		});
		btn0.setBounds(21, 343, 89, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnHasil = new JButton("=");
		btnHasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/") {
					result = firstnum /
							
							secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				}
		});
		btnHasil.setBounds(226, 344, 89, 50);
		frame.getContentPane().add(btnHasil);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn7.getText();
				textField.setText(Number);		
			}
		});
		btn7.setBounds(19, 127, 89, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn8.getText();
				textField.setText(Number);
			}
		});
		btn8.setBounds(124, 128, 89, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn9.getText();
				textField.setText(Number);
			}
		});
		btn9.setBounds(224, 128, 89, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn4.getText();
				textField.setText(Number);
			}
		});
		btn4.setBounds(19, 201, 89, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(24, 267, 89, 52);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn1.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(btn1);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn5.getText();
				textField.setText(Number);
			}
		});
		btn5.setBounds(126, 201, 89, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn6.getText();
				textField.setText(Number);
			}
		});
		btn6.setBounds(222, 201, 89, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn2.getText();
				textField.setText(Number);
			}
		});
		btn2.setBounds(123, 267, 89, 52);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn3.getText();
				textField.setText(Number);
			}
		});
		btn3.setBounds(223, 267, 89, 52);
		frame.getContentPane().add(btn3);
		
		textField = new JTextField();
		textField.setBounds(24, 24, 387, 89);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBagi = new JButton("/");
		btnBagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnBagi.setBounds(323, 128, 89, 50);
		frame.getContentPane().add(btnBagi);
		
		JButton btnKali = new JButton("*");
		btnKali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnKali.setBounds(325, 201, 89, 50);
		frame.getContentPane().add(btnKali);
		
		JButton btnKurang = new JButton("-");
		btnKurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnKurang.setBounds(322, 267, 89, 52);
		frame.getContentPane().add(btnKurang);
		
		JButton btnTambah = new JButton("+");
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnTambah.setBounds(325, 344, 89, 50);
		frame.getContentPane().add(btnTambah);
	}
}
