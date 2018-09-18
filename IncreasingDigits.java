public class IncreasingDigits
{
  public static boolean IsIncreasing(int num)
  {
    int i, j=10;
    while(num!=0)
    {
      i = num%10;
      if (i>=j)
        return false;
      j= i;
      num=num/10;
    }
  return true;
  }

  public static void main(String[] args)
  {
    System.out.println(IsIncreasing(4));
  }
}
