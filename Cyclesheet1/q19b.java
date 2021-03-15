import java.util.*;
abstract class BankAccount {
        public double balance;
        public String DOB;
        public String name;
        public String address;

        abstract public void deposit();
    abstract public void withdraw();
    abstract public void getBalance();
    abstract public void inputs();
    
}
 class BankAccountNewClass extends BankAccount 
{
    public void deposit()
    {
        System.out.println("Enter money to be deposited : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("Money Deposited");
    }
    public void withdraw()
    {
        System.out.println("Enter money to be withdrawn : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance = balance - amount;
        System.out.println("Money Withdrwn");
    }
    public void getBalance()
    {
        System.out.print("Balance : " + balance);
        System.out.println("\n");
    }
    public void inputs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nPlease enter Balance, Name, Address, DOB : ");
        this.balance = sc.nextInt();
        this.name=sc.next();
        this.address=sc.next();
        this.DOB=sc.next();
    }
}

public class q19b 
{
    public static void main(String[] args) 
    {
        System.out.println("Harshit Srivastava 19BCE0382");
        Scanner sc = new Scanner(System.in);
        BankAccountNewClass banc = new BankAccountNewClass();
        banc.inputs();
        int choice;
        while (true){
            System.out.println("\nPlease enter choice from below:");
            System.out.println("1 - for Deposit");
            System.out.println("2 - for Withdrawal");
            System.out.println("3 - To just view balance");
            System.out.println("4 - To exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    banc.deposit();
                    break;
                case 2:
                    banc.withdraw();
                    break;
                case 3:
                    banc.getBalance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}