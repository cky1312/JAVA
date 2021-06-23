class Person
{
     String name;
    int age;
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
}
class Employee extends Person
{
    int income;
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Income: "+income);
    }
}

public class Inheritence1
{
    public static void main(String args[])
    {
        Employee obj = new Employee();
        obj.name = "Max";
        obj.age = 29;
        obj.income = 100000;
        obj.display();
    }
}