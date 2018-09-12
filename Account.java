public class Account
{
  String accNum;
  String owner;
  private double balance=0;

  public double Withdraw(double amt)
  {
    if (amt<balance)
    {
      balance = balance - amt;
      System.out.println(owner + " with Account No " + accNum +" has withdrawn Rs " + amt + ". New Balance is Rs " + balance);
      return amt;
    }
    else
    {
      System.out.println("Insufficient Balance in " + accNum + " owned by " + owner );
      return 0;
    }
  }

  public void Debit(double amt)
  {
    balance = balance + amt;
    System.out.println("Rs " + amt + " added to Account no " + accNum + " owned by " + owner + " New Balance is Rs " + balance);
  }

  public void CheckBalance()
  {
    System.out.println("Balance in Account No  "+accNum+" owned by "+owner+" is " + balance);
  }
}
