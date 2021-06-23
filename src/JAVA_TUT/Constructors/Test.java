package JAVA_TUT.Constructors;

import java.util.*;
public class Test {
    int a;
    Test(int a){
        this.a = a;
        System.out.println(a + " object is created");
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Test obj = new Test(9);
        Vehicle ob = new Vehicle();
        System.out.println(ob.wheels+" wheels");
        System.out.println(obj.a+" wheels");
    }
}
class Vehicle{
    int wheels;
    Vehicle(){
        wheels = 4;
    }
}