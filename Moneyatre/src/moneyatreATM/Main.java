package moneyatreATM;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
