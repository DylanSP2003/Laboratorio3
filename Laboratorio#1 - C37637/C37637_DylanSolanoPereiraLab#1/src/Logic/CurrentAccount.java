/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author dylan
 */
public class CurrentAccount extends Account {

    private float interest;

    public CurrentAccount() {
    }

    public CurrentAccount(float interest) {
        this.interest = interest;
    }

    public CurrentAccount(float interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.interest = interest;
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
        super.setBalance(interestCalculation() + amount);
    }

    @Override
    public void withdraw(double amount) {
        super.setBalance(interestCalculation() - amount);
    }

    @Override
    public double interestCalculation() {
        double interestTotal = 0;

        interestTotal = (super.getBalance() * this.interest) / 12;

        return super.getBalance()+interestTotal;
    }

    @Override
    public String toString() {
        String results = "\nAccount Type: Current Account"
                + "\n---------------------------------------"
                + "\nInterest: " + this.getInterest()+"%"
                + "\nEarned balance:" + this.interestCalculation() + "\n";

        return super.toString() + results;
    }

}
