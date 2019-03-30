/**
 * A bank account class with methods to deposit to, withdraw from,
 * change the name on, and get a String representation
 * of the account.
 */
import java.util.Random;
public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private static int numAccounts;
    private static int numofwithdrawals;
    private static int numofdeposits;
    private static double totalwithdrawals;
    private static double totaldeposited;
    
    Random gen = new Random();
    /**
     * Constructor -- initializes balance, owner, and account number
     */
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++;
    }

    public Account(double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = Math.abs(gen.nextLong());
        numAccounts++;
    }

    public Account(String owner)
    {
        balance = 0;
        name = owner;
        acctNum = Math.abs(gen.nextLong());
        numAccounts++;
    }

    /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     */
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            numofwithdrawals++;
            totalwithdrawals = totalwithdrawals + amount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }
    
    public static int getNumOfWithdrawals()
    {
        return numofwithdrawals;
    }
    
    public static int getNumOfDeposits()
    {
        return numofdeposits;
    }
    
    public static double getTotalDeposited()
    {
        return totaldeposited;
    }
    
    public static double getTotalWithdrawals()
    {
        return totalwithdrawals;
    }
    
    public static void reset()
    {
        numofwithdrawals = 0;
        numofdeposits = 0;
        totaldeposited = 0;
        totalwithdrawals = 0;
    }
    
    public void withdraw(double amount, double fee)
    {
        if (balance >= (amount + fee))
        {
            balance -= (amount + fee);
            numofwithdrawals++;
            totalwithdrawals = totalwithdrawals + amount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }

    /**
     * Adds deposit amount to balance.
     */
    public void deposit(double amount)
    {
        balance += amount;
        numofdeposits++;
        totaldeposited = totaldeposited + amount;
    }
    
    public String getName()
    {
        return name;
    }
    
    public long getAcctNum()
    {
        return acctNum;
    }

    /**
     * Returns balance.
     */
    public double getBalance()
    {
        return balance;
    }
    
    public static int getNumAccounts()
    {
        return numAccounts;
    }
    
    public void close()
    {
        name = name + "(CLOSED)";
        balance = 0;
        numAccounts--;
    }
    
    public static Account consolidate(Account acct1, Account acct2)
    {
        String name1 = acct1.getName();
        String name2 = acct2.getName();
        long acctNum1 = acct1.getAcctNum();
        long acctNum2 = acct2.getAcctNum();
        double balance1 = acct1.getBalance();
        double balance2 = acct2.getBalance();
        double newbalance;
        if (acctNum1 == acctNum2)
        {
            System.out.println("The 2 accounts have the same account number");
            return null;
        }
        else if (name1.equalsIgnoreCase(name2))
        {
            newbalance = balance1 + balance2;
            Account newacct = new Account(newbalance, name1);
            acct1.close();
            acct2.close();
            return newacct;
        }
        else
        {
            System.out.println("The 2 accounts have different names");
            return null;
        }
    }
    
    /**
     * Returns a string containing the name, account
     * number, and balance.
     */
    public String toString()
    {
        return "Name: " + name + "\nAccount Number: " + acctNum +
        "\nBalance: " + balance;
    }
    
    //Extra Credit
    
    public void transfer(Account acct, double amount)
    {
        this.withdraw(amount);
        acct.deposit(amount);
    }
    
    public static void transfer(Account acct1, Account acct2, double amount)
    {
        acct1.withdraw(amount);
        acct2.deposit(amount);
    }
}
