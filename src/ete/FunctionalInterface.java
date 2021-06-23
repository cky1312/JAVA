package ete;

//import java.util.Scanner;
interface Drawable{
    public void draw();
}
public class FunctionalInterface {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int width=10;

        Drawable d = new Drawable() {
        public void draw(){System.out.println("Drawing "+width);}
        };
        d.draw();

        // with lambda
        Drawable d2 = ()-> {System.out.println("Drawing "+width);};
        d2.draw();
    }
}
