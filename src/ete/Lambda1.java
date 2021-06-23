package ete;
interface Shape{
    void area();
}
public class Lambda1 {
    public static void main(String[] args) {
//        Shape s = new Shape(){
//            public void area(){
//                System.out.println("Child area");
//            }
//        };
        display(
                () -> {
                    System.out.println("Circle area: " + 3.14 * 5 * 5);
                }
        );
        display(
                () -> {
                    System.out.println("Square area: " + 5 * 5);
                }
        );

    }
        static void display(Shape s){
            s.area();

    }
}
