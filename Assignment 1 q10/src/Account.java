import java.util.Date;

public class Account {
    private int id;
    private double balance;
    protected static double annualInterestRate;
    private Date dateCreated;
    public void SetID(int ID)
    {
        this.id=ID;
    }
    public int GetID()
    {
        return id;
    }
    public void SetBalance(double Balance)
    {
        this.balance=Balance;
    }
    public double GetBalance()
    {
        return balance;
    }
    public void SetAIR(double AnnualInterestRate)
    {
        this.annualInterestRate=AnnualInterestRate;
    }
    public double GetAIR()
    {
        return annualInterestRate;
    }
    public Date GetDate()
    {
        return dateCreated;
    }
    Account()
    {}
    Account(int ID, double Balance)
    {
        this.id=ID;
        this.balance=Balance;
    }
    public double getMonthlyInterestRate()
    {
        return ((annualInterestRate/12)/100);
    }
    public double getMonthlyInterest()
    {
        return (balance*getMonthlyInterestRate());
    }
    public double withdraw(int Amount)
    {
        balance=balance-Amount;
        return balance;
    }
    public double deposit(int Amount)
    {
        balance=balance+Amount;
        return balance;
    }
}
