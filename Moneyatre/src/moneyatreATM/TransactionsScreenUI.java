package moneyatreATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.SwingConstants;
import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class TransactionsScreenUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TransactionsScreenUI window = new TransactionsScreenUI(""," ");
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
	public TransactionsScreenUI(String AccountNumber, String Balance,String AccountTitle) {
		initialize(AccountTitle,Balance,AccountNumber);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String AccountTitle, String Balance,String AccountNumber) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 390);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel background = new JPanel();
		background.setForeground(Color.WHITE);
		background.setBackground(new Color(75,0,130));
		background.setBounds(0, 0, 450, 390);
		background.setBorder(new LineBorder(UIManager.getColor("Button.highlight"), 5, true));
		frame.getContentPane().add(background);
		background.setLayout(null);
		
		JLabel titleLabel = new JLabel("Moneyatre");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(120, 5, 197, 64);
		titleLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 40));
		titleLabel.setForeground(Color.WHITE);
		background.add(titleLabel);
		
		JLabel BalanceTitle = new JLabel("CurrentBalance:");
		BalanceTitle.setHorizontalAlignment(SwingConstants.CENTER);
		BalanceTitle.setForeground(Color.WHITE);
		BalanceTitle.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		BalanceTitle.setBounds(10, 144, 202, 64);
		background.add(BalanceTitle);
		
		JLabel titleLabel_2_1 = new JLabel("Account Title:");
		titleLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel_2_1.setForeground(Color.WHITE);
		titleLabel_2_1.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		titleLabel_2_1.setBounds(10, 69, 175, 64);
		background.add(titleLabel_2_1);
		
		JLabel NameLabel = new JLabel(AccountTitle);
		NameLabel.setForeground(Color.WHITE);
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NameLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		NameLabel.setBackground(Color.WHITE);
		NameLabel.setBounds(212, 80, 228, 34);
		background.add(NameLabel);
		
		JLabel BalanceLabel = new JLabel(Balance);
		BalanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		BalanceLabel.setForeground(Color.WHITE);
		BalanceLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		BalanceLabel.setBackground(Color.WHITE);
		BalanceLabel.setBounds(212, 159, 228, 34);
		background.add(BalanceLabel);
		
		JButton WithdrawButton = new JButton("WITHDRAW");
		WithdrawButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		WithdrawButton.setForeground(new Color(75,0,130));
		WithdrawButton.setBackground(Color.white);
		WithdrawButton.setFocusPainted(false);
		WithdrawButton.setBounds(10, 224, 202, 48);
		WithdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new WithdrawScreenUI(AccountNumber);
				frame.setVisible(false);
			}
		});
		background.add(WithdrawButton);
		
		JButton DepositButton = new JButton("FUNDS TRANSFER");
		
		DepositButton.setForeground(new Color(75, 0, 130));
		DepositButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		DepositButton.setFocusPainted(false);
		DepositButton.setBackground(Color.WHITE);
		DepositButton.setBounds(238, 224, 202, 48);
		DepositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FundsTransfer(AccountNumber);
				frame.setVisible(false);
			}
		});
		background.add(DepositButton);
		
		JButton WithdrawButton_2 = new JButton("PIN CHANGE");
		WithdrawButton_2.setForeground(new Color(75, 0, 130));
		WithdrawButton_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		WithdrawButton_2.setFocusPainted(false);
		WithdrawButton_2.setBackground(Color.WHITE);
		WithdrawButton_2.setBounds(120, 302, 202, 48);
		background.add(WithdrawButton_2);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.setHorizontalAlignment(SwingConstants.CENTER);
		CloseButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		CloseButton.setForeground(Color.WHITE);
		CloseButton.setBounds(418, 11, 22, 14);
		CloseButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new HomeScreen();
			}
		});
		background.add(CloseButton);
	}
}



