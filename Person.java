public class Person
{
  String name;
  int age;

  public void Sleep()
  {
    if ((age>200) || (age<=0))
      System.out.println("Invalid Age");
    else if (age<40)
      System.out.println(" Sleeps More ");
    else if (age>=40)
      System.out.println(" Sleeps Less");
  }
  public void Eat()
  {
    if ((age>200) || (age<=0))
      System.out.println("Invalid Age");
    else if (age<40)
      System.out.println(" Eats Less");
    else if ((age>=40)&&(age<200))
      System.out.println("Eats More");
  }
}
