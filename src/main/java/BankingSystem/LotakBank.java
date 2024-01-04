package BankingSystem;

public class LotakBank implements Bank {
    private String bankAccountNo;
    private String password;
    private double balance;
    public static final double RateOfInterest=6.5;


    public LotakBank() {
        //ToDo task:Random generator function
        //generate a 10 digit account No and initialize the account no
        this.balance=balance;
        this.password=password;
    }



    public String addMoney(String password, int money) {
        balance=balance+money;
        return "The "+money+"has been added.New balance is"+balance;
    }

    public String checkBalance(String password) {
        if(password.equals(this.password)){
            return "The balances is"+this.balance;
        }
        else
            return "The password entered is incorrect";
    }

    public String withdrawMoney(String password, int money) {
        if(password.equals(this.password)){
            if(balance>=money){
                balance=balance-money;
                return "The money has been withdraw,new balances"+balance;
            }
            else
                return "Sufficient balance is not available";
        }else
           return "the password entered is incorrect";
    }

    public double RateOfInterest(int years) {
        double totalInterest= ((balance*LotakBank.RateOfInterest*years)/100);
        return totalInterest;
    }

    @Override
    public String addMoney(int money) {
        return null;
    }
}
