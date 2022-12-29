package moneyatreATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FundsTransfer {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FundsTransfer window = new FundsTransfer();
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
	public FundsTransfer(String depositorAccountNumber) {
		initialize(depositorAccountNumber);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String depositorAccountNumber) {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 160);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel outerPanel = new JPanel();
		outerPanel.setBounds(0, 0, 300, 160);
		outerPanel.setBackground(new Color(75,0,130));
		outerPanel.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		frame.getContentPane().add(outerPanel);
		outerPanel.setLayout(null);
		
		JLabel depositLabel = new JLabel("Enter Account Number of Payee\r\n");
		depositLabel.setForeground(Color.WHITE);
		depositLabel.setHorizontalAlignment(SwingConstants.CENTER);
		depositLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		depositLabel.setBounds(10, 5, 280, 29);
		outerPanel.add(depositLabel);
		
		JTextArea payeeAccount = new JTextArea();
		payeeAccount.setForeground(Color.DARK_GRAY);
		payeeAccount.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		payeeAccount.setBounds(20, 45, 249, 22);
		outerPanel.add(payeeAccount);
		
		
		JLabel lblEnterAmountTo = new JLabel("Enter Amount to transfer");
		lblEnterAmountTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterAmountTo.setForeground(Color.WHITE);
		lblEnterAmountTo.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblEnterAmountTo.setBounds(10, 76, 218, 29);
		outerPanel.add(lblEnterAmountTo);
		
		JTextArea AmountInput_1 = new JTextArea();
		AmountInput_1.setForeground(Color.DARK_GRAY);
		AmountInput_1.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		AmountInput_1.setBounds(20, 104, 249, 22);
		outerPanel.add(AmountInput_1);
		
		JButton DepositButton = new JButton("Deposit");
		DepositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Moneyatre.transfer(depositorAccountNumber, payeeAccount.getText(), Double.parseDouble(AmountInput_1.getText()));
				frame.setVisible(false);
				new TransactionsScreenUI(Moneyatre.getAccountTitle(depositorAccountNumber),Moneyatre.getAccountBalance(depositorAccountNumber),depositorAccountNumber);
			}
		});
		DepositButton.setForeground(new Color(75,0,130));
		DepositButton.setBackground(Color.WHITE);
		DepositButton.setBounds(213, 137, 77, 16);
		DepositButton.setFocusPainted(false);
		outerPanel.add(DepositButton);

	}
}
