interface Bank
{
    float rateOfInterest();
}
class SBI implements Bank
{
    public float rateOfInterest()
    {
        return 9.15f;
    }
}
class PNB implements Bank
{
    public float rateOfInterest()
    {
        return 12.04f;
    }
}
public class TestInterface
{
   public static void main(String[] args)
   {
       SBI ob = new SBI();
       PNB ob1 = new PNB();
       System.out.println(ob.rateOfInterest());
       System.out.println(ob1.rateOfInterest());
   }
}
