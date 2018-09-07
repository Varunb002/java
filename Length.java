public class Length
{
  public static int CountNumbers(int num)
  {
    int d=0;
    if (num<0)
      num= -num;
    if (num==0)
      return 1;
    while(num!=0)
    {
      num=num/10;
      d++;
    }
    return d;
  }
  public static void main(String[] args)
  {
      System.out.println(CountNumbers(10));
  }
}
