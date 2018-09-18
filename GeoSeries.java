public class GeoSeries
{
  public static void GeoSeries(int num)
  {
    int i=5;
    int j=0;
    while(j!=num)
    {
      System.out.println(i);
      i = i*2;
      j++;
    }
  }

  public static void main(String[] args)
  {
    GeoSeries(16);
  }
}
