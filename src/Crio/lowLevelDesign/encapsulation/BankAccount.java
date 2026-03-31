package Crio.lowLevelDesign.encapsulation;

public class BankAccount {
    private double balance;
    private final String name;
    private final Long accountNumber;


    public double getBalance()
    {
        return balance;
    }
    public String getName()
    {
        return name;
    }
    public Long getAccountNumber()
    {
        return accountNumber;
    }
    
    public BankAccount(String name, Long accountNumber, double amount)
    {
        if(name == null || accountNumber == null || amount <= 0)
        {
            throw new IllegalArgumentException("Invalid arguments.");
        }
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = amount;
    }

    public boolean deposit(double amount)
    {
        if(amount <= 0)
        {
            return false;
        }
        this.balance += amount;
        return true;
    }

    public boolean withdraw(double withdrawAmount)
    {
        if(withdrawAmount > balance || withdrawAmount <= 0)
        {
            return false;
        }

        this.balance -= withdrawAmount;
        return true;
    }

}
