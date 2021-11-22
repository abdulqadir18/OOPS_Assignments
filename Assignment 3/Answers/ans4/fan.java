import java.util.*;

public class fan {

    private String fanType;
    private  String manufacturer;
    private   String model;
    private    Boolean isOn;
    int speed[]={1,2,3,4,5};
    
    public int currentSpeed=speed[0];  
    public void setFan(String fanType,String manufacturer,String model, Boolean isOn){
            this.fanType=fanType;
            this.manufacturer=manufacturer;
            this.model=model;
            this.isOn=isOn;
            
    }

    public void getFan(){
        System.out.println(this.fanType );
        System.out.println(this.manufacturer );
        System.out.println(this.model );
        System.out.println(this.isOn );
        System.out.println(this.currentSpeed );
    }

    public void on(){
        if(this.isOn!=true){
            this.isOn=true;
        }
    }
    public void off(){
        if(this.isOn==true){
            this.isOn=false;
        }
    }

    public void speedUp(){
        
            if(currentSpeed==speed[0]){currentSpeed=speed[1];}
            if(currentSpeed==speed[1]){currentSpeed=speed[2];}
            if(currentSpeed==speed[2]){currentSpeed=speed[3];}
            if(currentSpeed==speed[3]){currentSpeed=speed[4];}
            if(currentSpeed==speed[4]){currentSpeed=speed[4];}
        
    }

    public void speedDown(){
            if(currentSpeed==speed[0]){currentSpeed=speed[0];}
            if(currentSpeed==speed[1]){currentSpeed=speed[0];}
            if(currentSpeed==speed[2]){currentSpeed=speed[1];}
            if(currentSpeed==speed[3]){currentSpeed=speed[2];}
            if(currentSpeed==speed[4]){currentSpeed=speed[3];}
    }

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter fantype ");
        String fanType = a.nextLine();

        Scanner b = new Scanner(System.in);
        System.out.print("Enter manufacturer ");
        String manufacturer = b.nextLine();

        Scanner c = new Scanner(System.in);
        System.out.print("Enter model ");
        String model = c.nextLine();

        Scanner d = new Scanner(System.in);
        System.out.print("Enter isOn ");
        boolean isOn = d.nextBoolean();

        fan obj = new fan();
        obj.setFan(fanType, manufacturer, model, isOn);
        obj.getFan();
    
    }

}