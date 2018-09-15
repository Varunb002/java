public class Count
{
  public static int Count(int range)
  {
    int j,count=0,k;
    for (int i=1;i<=range;i++)
    {
      k = i;
      while(i!=0)
      {
        j = i%10;
        if (j==7)
          count++;
        i=i/10;
      }
    i=k;
    }
  return count;
}

public static void main(String[] args)
{
  System.out.println(Count(100));
}
}
