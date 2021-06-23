class Machine
{
     void show()
     {
          System.out.println("Machine");
     }
}
class Computer extends Machine
{
     void show()
     {
          System.out.println("Computer");
     }
     void display()
     {
          System.out.println("display computer");
     }
}

public class Inherit
{
     public static void main(String args[])
     {
          Machine m = new Machine();
          if(m instanceof Computer )
          {
               m.show();
               //m.display();
          }
     }
}
