package ete;
/*class outer {
    static class nested {
        void show() {
            System.out.println("Static nested class method");
        }
    }

    class inner {
        void display() {
            System.out.println("Inner class method");
        }
    }
}
public class nested {
    public static void main(String[] args){
        outer.nested n = new outer.nested();  // making object of static nested class
        n.show();

        outer out = new outer();  // making object of non static class
        outer.inner in = out.new inner();
        in.display();
    }
}



class Employee{
    int id;
    int salary;
    class PersonalInformation{
        String name;
        long phoneNo;

    }
}

class temp{
    public static void main(String[] args){
        Employee ep = new Employee();
        ep.id = 1034;
        ep.salary = 20000;
        Employee.PersonalInformation epInfo = ep.new PersonalInformation();
        epInfo.name = "Chandu";
        epInfo.phoneNo = 6352780623l;
    }
}

 */
import java.util.*;
class t{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String values[] = data.split(",");

        String name = values[0];
        int age = Integer.parseInt(values[1]);
        double d = Double.parseDouble(values[2]);
        System.out.println("Name is: "+name+" "+"Age is: "+age+" Data is: "+d);
    }
}