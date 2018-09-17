public class RandomNumber
{

  public static String Rand()
  {
    int x= (int)(100000 * Math.random());
    int y= (int)(100000 * Math.random());
    String s1= Integer.toString(x);
    String s2= Integer.toString(y);
    return s1+s2;
  }

  public static void main(String[] args)

    {
      System.out.println(Rand());
    }

}
