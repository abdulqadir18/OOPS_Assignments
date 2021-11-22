import java.util.*;
public class creditCard {

protected String name;
protected String cardNo;
protected Boolean enabled;
protected double pin;
protected String expiryMonth;
protected double cardType; 

double currentCredit;
double creditLimit;




public creditCard(String name,String cardNo,Boolean enabled,int pin,String expiryMonth,int cardType,int currentCredit,int creditLimit){
    this.cardNo=cardNo;
    this.cardType=cardType;
    this.creditLimit=creditLimit;
    this.currentCredit=currentCredit;
    this.enabled=enabled;
    this.expiryMonth=expiryMonth;
    this.name=name;
    this.pin=pin;

}
private void changePin(int newPin){
this.pin=newPin;

}
public void transact(int amt,int cpin){
    if(cpin==pin && enabled==true  && amt<=creditLimit){
        if(cardType==1){
            this.currentCredit=currentCredit-amt+(amt*0.03);
        }
        if(cardType==2){
            this.currentCredit=currentCredit-amt+(amt*0.02);
        }
        if(cardType==3){
            this.currentCredit=currentCredit-amt+(amt*0.01);
        }
        
    }

}
private void changeCardStatus(boolean status){
this.enabled=status;

}

public void display(){
    System.out.println("name of cardNo " + cardNo);
    System.out.println("name of cardType " + cardType);
    System.out.println("name of creditLimit " + creditLimit);
    System.out.println("name of currentCredit " + currentCredit);
    System.out.println("name of enable status " + enabled);
    System.out.println("name of expiry month " + expiryMonth);
    System.out.println("name of name " + name);
    System.out.println("name of pin " + pin);

}


public static void main(String args[]) {
    Scanner a = new Scanner(System.in);
    System.out.print("Enter name ");
    String name = a.nextLine();

    Scanner z = new Scanner(System.in);
    System.out.print("Enter enabled ");
    Boolean enabled = z.nextBoolean();

    Scanner j = new Scanner(System.in);
    System.out.print("Enter cardNo ");
    String cardNo = j.nextLine();

    Scanner k = new Scanner(System.in);
    System.out.print("Enter expiryMonth ");
    String expiryMonth = k.nextLine();

    Scanner l = new Scanner(System.in);
    System.out.print("Enter pin ");
    Double pin = l.nextDouble();

    Scanner c = new Scanner(System.in);
    System.out.print("Enter cardType ");
    Double cardType = c.nextDouble();

    Scanner d = new Scanner(System.in);
    System.out.print("Enter currentCredit ");
    Double currentCredit = d.nextDouble();

    Scanner e = new Scanner(System.in);
    System.out.print("Enter creditLimit ");
    Double creditLimit = e.nextDouble();

    creditCard obj = new creditCard(name,cardNo,enabled,pin,expiryMonth,cardType,currentCredit,creditLimit);
    
}

}


    
