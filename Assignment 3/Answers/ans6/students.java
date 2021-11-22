import java.util.*;
public class students {

    String name;
    String sex;
    int age;
    public void inpdetail(String name,String sex,int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
    }
   public void displayDetail(){
    System.out.println("name is " + name+" sex is "+sex+" age is "+age );
    }
}

class marks extends students{
    int regnum;
    int marks;
    String subject;

    public void inpdetails(int regnum, int marks,String subject){
            this.regnum=regnum;
            this.marks=marks;
            this.subject=subject;
    }

    public void show(){
        System.out.println("name is " + super.name+" sex is "+super.sex+" age is "+super.age );
        System.out.println("regnum is " + this.regnum+" subject is "+this.subject+" marks is "+this.marks );
    }


    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter name ");
        String name = a.nextLine();

        Scanner b = new Scanner(System.in);
        System.out.print("Enter sex ");
        String sex = b.nextLine();


        Scanner c = new Scanner(System.in);
        System.out.print("Enter subject ");
        String subject = c.nextLine();


        Scanner d = new Scanner(System.in);
        System.out.print("Enter regnum ");
        int regnum = d.nextInt();

        Scanner e = new Scanner(System.in);
        System.out.print("Enter age ");
        int age = e.nextInt();

        Scanner f = new Scanner(System.in);
        System.out.print("Enter marks ");
        int marks = f.nextInt();

        marks obj = new marks();
        students coo=new students();

        coo.inpdetail(name, sex, age);
        coo.displayDetail();
        
        obj.inpdetails(regnum, marks, subject);
        obj.show();
   
    }
}