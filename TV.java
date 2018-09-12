public class TV
{
  String name;
  private int channel=0;
  private byte volume = 0;
  boolean on;

  public void IncrementChannel()
  {
    if (on == true)
    {
      if (channel<1000)
        channel++;
      else
        channel=0;
      System.out.println("Channel Incremented");
    }
    else
      System.out.println("Switch ON TV first");
  }

  public void DecrementChannel()
  {
    if (on == true)
    {
      if (channel > 0)
        {
          channel--;
        }
      else
        channel = 1000;
      System.out.println("Channel Incremented");
    }
    else
      System.out.println("Switch ON TV first");
  }

  public void ChangeChannel(int x)
  {
    if (on == true)
    {
      if ((x<1000) && (x>0))
        {
          channel = x;
          System.out.println("Channel  Changed");
        }
      else
        {
          System.out.println("Invalid Channel");
        }
    }
    else
      System.out.println("Switch ON TV first");
  }

  public void VolumeIncrement()
  {
    if (on == true)
    {
      if (volume<100)
      {
        volume++;
        System.out.println("Current Volume " + volume );
      }
      else
        System.out.println("Maximum Volume Reached");
    }
    else
      System.out.println("Switch ON TV first");
  }

  public void VolumeDecrement()
  {
    if (on == true)
    {
      if (volume>0)
      {
        volume--;
        System.out.println("Current Volume " + volume );
      }
      else
        System.out.println("Muted");
    }
    else
      System.out.println("Switch ON TV first");
  }

  public void SwitchON()
  {
    on = true;
    System.out.println("Switched ON");
  }

  public void SwitchOFF()
  {
    on = false;
    System.out.println("Switched OFF");
  }

  public void Display()
  {
    if ( on == true)
    {
      System.out.println("Current Channel " + channel);
    }
    else
      System.out.println("Switch ON TV first");
  }
}
