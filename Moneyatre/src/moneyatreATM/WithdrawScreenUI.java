package moneyatreATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class WithdrawScreenUI {

	private JFrame frame;
	private JTextField AmountInput;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					WithdrawScreenUI window = new WithdrawScreenUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public WithdrawScreenUI(String AccountNumber) {
		initialize(AccountNumber);
		frame.setVisible(true);
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String AccountNumber) {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 160);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel WithdrawTitle = new JPanel();
		WithdrawTitle.setBackground(Color.WHITE);
		WithdrawTitle.setForeground(new Color(75,0,130));
		WithdrawTitle.setBounds(0, 0, 300, 80);
		WithdrawTitle.setBorder(new LineBorder(new Color(75, 0, 130), 2, true));
		frame.getContentPane().add(WithdrawTitle);
		WithdrawTitle.setLayout(null);
		
		JLabel WithdrawMessage = new JLabel("Enter the amount to withdraw ");
		WithdrawMessage.setForeground(new Color(75,0,130));
		WithdrawMessage.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		WithdrawMessage.setHorizontalAlignment(SwingConstants.CENTER);
		WithdrawMessage.setBounds(10, 11, 280, 28);
		WithdrawTitle.add(WithdrawMessage);
		
		JLabel lblInMultipleOf = new JLabel("in multiple of 500");
		lblInMultipleOf.setForeground(new Color(75,0,130));
		lblInMultipleOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblInMultipleOf.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblInMultipleOf.setBounds(10, 40, 280, 28);
		WithdrawTitle.add(lblInMultipleOf);
		
		JPanel AmountPanel = new JPanel();
		AmountPanel.setBounds(0, 80, 300, 80);
		AmountPanel.setBackground(new Color(75,0,130));
		frame.getContentPane().add(AmountPanel);
		AmountPanel.setLayout(null);
		
		AmountInput = new JTextField();
		AmountInput.setForeground(Color.DARK_GRAY);
		AmountInput.setHorizontalAlignment(SwingConstants.CENTER);
		AmountInput.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		AmountInput.setBorder(null);
		AmountInput.setBounds(179, 14, 86, 20);
		AmountPanel.add(AmountInput);
		AmountInput.setColumns(10);
		
		JLabel AmountLabel = new JLabel("Amount:");
		AmountLabel.setForeground(Color.WHITE);
		AmountLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		AmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AmountLabel.setBounds(20, 14, 95, 14);
		AmountPanel.add(AmountLabel);
		
		JButton ConfirmButton = new JButton("Confirm");
		ConfirmButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		ConfirmButton.setBackground(Color.WHITE);
		ConfirmButton.setForeground(new Color(75,0,130));
		ConfirmButton.setBounds(102, 46, 89, 23);
		ConfirmButton.setFocusPainted(false);
		ConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Moneyatre.withdraw(AccountNumber, Double.parseDouble(AmountInput.getText()));
				frame.setVisible(false);
				new TransactionsScreenUI(Moneyatre.getAccountTitle(AccountNumber),Moneyatre.getAccountBalance(AccountNumber),AccountNumber);
				
			}});
		AmountPanel.add(ConfirmButton);
	}
}
