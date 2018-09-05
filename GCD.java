public class GCD
{
  public static int FindGCD(int a, int b)
  {
    int d=1;
    int c=0;
    if (a<0)
      a=-a;
    if (b<0)
      b=-b;
    if ((Prime.IsPrime(a)== true) || (Prime.IsPrime(b)== true))
    {
      return 1;
    }
    if(a<b)
    {
      c=a;
      a=b;
      b=c;
    }
    while(d!=0)
    {
      d= a%b;
      if (d==0)
        return b;
      a=b;
      b=d;
    }
  return 0;
  }
  public static void main(String[] args)
  {
      System.out.println(FindGCD(-4,-54));
  }
}
