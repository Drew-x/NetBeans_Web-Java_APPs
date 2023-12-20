/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banktester;

/**
 *
 * @author I-KingDrew-I
 */
/**
   A bank account has an account number and a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount{
 
   private String accountNumber ;	// account ID number
   private double balance ;			// amount on deposit
      
   /**
      Creates a bank account with a user-specified account number and balance 
      @param acctNum the initial balance
      @param initialBalance the initial balance
   */
   public BankAccount(String acctNum, double initialBalance){
      
      accountNumber = acctNum ;
      balance = initialBalance ;
   }

   /**
      Gets the account number of this bank account.
      @return the account number
   */
   public String getAccountNumber(){
      
      return accountNumber;
   }
   
   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance(){
      
      return balance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount){
     
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount){
      
      double newBalance = balance - amount;
      balance = newBalance;
   }
}