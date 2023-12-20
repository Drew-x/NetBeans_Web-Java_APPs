/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_Polymorphism;

/**
 *
 * @author I-KingDrew-I
 */
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount2 implements Measurable
{ 
   private double balance ;
 
   /**
      Constructs a bank account with a zero balance
   */
   public BankAccount2()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance
      @param initialBalance the initial balance
   */
   public BankAccount2(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }

   @Override
   public double getMeasure()
   {
      return balance;
   }
}
