package BankingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter your password");
        String password=sc.next();
        System.out.println("enter the initial balance you want to add");
        int initialBalance=sc.nextInt();

        Bank bankAc=new NoBank(name,password,initialBalance);
        System.out.println("your bank account has been created!!");
        System.out.println("enter the money you want to add");
        int money=sc.nextInt();
        String result=bankAc.addMoney(password,money);
        System.out.println(result);
        System.out.println("enter the money you want to withdraw");
         money=sc.nextInt();
        System.out.println("enter the password");
        password=sc.next();
        result=bankAc.withdrawMoney(password,money);
        System.out.println(result);

        System.out.println("lets see you balance now !!");
        System.out.println("enter the password");
        password=sc.next();
        result= bankAc.checkBalance(password);
        System.out.println(result);

        System.out.println("enter the time you want to save money for");
        int years=sc.nextInt();
        double rateOfInterest=bankAc.RateOfInterest(years);
        System.out.println("total interest that will be earned is"+rateOfInterest);



    }
}