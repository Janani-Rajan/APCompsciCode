//Janani Rajan, 9/18/2020
public class BankAccount {
	private int number;
	private double balance;
	
	/*
	 * Constructs a Bank Account with 0 balance and 0 as the number..
	 */
	public BankAccount() {
		number = 0; 
		balance = 0;
	}
	
	/*
	 * Constructs a Bank Account with an initial number and balance
	 * @param i the account number
	 * @param j the intial balance
	 */
	
	public BankAccount(int i, double j) {
		number = i;
		balance = Math.round(j * 100.0)/100.0; //Rounds to 2 decimal places
	}
	
	/*
	 * Returns the Bank Account number
	 * @return the account number
	 */
	
	public int getNumber() {
		return number;
	}
	
	/*
	 * Returns the Bank Account balance
	 * @return the account balance
	 */
	
	public double getBalance() {
		return balance;
	}
	
	/*
	 * Deposits an amount of money into the bank account
	 * @param i the amount of money to be deposited
	 */
	
	public void deposit(double i) {
		balance = Math.round((balance + i) * 100.0)/100.0; //Rounds to 2 decimal places
	}
	
	/*
	 * Withdraws an amount of money into the bank account
	 * @param i the amount of money to be withdrawn
	 */
	
	public void withdraw(double i) {
		balance = Math.round((balance - i) * 100.0)/100.0; //Rounds to 2 decimal places
	}
	
	/*
	 * Calculates the interest of the bank account
	 * @param interestrate the rate of interest
	 */
	
	public void calculateInterest(double interestrate) {
		balance = Math.round((balance * interestrate * (1.0d/12.0d)) * 100.0)/100.0 + balance;
	}
	
	/*
	 * Withdraws an amount of money into the bank account
	 * @param i the amount of money to be withdrawn
	 */
	
	@Override
	public String toString() {
		return "Account Number: " + number + "\n Balance: $" + balance;
	}
	
	
	
}
