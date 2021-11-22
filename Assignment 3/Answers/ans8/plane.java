
import java.util.*;
import java.lang.*;



public class plane {
    double x1;
    double y1;
     public plane(double nx1,double ny1){
        this.x1=nx1;
       this.y1=ny1;

    }

    public void showCoordinate(){
        System.out.println("coordinates are: " + x1+" and "+y1 );
    }
    
}

class circle extends plane{
    double x2;
    double y2;
    double radious;
    double area;

    public circle(double nx1, double ny1,double nx2, double ny2) {
        super(nx1, ny1);
        this.x2=nx2;
        this.y2=ny2;
        
    }

    public void findRadious(){
        double x=(x1-x2)*(x1-x2);
        double y= (y1-y2)*(y1-y2);
        double ra=Math.sqrt(x+y);
        this.radious=ra/2;
    }

    public void calculateArea() {
        this.area = radious * radious * Math.PI;
        
    }

    public void showData(){
        System.out.println("coordinates are: " + super.x1+","+super.y1+ " and "+this.x2+ ","+this.y2+ " radious is "+this.radious+ " area is "+ this.area);
    }


    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter x1 ");
        int x1 = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.print("Enter y1 ");
        int y1 = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.print("Enter x2 ");
        int x2 = c.nextInt();

        Scanner d = new Scanner(System.in);
        System.out.print("Enter y2 ");
        int y2 = d.nextInt();

        circle obj = new circle(x1,y1,x2,y2);
        obj.findRadious();
        obj.calculateArea();
        obj.showData();
       
    }

    

        
}