public class PyramidOfStars
{
  public static void CreatePyramid (int m)
  {
    for(int i=1; i<=m; i++)
    {
      for(int j=5; j>=i; j--)
      {
        System.out.print(" ");
      }
      for (int k=1; k<=i; k++)
      {
        System.out.print("* ");
      }
    System.out.println();
    }
  }

  public static void main(String[] args)
  {
      CreatePyramid(5);
  }
}
