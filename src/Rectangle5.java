interface Shape5{
    public double getArea();
}

class Rectangle8 implements Shape5{
    double length,width;
    Rectangle8(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double getArea(){
        return(length*width);
    }
}
class Circle5 implements Shape5{
    double radius;
    Circle5(double radius){
        this.radius=radius;
    }

    public double getArea() {
        return (3.14*radius*radius);
    }
}
public class Rectangle5{
    public static void main(String[] args){
        Rectangle8 r=new Rectangle8(2.5,3.5);
        Calculate(r);
        Circle5 c =new Circle5(3.6);
        Calculate(c);

    }
    static void Calculate(Shape5 obj ){
        System.out.println("Area: "+obj.getArea());
        if(obj instanceof Rectangle8){
            Rectangle8 r=(Rectangle8) obj;
            System.out.println("Length: "+r.length);
            System.out.println("Width: "+r.width);
        }
        if(obj instanceof Circle5){
            Circle5 c = (Circle5) obj;
            System.out.println("Radius: "+c.radius);
        }
    }
}