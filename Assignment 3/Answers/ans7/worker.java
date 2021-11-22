import java.util.*;
public class worker {
 String name;
 int basicPay;

 public worker(String name,int bp){
     this.name=name;
     basicPay=bp;
 }

 public void displayWorkerStats(){
    System.out.println("name of worker " + name+" and basic pay of worker "+basicPay );
 }
    
}

class wages extends worker{

    int hours;
    int ratePerHour;
    int totalWage;
    int overTime;

    public wages(String name, int bp,int hours,int ratePerHour) {
        super(name, bp);
        this.hours=hours;
        this.ratePerHour=ratePerHour;
        
    }

    public void overtime(){
        overTime=hours*ratePerHour;
    }

    public void finalStates(){
        totalWage=overTime+super.basicPay;
        System.out.println("name of worker " + super.name+" and basic pay of worker "+super.basicPay+" overtime is "+this.overTime+" tatal wages are "+this.totalWage);

    }

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter name ");
        String name = a.nextLine();

        Scanner b = new Scanner(System.in);
        System.out.print("Enter basePay ");
        int basePay = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.print("Enter hours ");
        int hours = c.nextInt();

        Scanner d = new Scanner(System.in);
        System.out.print("Enter ratePerHour ");
        int ratePerHour = d.nextInt();

        wages obj = new wages(name,basePay,hours,ratePerHour);
        obj.overtime();
        obj.displayWorkerStats();
        obj.finalStates();
       

    }
    
}