class Machine1
{
    int price;
}
class Computer1 extends Machine1
{
    void displayPrice()
    {
        System.out.println("Computer price");
    }
}
class Mobile extends Machine1
{
    void showPrice()
    {
        System.out.println("Mobile price");
    }
}

public class Test
{
    public static void main(String[] args)
    {
        Test t = new Test();
        t.display(new Computer1()); // passing child-class object
        t.display(new Mobile());   // passing child-class object
    }
    void display(Machine1 mc)
    {
        if(mc instanceof Computer1)
        {
            //mc.displayPrice();    error since parent class does not have this method
            Computer1 c = new Computer1();  // downCasting
            c.displayPrice();
        }
        else if(mc instanceof Mobile)
        {
            //mc.showPrice(); // error
            Mobile mb = new Mobile();  // downCasting
            mb.showPrice();
        }
    }
}
