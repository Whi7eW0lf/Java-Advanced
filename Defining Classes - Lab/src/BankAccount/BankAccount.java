package BankAccount;

public class BankAccount {

    private static int counter = 1;
    private static final double RATE_DEFAULT_VALUE = 0.02;

    private int id;
    private double balance;
    private static double interestRate = RATE_DEFAULT_VALUE;

    public BankAccount() {
        this.id = counter++;
    }

    public static void setInterestRate (double interest) {
        BankAccount.interestRate = interest;
    }

    public double getInterest (int years) {
        return BankAccount.interestRate*years*this.balance;
    }

    public void deposit (double amount){
        this.balance+=amount;
    }

    public int getId (){
        return this.id;
    }
}
