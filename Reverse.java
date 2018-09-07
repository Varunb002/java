public class Reverse
{
  public static void Reverse(int num)
  {
    int d,flag;
    if (num<0)
      num= -num;
      flag= 1;
    if ((num>0) && (num<9))
      System.out.println("Reverse Order ->" + num);
    while(num!=0)
    {
      d = num%10;
      if (flag==1)
      {
        System.out.print(-d);
        flag=0;
      }
      else
        System.out.print(d);
      num=num/10;
    }
  }
  public static void main(String[] args)
  {
      Reverse(-12345);
  }
}
