abstract class Shape
{
    abstract double area();
    abstract double perimeter();
}
class Rectangle extends Shape
{
    double length , width;
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    double area()
    {
        return (length * width);
    }

    double perimeter()
    {
        return (length * width);
    }
}
class Abstract
{
    public static void main(String args[])
    {
       Rectangle obj = new Rectangle(10,20);
       System.out.println("Area: "+ obj.area());
        System.out.println("Perimeter: "+ obj.perimeter());
    }
}