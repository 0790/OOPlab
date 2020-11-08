import java.util.Scanner;

class NegativeAmountException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public NegativeAmountException(String s) {
		super(s) ; 
	}
}
class InsufficientFundsException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String s) {
		super(s) ; 
	}
}
class BankAccount
{
    // instance variable

    private String name; // the account number
    private double balance;	   // the amount on deposit

    
    public BankAccount(String acctNum, double initialBalance) throws NegativeAmountException
    {
        if(initialBalance < 0) throw new NegativeAmountException("Please enter positive value") ; 
    	name = acctNum;
        balance = initialBalance;
    }
    public BankAccount(String acctNum)
    {
        name = acctNum;
        balance = 0;
    }
    
    public void deposit(double amount)	throws NegativeAmountException
    {
    	if(amount < 0) throw new NegativeAmountException("Please enter positive value") ;
    	double newBalance = balance + amount;
        balance = newBalance;				// modifies instance var			
    }

    
    public void withdraw(double amount)	throws NegativeAmountException, InsufficientFundsException
    {
    	if(amount < 0) throw new NegativeAmountException("Negative deposit not allowed") ;
    	if(balance < amount) throw new InsufficientFundsException( "Not enough funds") ;
    	double newBalance = balance - amount;
        balance = newBalance;			// modifies instance var
    }

    
    public double getBalance()	
    {
    	return balance ;			// returns value of instance var
    }
    public void printStatement()
    {
    	System.out.printf("Account #%s has balance of $%.2f%n",
                name, getBalance());
    }
    
}
class SavingsAccount extends BankAccount{

	public SavingsAccount(String acctNum) {
		super(acctNum);
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(String acctNum, double initialBalance) throws NegativeAmountException {
		super(acctNum, initialBalance) ;
	}
	public void ROI()
	{
		printStatement() ; 
		System.out.printf("Current rate of interest is 5 percent");
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount first = null;
		
			try {
				first = new SavingsAccount("1111111", 20000);
			} catch (NegativeAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
        
       
		
        // print initial balances
       first.printStatement();
      

       @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in) ;
       System.out.println("Enter 1 for deposit and 2 for withdrawal") ;
       int i = sc.nextInt() ; 
       if(i == 1) {
       System.out.println("Enter amount for deposit") ; 
       double j = sc.nextDouble() ;
       try {
		first.deposit(j);
	} catch (NegativeAmountException e) {
		
		e.printStackTrace();
	} first.printStatement(); 
       first.ROI(); 
       }
       
       else {
    	   System.out.println("Enter amount for withdrawal") ; 
           double j = sc.nextDouble() ;
           
           try {
			first.withdraw(j);
           		} catch (NegativeAmountException | InsufficientFundsException e) {
			
           			e.printStackTrace();
           		} 
		
           		first.printStatement(); 
           		first.ROI(); 
       }

		
	}
}

		


