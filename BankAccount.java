/**
 * Represents a Bank Account.
 * 
 * @author Karl R. Wurst
 * @version Spring 2018
 */
public class BankAccount
{  
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Deposits money into the bank account and returns the new balance.
      @param amount the amount to deposit
      @return the new balance
   */
   public double deposit(double amount)
   {  
      balance = balance + amount;
      return balance;
   }

   /**
      Withdraws money from the bank account and returns the new balance.
      @param amount the amount to withdraw
      @return the new balance
   */
   public double withdraw(double amount)
   {   
      balance = balance + amount;
      return balance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}
