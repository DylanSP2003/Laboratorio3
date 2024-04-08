/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author dylan
 */
public abstract class Account {
    
    protected String accountNumber;
    protected double balance;
    protected Client client;

    public Account() {
    }

    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    //-------------------------------------
    //Methods in order to represent the polimorfism
    //-------------------------------------
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double interestCalculation();
    
    //Redifine toString method
    public String toString(){
        
        String results= "\nBank Account Information"
                +"\n------------------------------"
                +"\nAccount Number: "+this.getAccountNumber()
                +"\nBalance: "+this.getBalance()
                +"\nAccount Owner: "+this.getClient().toString();
        
        return results;
    }
}
