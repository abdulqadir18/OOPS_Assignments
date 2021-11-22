import java.util.*;
public class stock {
    String item;
    int qt;
    int rate;
    int amt;
    int stockValue;
    public stock(String item,int qt,int rate,int amt){
        this.amt=amt;
        this.item=item;
        this.qt=qt;
        this.rate=rate;

    }

    public void displayPStats(){
        System.out.println("item " + this.item );
        System.out.println("qt " + this.qt );
        System.out.println("rate " + this.rate );
        System.out.println("amt " + this.amt );
        System.out.println("stock value " + this.qt*this.rate );
    }
    
}

class purchase extends stock{
    int pqty;
    int prate;
    
    public purchase(String item, int qt, int rate, int amt,int pqty,int prate) {
        super(item, qt, rate, amt);
        this.pqty=pqty;
        this.prate=prate;
        
    }

    public void update(){
        super.qt=this.pqty+super.qt;
        super.rate=this.prate;
        super.stockValue=super.qt*super.rate;
        
    }


    public void displaycStats(){
        System.out.println("item " + super.item );
        System.out.println("qt " + super.qt );
        System.out.println("rate " + super.rate );
        System.out.println("amt " + super.amt );
        System.out.println("stock value " + super.qt*super.rate );
    }


    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter item ");
        String item = a.nextLine();

        Scanner b = new Scanner(System.in);
        System.out.print("Enter qt ");
        int qt = b.nextInt();

        Scanner c = new Scanner(System.in);
        System.out.print("Enter rate ");
        int rate = c.nextInt();

        Scanner d = new Scanner(System.in);
        System.out.print("Enter amt ");
        int amt = d.nextInt();

        Scanner e = new Scanner(System.in);
        System.out.print("Enter pqty ");
        int pqty = e.nextInt();

        Scanner f = new Scanner(System.in);
        System.out.print("Enter prate ");
        int prate = f.nextInt();

        purchase obj = new purchase(item,qt,rate,amt,pqty,prate);
        obj.displayPStats();
        obj.update();
        obj.displaycStats();


    }
    
}