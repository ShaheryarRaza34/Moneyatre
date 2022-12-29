package moneyatreATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class AccountRegisterationUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AccountRegisterationUI window = new AccountRegisterationUI();
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
	public AccountRegisterationUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 360, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel AccountOpeningPanel = new JPanel();
		AccountOpeningPanel.setForeground(new Color(0, 0, 0));
		AccountOpeningPanel.setBackground(Color.WHITE);
		AccountOpeningPanel.setForeground(new Color(75,0,130));
		AccountOpeningPanel.setBounds(0, 0, 360, 70);
		AccountOpeningPanel.setLayout(null);
		AccountOpeningPanel.setBorder(new LineBorder(new Color(75,0,130), 2, true));
		frame.getContentPane().add(AccountOpeningPanel);
		
		JLabel AccountOpeningLabel = new JLabel("Account Registeration");
		AccountOpeningLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		AccountOpeningLabel.setForeground(new Color(75,0,130));
		AccountOpeningLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AccountOpeningLabel.setBounds(10, 11, 340, 35);
		AccountOpeningPanel.add(AccountOpeningLabel);
		
		JPanel AccountOpeningForm = new JPanel();
		AccountOpeningForm.setLayout(null);
		AccountOpeningForm.setForeground(Color.WHITE);
		AccountOpeningForm.setBackground(new Color(75,0,130));
		AccountOpeningForm.setBounds(0, 70, 360, 290);
		AccountOpeningForm.setBorder(new LineBorder(new Color(75,0,130), 2, true));
		frame.getContentPane().add(AccountOpeningForm);
		
		JLabel AccountNumberLabel = new JLabel("AccountNumber:");
		AccountNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AccountNumberLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		AccountNumberLabel.setBounds(10, 10, 141, 35);
		AccountNumberLabel.setForeground(Color.WHITE);
		AccountOpeningForm.add(AccountNumberLabel);
		
		JLabel NameLabel = new JLabel("Name:");
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NameLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		NameLabel.setBounds(10, 65, 56, 35);
		NameLabel.setForeground(Color.WHITE);
		AccountOpeningForm.add(NameLabel);
		
		JLabel PasswordLabel = new JLabel("Password:");
		PasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		PasswordLabel.setBounds(10, 120, 89, 35);
		PasswordLabel.setForeground(Color.WHITE);
		AccountOpeningForm.add(PasswordLabel);
		
		JLabel NationalIDLabel = new JLabel("National ID:");
		NationalIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NationalIDLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		NationalIDLabel.setBounds(10, 175, 101, 35);
		NationalIDLabel.setForeground(Color.WHITE);
		AccountOpeningForm.add(NationalIDLabel);
		
		JLabel GenderLabel = new JLabel("Gender");
		GenderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GenderLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		GenderLabel.setBounds(10, 230, 67, 35);
		GenderLabel.setForeground(Color.WHITE);
		AccountOpeningForm.add(GenderLabel);
		
		JCheckBox MaleCheckbox = new JCheckBox("MALE");
		MaleCheckbox.setBackground(new Color(75,0,130));
		MaleCheckbox.setFont(new Font("Tw Cen MT", Font.BOLD, 11));
		MaleCheckbox.setBounds(92, 239, 56, 23);
		MaleCheckbox.setForeground(Color.WHITE);
		AccountOpeningForm.add(MaleCheckbox);
		
		JCheckBox FemaleCheckbox = new JCheckBox("FEMALE");
		FemaleCheckbox.setFont(new Font("Tw Cen MT", Font.BOLD, 11));
		FemaleCheckbox.setBackground(new Color(75,0,130));
		FemaleCheckbox.setBounds(172, 239, 67, 23);
		FemaleCheckbox.setForeground(Color.WHITE);
		AccountOpeningForm.add(FemaleCheckbox);
		
		
		
		JTextArea AccountNumberInput = new JTextArea();
		AccountNumberInput.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		AccountNumberInput.setBounds(161, 18, 189, 22);
		AccountOpeningForm.add(AccountNumberInput);
		
		JTextArea NameInput = new JTextArea();
		NameInput.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		NameInput.setBounds(161, 73, 189, 22);
		AccountOpeningForm.add(NameInput);
		
		JPasswordField PasswordInput = new JPasswordField();
		PasswordInput.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		PasswordInput.setBounds(161, 128, 189, 22);
		AccountOpeningForm.add(PasswordInput);
		
		JTextArea NationalIDInput = new JTextArea();
		NationalIDInput.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		NationalIDInput.setBounds(161, 183, 189, 22);
		AccountOpeningForm.add(NationalIDInput);
		
		JButton RegisterButton = new JButton("REGISTER");
		RegisterButton.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		RegisterButton.setBackground(Color.WHITE);
		RegisterButton.setBounds(245, 239, 105, 23);
		RegisterButton.setForeground(new Color(75,0,130));
		RegisterButton.setFocusPainted(false);
		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accounts newAccount = new Accounts(NameInput.getText(),Integer.parseInt(PasswordInput.getText()),0.0,NationalIDInput.getText());
				if(MaleCheckbox.isSelected())
				{
					newAccount.setGender("MALE");
				}
				else if(FemaleCheckbox.isSelected())
				{
					newAccount.setGender("FEMALE");
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Select the Gender!");
				}
				Moneyatre.AccountsList.put(AccountNumberInput.getText(), newAccount);
				JOptionPane.showMessageDialog(null, "Account Added Successfully");
				frame.setVisible(false);
				new HomeScreen();
				
			}
		});
		AccountOpeningForm.add(RegisterButton);
		
	}
}
