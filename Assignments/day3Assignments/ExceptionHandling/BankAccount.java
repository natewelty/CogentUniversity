package ExceptionHandling;

public class BankAccount {
	
	
	int accNo;
	String accName;
	enum Type { Savings, Current;}
	Type accType;
	float balance;
	public BankAccount(int accNo, String accName, Type accType, float balance) {
		super();
		
		if (balance<0) {
			throw new NegativeAmountException("Balance cannot be negative.");
		}
		if (balance<1000 && accType.compareTo(Type.Savings)==0) {
			throw new InsufficientBalanceException("Insufficient balance for account creation.");
		}
		if (balance<5000 && accType.compareTo(Type.Current)==0) {
			throw new InsufficientBalanceException("Insufficient balance for account creation.");
		}
		
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.balance = balance;
	}
	public void deposit(float amt) {
		if (amt<0.0) {
			throw new NegativeAmountException("Cannot deposit a negative amount.");
		}
		balance += amt;
	}
	public void withdraw(float amt) {
		if (amt<0.0) {
			throw new NegativeAmountException("Cannot withdraw a negative amount.");
		}
		if (amt>balance+1000 && accType.compareTo(Type.Savings)==0) {
			throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
		}
		if (amt>balance+5000 && accType.compareTo(Type.Current)==0) {
			throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
		}
		balance-=amt;
	}
	public float getBalance() {
		if (balance<1000 && accType.compareTo(Type.Savings)==0) {
			throw new InsufficientBalanceException("Insufficient balance.");
		}
		if (balance<5000 && accType.compareTo(Type.Current)==0) {
			throw new InsufficientBalanceException("Insufficient balance.");
		}
		return balance;
	}
}

class NegativeAmountException extends ArithmeticException{
	public NegativeAmountException(String errorMessage) {
		super(errorMessage);
	}
}
class InsufficientBalanceException extends ArithmeticException{
	public InsufficientBalanceException(String errorMessage) {
		super(errorMessage);
	}
}