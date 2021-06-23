package ete;


interface Drawable1{
    void draw(int a);
}
public class Lambda {
    public static void main(String[] args) {
        Drawable1 d = (int a) -> {System.out.println("Value "+a);};
        d.draw(4);
    }
}
