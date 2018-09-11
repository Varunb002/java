public class Dog
{
  String name;
  private int size=0;

  public void SetSize(int a)
  {
    size = a;
  }

  public int Getsize()
  {
    return size;
  }

  public void Bark()
  {
    if (size<=0)
    {
      System.out.println("Set a valid size");
    }
    else if (size>10)
    {
      System.out.println("Bow Bow " + name);
    }
    else if (size <=10)
      System.out.println("Meow Meow");
  }
}
