package moneyatreATM;

import java.sql.*;
public class TransactionDatabaseConnection {
public static void insertWithdrawalTransaction(String username,String amount,String accountNumber) {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moneyatre","root","Shary1769175!");  
	String sql = "INSERT INTO `moneyatre`.`transactions`(`UserName`,`TransactionDetail`,`AccountNumber`)VALUES  (?, ?, ?)";
	PreparedStatement preparedStmt = con.prepareStatement(sql);
	preparedStmt.setString (1, username);
	preparedStmt.setString (2,"Amount withdrawn of rupees "+amount);
	preparedStmt.setString   (3, accountNumber);
	preparedStmt.execute();
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from transactions");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));  
	con.close();  
	}
	catch(Exception e){ System.out.println(e);}  
}

public static void insertTransferTransaction(String depositor,String amount,String payee,String accountNumber) {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moneyatre","root","Shary1769175!");  
	String sql = "INSERT INTO `moneyatre`.`transactions`(`UserName`,`TransactionDetail`,`AccountNumber`)VALUES  (?, ?, ?)";
	PreparedStatement preparedStmt = con.prepareStatement(sql);
	preparedStmt.setString (1, depositor);
	preparedStmt.setString (2,"transfer "+amount+" to "+payee);
	preparedStmt.setString   (3, accountNumber);
	preparedStmt.execute();
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from transactions");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));  
	con.close();  
	}
	catch(Exception e){ System.out.println(e);}  
}
}
