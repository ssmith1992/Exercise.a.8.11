package Week10.Exercise11;

//Add a field to the BankAccount class named transactionFee for a real number representing an amount of money
//to deduct every time the user withdraws money. The default value is $0.00, but the client can change the value.
//Deduct the transaction fee money during every withdraw call (but not from deposits). Make sure that the balance
//cannot go negative during a withdrawal. If the withdrawal (amount plus transaction fee) would cause it to become
//negative, don’t modify the balance at all.

public class BankAccount
{
    private String name;
    private double balance;
    private double transactionFee;

    public BankAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
        this.transactionFee = 0;
    }

    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount)
    {
        if (this.balance - amount - this.transactionFee >= 0)
        {
            this.balance = this.balance - amount - this.transactionFee;
        }
        else
        {
            System.out.println("Not enough money, OP CANCELLED");
        }
    }

    public void setTransactionFee(double transactionFee)
    {
        this.transactionFee = transactionFee;
    }
}
