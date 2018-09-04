public class DigitSum
{
  public static double SumOfDigits(double d)
  {
      double num=0;
      double num1;
      if (d<0)
      {
        d= -d;
      }
      while ((int)d != d)
      {
        d=d*10;
      }
      while (d!=0)
      {
        num1= d%10;
        num= num + num1;
        d= (int)d/10;
      }
    return num;
  }
  public static void main(String[] args)
  {
    double a = -13456.9;
    System.out.println (SumOfDigits(a));
  }
}
