package BankingSystem;

public interface Bank {
    public String addMoney(String password,int money);
    public String checkBalance(String password);
    public String withdrawMoney(String password,int money);
    public double RateOfInterest(int years);

    String addMoney(int money);
}
