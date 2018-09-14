public class Prime
{
  public static boolean IsPrime(int a)
  {
    if (a==0)
      return false;
    if ((a==1) || (a==2))
      return true;

    for(int i=2; i<=a/2; i++ )
    {
      if (a%i==0)
      {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args)
  {
      System.out.println(IsPrime(0));
  }
}
