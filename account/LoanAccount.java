package account;

public class LoanAccount extends Account {
    private double loanAmount;
    private double emiAmount;
    private int loanTenure; // in months
    private double interestRate;
    private double totalInterestPaid;

    public LoanAccount(String accountNo, String name, String address, String phoneNo, LocalDate dob, double balance, double loanAmount, int loanTenure, double interestRate) {
        super(accountNo, name, address, phoneNo, dob, balance);
        this.loanAmount = loanAmount;
        this.loanTenure = loanTenure;
        this.interestRate = interestRate;
        this.emiAmount = calculateEMI();
        this.totalInterestPaid = 0;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getEmiAmount() {
        return emiAmount;
    }

    public int getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(int loanTenure) {
        this.loanTenure = loanTenure;
        this.emiAmount = calculateEMI();
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
        this.emiAmount = calculateEMI();
    }

    public double getTotalInterestPaid() {
        return totalInterestPaid;
    }

    public void setTotalInterestPaid(double totalInterestPaid) {
        this.totalInterestPaid = totalInterestPaid;
    }

    public double calculateEMI() {
        double r = (interestRate / 12) / 100; // monthly interest rate
        double emi = (loanAmount * r * Math.pow(1 + r, loanTenure)) / (Math.pow(1 + r, loanTenure) - 1);
        return emi;
    }

    public void payEMI() {
        if (balance >= emiAmount) {
            balance -= emiAmount;
            totalInterestPaid += (emiAmount - (loanAmount / loanTenure));
            System.out.println("EMI paid successfully. Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to pay EMI");
        }
    }

    public void topUpLoan(double amount) {
        loanAmount += amount;
        loanTenure += 6;
        emiAmount = calculateEMI();
        System.out.println("Loan topped up successfully. Current Loan Amount: " + loanAmount + ", Current EMI Amount: " + emiAmount);
    }

    public void repayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            loanAmount -= amount;
            System.out.println("Repayment done successfully. Current Loan Amount: " + loanAmount + ", Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for repayment");
        }
    }
}
