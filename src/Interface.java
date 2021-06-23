interface Shape1
{
    void color();
}
class Circle2 implements Shape1
{
    public void color()
    {
        System.out.println("Red Color");
    }
}
public class Interface
{
    public static void main(String[] args)
    {
        Circle2 c = new Circle2();
        c.color();
    }
}

/*
* An abstract method cannot be declared as static or private.
* A class cannot be declared as private or protected.
* An abstract class may or may not contain abstract method inside it.
* If a class contains at least 1 abstract method then that class has to be declared abstract as well.
* We cannot decrease the scope/visibility of overridden method in child class.
 */
