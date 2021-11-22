import java.util.*;
public class prism {
    double l;
    double w;
    double h;
    double topArea;
    double bottomArea;
    double leftArea;
    double rightArea;
    double frontArea;
    double  backArea;
    double area;

public void setPrism(double l,double w, double h){
 this.l=l;
 this.w=w;
 this.h=h;
}

public void  topArea(){
    topArea=l*w;
}

public void  bottomArea(){
bottomArea=l*w;

}

public void  leftArea(){
    leftArea=h*w;

}

public void  rightArea(){
    rightArea=h*w;

}

public void  frontArea(){
    frontArea=h*l;

}

public void  backArea(){
    backArea=h*l;

}

public void  area(){
    area= 2*(l*w+h*w+h*l);

}



public static void main(String args[]) {
    

    Scanner c = new Scanner(System.in);
    System.out.print("Enter l ");
    int l = c.nextInt();

    Scanner d = new Scanner(System.in);
    System.out.print("Enter w ");
    int w = d.nextInt();

    Scanner e = new Scanner(System.in);
    System.out.print("Enter h ");
    int h = e.nextInt();

    prism obj = new prism();
    obj.setPrism(l, w, h);

    obj.backArea();
    obj.bottomArea();
    obj.frontArea();
    obj.leftArea();
    obj.rightArea();
    obj.topArea();
    obj.area();

    System.out.println("name of backArea " + obj.backArea);
    System.out.println("name of bottomArea " + obj.bottomArea);
    System.out.println("name of frontArea " + obj.frontArea);
    System.out.println("name of leftArea " + obj.leftArea);
    System.out.println("name of rightArea " + obj.rightArea);
    System.out.println("name of topArea " + obj.topArea);
    System.out.println("name of area " + obj.area);

}

    
}