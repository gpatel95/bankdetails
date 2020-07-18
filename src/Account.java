
public class Account {
 private int accountid;
 private String accounttype;
 private int balance;
public int getAccountid() {
	return accountid;
}
public void setAccountid(int accountid) {
	this.accountid = accountid;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}

public boolean withdraw(int w) {
	if(getBalance()<w) {
		System.out.println("Sorry!!! No Enough Balance");
		return false;
	}
	else {
		System.out.println("Balance Amount after Withdraw:"+(getBalance()-w));
		return true;
	}
		
}}
