package CC;

public class CreditCard {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void addMoney(double addSum)
    {
        if (addSum>=0)
        {
            this.balance+=addSum;
        }else{
            System.out.println("You cannot add this sum:"+addSum);
        }

    }
    public double getBalance()
    {
        return this.balance;
    }

    public void withdraw(double withdrawSum)
    {

        if (withdrawSum <= this.balance)
        {
            this.balance-=withdrawSum;
        }else{
            System.out.println("You cannot withdraw the Sum:" + withdrawSum + ". " +
                    "Because you don`t have enough money. Your balance is:" + this.balance);
        }






    }





    public String getCreditCardinfo()
    {
        return "Credit Card account Number:" +this.accountNumber +"\n" +
                "Credit Card current balance is:" +this.balance +"\n";

    }



}
