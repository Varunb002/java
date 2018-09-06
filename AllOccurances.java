public class AllOccurances
{
  public static String ScanOccurances(int num1, int num2)
  {
    if (num1<0)
      num1=-num1;
    if (num2<0)
      num2=-num2;
    if (num1==num2)
      return "THERE";
    if (num1<num2)
    {
      int a= num1;
      num1=num2;
      num2=a;
    }
    int q=num1;
    int d,f;
    m2:while(num2!=0)
    {
      d= num2 % 10;
      num2 = num2/10;
      num1=q;
      m1:while(num1!=0)
      {
        f = num1%10;
        num1=num1/10;
        if(d == f)
          continue m2;
        else if ((d!=f) && (num1==0))
          return "NOT THERE";
        else if (d!=f)
          continue m1;
      }
    }
    return "THERE";
  }
  public static void main(String[] args)
  {
      System.out.println(ScanOccurances(843114,13487));
  }
}
