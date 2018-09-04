public class NoOfOccurances
{
  public static int MatchNumbers(int a, int b)
  {
    int c=0;
    if (b>9)
    {
      return 0;
    }
    if (a<0)
    {
      a = -a;
    }
    while(a != 0)
    {
      if (a%10==b)
      {
        c++;
      }
    a=a/10;
    }
  return c;
  }
  public static void main(String[] args)
  {
    System.out.println (MatchNumbers(-677,6));
  }
}
