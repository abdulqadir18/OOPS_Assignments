import java.util.Scanner;

interface Shape{
    double area();
}
class Circle implements Shape{
    double radius;
    Circle(int r){                
        radius = r;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
}
class Rectangle implements Shape{
    double length,breadth;
    Rectangle(int l,int b){
        length =l;
        breadth = b;
    }
    public double area(){
        return length*breadth;
    }
}
public class A09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the Circle: ");
        int rad = sc.nextInt();
        Circle c = new Circle(rad);
        System.out.println("Area of the circle = "+c.area());
        System.out.print("Enter length and breadth of the rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l,b);
        System.out.println("Area of the rectangle = "+r.area());
    }
}
