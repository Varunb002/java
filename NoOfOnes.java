public class NoOfOnes
{
  public static boolean PowerOfTwo (float i)
  {
    while(i != 2)
    {
      i = i/2;
      if (i%2!=0)
        break;
    }
    if(i==2)
      return true;
    else
      return false;
  }

  public static byte CountOnes(int i, byte v)
  {
    int j=0;
    byte k=0;
    if ((v==0) && (i<0))
    {
      i= -i;
    }
    if (PowerOfTwo(i) == true)
      return 1;
    while(i != 0)
      {
        j = i&1;
        if (j==1)
        k++;
        i= i>>>1;
      }
    return k;
  }

  public static void main(String[] args)
  {
    System.out.println (CountOnes(-9,(byte) 1));
  }
}
