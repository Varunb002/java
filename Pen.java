public class Pen
{
  int InkQty;
  String color;

  public void PenWrite(String data)
  {
    if ((InkQty>0) && (InkQty<=10))
    {
      System.out.println("Writing in Color " + color + "  " + data );
      InkQty-- ;
    }
    else if (InkQty<0)
        System.out.println("Please Refill");
    else if (InkQty>10)
        System.out.println("Overflow");
  }

  public void Refill(int q)
  {
      if (q>0)
      {
        InkQty = q + InkQty;
        if (InkQty>10)
          System.out.println("Ink Full");
      }
      else
          System.out.println("Can't be negative");
  }
}
