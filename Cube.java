public class Cube
{
  public static void PrintCube(int num)
  {
    int j=0;
    for (int i=0;j<num;i++)
    {
      if ((int)Math.cbrt(i)==Math.cbrt(i))
      {
        System.out.println(i);
        j++;
      }
    }
  }

  public static void main(String[] args)
  {
    PrintCube(16);
  }
}
