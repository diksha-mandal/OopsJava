package account;

public class SavingsAccount extends Account {
    private double interestRate = 4.0;
    
    // Parameterized Constructor
    public SavingsAccount(int accountNo, String name, String address, String phoneNo, String dob, double balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
    }
    
    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
    
    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    // Method for fixed deposit
    public void fixedDeposit(double amount, int years) {
        if (amount > 0 && years > 0) {
            double interest = (amount * interestRate * years) / 100;
            setBalance(getBalance() + amount + interest);
            System.out.println("Fixed deposit created for " + years + " years with amount: " + amount);
            System.out.println("Interest earned: " + interest);
        } else {
            System.out.println("Invalid amount or years.");
        }
    }
}

