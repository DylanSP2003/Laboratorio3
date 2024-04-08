/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author dylan
 */
public class SavingAccount extends Account{
    
    private String StartDate;
    private int MonthsNumber;
    private float interest;

    public SavingAccount() {
    }

    public SavingAccount(String StartDate, int MonthsNumber, float interest) {
        this.StartDate = StartDate;
        this.MonthsNumber = MonthsNumber;
        this.interest = interest;
    }

    public SavingAccount(String StartDate, int MonthsNumber, float interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.StartDate = StartDate;
        this.MonthsNumber = MonthsNumber;
        this.interest = interest;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public int getMonthsNumber() {
        return MonthsNumber;
    }

    public void setMonthsNumber(int MonthsNumber) {
        this.MonthsNumber = MonthsNumber;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
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
    
    

    @Override
    public void deposit(double amount) {
        super.setBalance(interestCalculation()+amount);
    }

    @Override
    public void withdraw(double amount) {
        super.setBalance(interestCalculation()-amount);
    }

    @Override
    public double interestCalculation() {
        
        double interestTotal = 0;
        interestTotal = this.getMonthsNumber()
                *super.getBalance()
                *this.getInterest();
        
        return super.getBalance()+interestTotal;
    }
    
    
    
    //toString
    public String toString(){
        
        String results = "\nAccount Type: Saving Account"
                +"\n---------------------------------------"
                +"\nSaving Start Date: "+this.getStartDate()
                +"\nMonths: "+this.getMonthsNumber()
                +"\nInterest: "+this.getInterest()
                +"\nInterest you get: "+(this.getMonthsNumber()
                +super.getBalance() + this.getInterest() /100)
                +"\nStart Date + Interest won:"+ this.interestCalculation()+"\n";
        
        return super.toString()+results;
    }
    
    
}
