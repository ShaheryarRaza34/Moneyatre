package moneyatreATM;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class HomeScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
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
	public HomeScreen() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBorder(new LineBorder(new Color(75, 0, 130), 2, true));
		TitlePanel.setBackground(Color.WHITE);
		TitlePanel.setBounds(0, 0, 300, 86);
		TitlePanel.setLayout(null);
		
		frame.getContentPane().add(TitlePanel);
		
		JLabel TitleLabel = new JLabel("Moneyatre\n");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setBounds(60, 22, 180, 40);
		TitleLabel.setForeground(new Color(75,0,130));
		TitleLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		TitlePanel.add(TitleLabel);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.setHorizontalAlignment(SwingConstants.CENTER);
		CloseButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		CloseButton.setForeground(new Color(75,0,130));
		CloseButton.setBounds(268, 11, 22, 14);
		CloseButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				new ThankyouScreen();
			}
		});
		
		TitlePanel.add(CloseButton);
		JPanel OptionsPanel = new JPanel();
		OptionsPanel.setBounds(0, 85, 300, 215);
		OptionsPanel.setLayout(null);
		OptionsPanel.setBackground(new Color(75,0,130));
		frame.getContentPane().add(OptionsPanel);
		
		JLabel OptionsLabel = new JLabel("Select Login Type");
		OptionsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		OptionsLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
		OptionsLabel.setForeground(new Color(255,255,255));
		OptionsLabel.setBounds(10, 11, 279, 38);
		OptionsPanel.add(OptionsLabel);
		
		JButton UserLogin = new JButton("USER ");
		UserLogin.setBackground(Color.WHITE);
		UserLogin.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		UserLogin.setForeground(new Color(75,0,130));
		UserLogin.setBounds(76, 70, 139, 38);
		UserLogin.setFocusPainted(false);
		UserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				UserLoginScreenGUI loginScreen = new UserLoginScreenGUI();
				
			}
		});
		
		
		
		OptionsPanel.add(UserLogin);
		
		JButton AdminLogin = new JButton("ADMIN \r\n");
		AdminLogin.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		AdminLogin.setBackground(Color.WHITE);
		AdminLogin.setForeground(new Color(75,0,130));
		AdminLogin.setBounds(76, 127, 139, 38);
		AdminLogin.setFocusPainted(false);
		AdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				AdminLoginScreenGUI loginScreen = new AdminLoginScreenGUI();
				
				
				
			}
		});
		OptionsPanel.add(AdminLogin);
		
		
	}
}
