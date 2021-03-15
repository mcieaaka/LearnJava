class BankAcc
{
    // instance variable
    private String accNum; // the account number
    private double balance;	   // the amount on deposit
    /**
     * Constructs a bank account with an account number and initial balance
     */
    public BankAcc(String acctNum, double initialBalance)
    {
        accNum = acctNum;
        balance = initialBalance;
    }
    /**
     * Deposits money into the bank account.
          */
    public void deposit(double amount)	// note "mutator" method
    {
        double newBalance = balance + amount;
        balance = newBalance;							
    }
    /**
     * Withdraws money from the bank account.
     */
    public void withdraw(double amount)	// note "mutator" method
    {
        double newBalance = balance - amount;
        balance = newBalance;			
    }
    /**
     * Gets the account number
     */
    public String getAccount()	
    {
        return accNum;		
    }
    /**
     * Gets the current balance
     */
    public double getBalance()	// note "accessor" method
    { 
         return balance;
    }
    /**
     * Transfer funds from one bank account object to another
     */
    public void transferFundsA(BankAcc destination, double amount)
    {
        destination.balance = destination.balance + amount;
        this.balance = this.balance - amount;
    }
   public void transferFundsB(BankAcc destination, double amount)
    {
        destination.deposit(amount);	// deposit to "destination" account
        this.withdraw(amount);           
    }
}
/**
 * A class to test the BankAccount2 class
 */
public class Controller
{
    public static void main(String[] args)
    {
        // create two BankAccount objects
        BankAcc first = new BankAcc("10101", 120000);
        BankAcc second = new BankAcc("20202", 130000);
        // print initial balances
        System.out.printf("Account #%s has initial balance of Rs%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has initial balance of Rs%.2f%n",
                second.getAccount(), second.getBalance());
        first.transferFundsA(second, 5000);
        // print new balances
        System.out.println("\nAfter \"first.transferFunds(second, 5000)\" ...");
        System.out.printf("Account #%s has new balance of Rs%.2f%n",
                first.getAccount(), first.getBalance());
        System.out.printf("Account #%s has new balance of Rs%.2f%n",
                second.getAccount(), second.getBalance());
        // transfer $10000 from second account to first (via transferFundsB())
        second.transferFundsB(first, 10000);
        // print new balances
        System.out.println("\nAfter \"second.transferFunds(first, 10000)\" ...");
        System.out.printf("Account #%s has new balance of Rs%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has new balance of Rs%.2f%n",
                second.getAccount(), second.getBalance());
    }
}