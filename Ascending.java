public class Ascending
{
  public static int[] asc(int m[])
  {
    int x;
    for (int i=0; i<m.length; i++)
    {
      for (int j=i; j<m.length; j++)
      {
        if (m[i]>m[j])
        {
          x = m[i];
          m[i] = m[j];
          m[j] = x;
        }
      }
    }
  return m;
  }

public static void main (String[] args)
{
  int i[] = {1,2,3,111,45,32,123,44,0,-1,-1,-2,-4};
  for (int k:asc(i))
    System.out.print(k + " ");
System.out.println();
}
}
