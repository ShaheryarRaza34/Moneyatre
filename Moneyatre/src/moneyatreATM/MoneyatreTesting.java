package moneyatreATM;



public class MoneyatreTesting {

	public static void main(String[] args) {
		
		//Moneyatre.addAccount("1047",new Accounts("Shaheryar Raza", 2244, 200.8));
		//Moneyatre.addAccount("1048", new Accounts("Ahmed", 2198, 260.8));
		Moneyatre.transfer("1047","1048",200.78);
		System.out.println(Moneyatre.getAccountBalance("1047"));
		System.out.println(Moneyatre.getAccountBalance("1048"));
		
	}

}
