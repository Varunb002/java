public class DigitCount
{
  public static byte CountDigits(long x)
  {
    byte y=0;
    while(x!=0)
    {
      x = x/10;
      y++;
    }
  return(y);
  }
  public static void main(String[] args)
  {
    int a = -13456;
  System.out.println(CountDigits(a));
  }
}
