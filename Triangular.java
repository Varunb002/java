public class Triangular
{
  public static void FindTSeries(int num)
  {
    int k=0;
    for (int i=1;i<=num;i++)
    {
      k= k+i;
      System.out.println(k);
    }
  }

  public static void main(String[] args)
  {
    FindTSeries(10);
  }
}
