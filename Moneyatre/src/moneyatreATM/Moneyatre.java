package moneyatreATM;

import java.util.HashMap;


import javax.swing.JOptionPane;


import java.util.*;

public class Moneyatre {
 static Map<String,Accounts> AccountsList = new HashMap<String,Accounts>(){{put("1047",new Accounts("Shaheryar Raza",2244,1510.29,"4220173521679"));put("1048",new Accounts("John",2348,5000.0,"4220173521678"));}};
 static Map<String,String>AdminUsers= new HashMap<String,String>(){{put("MATM-1146","1468");}};
 

public static void addAccount(String accountNumber,Accounts newAccount) {
	try {
	AccountsList.put(accountNumber,newAccount);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static void printAccounts()
{
	System.out.println(AccountsList.toString());
}
public static String verify(String accountNumber,int Pincode) {
	if(AccountsList.containsKey(accountNumber)) {
		if(AccountsList.get(accountNumber).password==Pincode)
		{
			return "verified";
		}
		else {
			return "invalid password";
		}
		
		
	}
	else {
		return "invalid account";
	}
		
	
	
}
public static String verify(String accountNumber,String password) {
	if(AdminUsers.containsKey(accountNumber)) {
		if(AdminUsers.get(accountNumber).equals(password))
		{
			
			
			return "verified";
		}
		else {
			
			return "invalid password";
		}
		
		
	}
	else {

		return "inavlid account";
	}
		
	
	
}

public static void withdraw(String accountNumber, Double amount)
{
	
	if(AccountsList.get(accountNumber).getBalance()>=amount)
	{
		if(amount%500==0) {
		JOptionPane.showOptionDialog(null, 
		        "Is Amount Correct?", 
		        "Confirmation", 
		        JOptionPane.OK_OPTION, 
		        JOptionPane.INFORMATION_MESSAGE, 
		        null, 
		        new String[]{"Confirm", "Go Back"}, // this is the array
		        "default");
		AccountsList.get(accountNumber).setBalance(AccountsList.get(accountNumber).getBalance()-amount);
		JOptionPane.showMessageDialog(null,"Please Collect your cash Thank you!");
		//TransactionDatabaseConnection.insertWithdrawalTransaction(AccountsList.get(accountNumber).getName(), amount.toString(), accountNumber);
		}
		else {
			JOptionPane.showMessageDialog(null, "Enter Amount in multiple of 500");
		}
	}
	else {
		JOptionPane.showMessageDialog(null, "Insufficient Balance");
		
	}
}

public static boolean validateAccount(String accountNumber)
{
	return((AccountsList.containsKey(accountNumber))? true:false);
	
}
public static void transfer(String depositor,String payee, Double amount)
{	if(validateAccount(depositor)==false||validateAccount(payee)==false)
		JOptionPane.showMessageDialog(null, "Invalid Account");
	else {
		if(AccountsList.get(depositor).getBalance()>=amount)
		{
			AccountsList.get(depositor).setBalance((AccountsList.get(depositor).getBalance()-amount));
			AccountsList.get(payee).setBalance((Double)AccountsList.get(payee).getBalance()+amount);
			JOptionPane.showMessageDialog(null,"Transfer Successfull");
			//TransactionDatabaseConnection.insertTransferTransaction(AccountsList.get(depositor).getName(), amount.toString(),payee,depositor);
		}
		else {
			JOptionPane.showMessageDialog(null, "Insufficient Balance");
		}
	}
}
public static String getAccountBalance(String accountNumber) {
	return String.format("%.2f",AccountsList.get(accountNumber).getBalance());
}
public static String getAccountTitle(String accountNumber) {
	return AccountsList.get(accountNumber).getName();
}
public static void print() {
	Iterator listIterator = AccountsList.entrySet().iterator();
	while(listIterator.hasNext()) {
		Map.Entry mapElement= (Map.Entry)listIterator.next();
		System.out.println("AccountNumber: "+mapElement.getKey()+"\nName: "+AccountsList.get(mapElement.getKey()).Name+"\nPassword: "+ +AccountsList.get(mapElement.getKey()).password+"\nCNIC: "+AccountsList.get(mapElement.getKey()).NationalID+"\nGender: "+ AccountsList.get(mapElement.getKey()).Gender);
	}
}
}


