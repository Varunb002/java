public class PrimeRanges
{
  public static void FindAllPrimes(int x)
  {
    boolean k;
    for (int i=0; i<=x; i++)
    {
      k= Prime.IsPrime(i);
      if (k == true)
        System.out.print(i + ", ");
    }
  }
}
