package BankingSystem;

public class NoBank implements Bank {
    public int accountNo;
    public String accountName;
    private String secretCode;
    private double balance;
    public double minBalance;
    public static final double rateOfInterest = 8.5;

    public NoBank(int accountNo, String accountName, String secretCode, double balance, double minBalance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.secretCode = secretCode;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public NoBank(String name, String password, int initialBalance) {
        this.accountName = name;
        this.secretCode = password;
        this.balance = initialBalance;
        this.minBalance = 5000.0; // You may want to set a different initial minBalance
    }

    public String addMoney(String password, int money) {
        balance = balance + money;
        return "Final balance is " + balance;
    }

    public String checkBalance(String password) {
        if (password.equals(this.secretCode)) {
            return "The balance is " + balance;
        }
        return "Enter incorrect password";
    }

    public String withdrawMoney(String password, int money) {
        if (password.equals(this.secretCode)) {
            if (balance >= money) {
                balance = balance - money;
                return "Money withdraw successfully!! Final balance is " + balance;
            } else
                return "Insufficient balance is not available";
        } else
            return "Wrong password!";
    }

    public double RateOfInterest(int years) {
        double totalInterest = (balance * NoBank.rateOfInterest * years) / 100;
        return totalInterest;
    }

    public String addMoney(int money) {
        // Implement if needed
        return null;
    }
}
