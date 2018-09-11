public class Car
{
  String name;
  int fuel;
  private int csf, csr ; // current state of forward/reverse direction when fuel exhausted
  private boolean flag;  // To check wheather car has started or not

  public void Start()
  {
    if (fuel > 0)
    {
      flag = true;
      System.out.print("Car Started..... ");
    }
    else
      System.out.println(" No Fuel ");
  }

  public void Drive(int i)
  {
    if (flag==false)
      System.out.println("Start the car first");
    else if (fuel<0)
      System.out.println("No Fuel");
    else
    {
      i = csf + i; // if car was moving b4 fuel got exhausted add the distance that it had travelled to the new distance(if given)
      while ((fuel>0) && (i>0))
      {
        System.out.print(name + " Going" + "  >>>>>>>>>>  ");
        fuel--; // 1 unit of fuel decreased/unit distance
        i--;    // 1 unit distance travelled
        if (fuel==0)
        {
          System.out.println(" Fuel Exhausted  ");
          flag=false; // stop car
          csf=i;     // current position of car
        }
        if (i==0)
        {
          System.out.println("  Destination Reached \n ");
          Stop();  // car stopped
        }
      }
    }
  }

    public void Reverse(int i)
    {
      if (flag==false)
        System.out.println(" Start the car first ");
      else if (fuel<0)
        System.out.println(" No Fuel ");
      else
      {
        i = csr + i;
        while ((fuel>0) && (i>0))
        {
          System.out.print(name + "goung" + "   <<<<<<<<<<<<<<   ");
          fuel--;
          i--;
          if (fuel==0)
          {
            System.out.println(" Fuel Exhausted ");
            flag=false;
            csr=i;
          }
          if (i==0)
          {
            System.out.print("...  Destination Reached \n");
            Stop();
          }
        }
      }
    }

  public void Stop()
  {
    if (flag==true)
    {
    System.out.println(" Car Stopped ");
    flag = false;
    Reset() ; // once the car is stopped intentionally reset its current state
    }
  }

  public void Reset()  // after fuel exhausts and user refills the tank after which if he decides to goto different destination
  {
    csf=0;
    csr=0;
  }
}
