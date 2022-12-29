package moneyatreATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SwingConstants;

public class ThankyouScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ThankyouScreen window = new ThankyouScreen();
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
	public ThankyouScreen() {
		initialize();
		frame.setVisible(true);
		new TimedExit();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 150);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 300, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setLayout(null);
		TitlePanel.setBorder(new LineBorder(new Color(75, 0, 130), 2, true));
		TitlePanel.setBackground(Color.WHITE);
		TitlePanel.setBounds(0, 0, 300, 60);
		panel.add(TitlePanel);
		
		JLabel TitleLabel = new JLabel("Moneyatre\n");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setForeground(new Color(75, 0, 130));
		TitleLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		TitleLabel.setBounds(70, 11, 160, 40);
		TitlePanel.add(TitleLabel);
		
		JPanel ThankyouPanel = new JPanel();
		ThankyouPanel.setForeground(Color.WHITE);
		ThankyouPanel.setLayout(null);
		ThankyouPanel.setBackground(new Color(75, 0, 130));
		ThankyouPanel.setBounds(0, 60, 300, 90);
		panel.add(ThankyouPanel);
		
		JLabel ThankyouLabel = new JLabel("Thank you for using");
		ThankyouLabel.setBounds(40, 0, 220, 30);
		ThankyouPanel.add(ThankyouLabel);
		ThankyouLabel.setVerticalAlignment(SwingConstants.TOP);
		ThankyouLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ThankyouLabel.setForeground(Color.WHITE);
		ThankyouLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		
		JLabel ThankyouLabel_2 = new JLabel("Moneyatre ATM ");
		ThankyouLabel_2.setVerticalAlignment(SwingConstants.TOP);
		ThankyouLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		ThankyouLabel_2.setForeground(Color.WHITE);
		ThankyouLabel_2.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		ThankyouLabel_2.setBounds(40, 34, 220, 30);
		ThankyouPanel.add(ThankyouLabel_2);
	}

}


class TimedExit {
Timer timer = new Timer();
TimerTask exitApp = new TimerTask() {
public void run() {
    System.exit(0);
    }
};

public TimedExit() {
timer.schedule(exitApp, new Date(System.currentTimeMillis()+3*500));
    }

}
