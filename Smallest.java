public class Smallest
{
  public static int sma(int i[])
  {
    int j=i[0];
    for (int m: i)
    {
      if (m<j)
        j=m;
    }
  return j;
  }

  public static void main(String args[])
  {
    int[] k={2,4,10,11,45,23,-3,0};
    System.out.println(sma(k));
  }
}
