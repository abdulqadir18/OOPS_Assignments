import java.util.Scanner;

class BinaryConverter{
    int number;
    long binNumber=0;
    long convert(int n){
        if(n<2){
            binNumber =n;
            return 0;
        }
        else if(n==2){
            binNumber = 10;
            return 0;
        }
        else{
            convert(n/2);
        }
        binNumber = (binNumber*10)+(n%2);
        return binNumber;                       
      }
    BinaryConverter(int n){
        number = n;
        convert(n);
    }
    void display(){
        System.out.println("Decimal Number:  "+number);
        System.out.println("Binary Number:  "+binNumber);
    }
}
public class A03 {
    public static void main(String[] args) {
        System.out.print("Enter the the number to convert it into Binary: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        BinaryConverter n = new BinaryConverter(a);
        n.display();
    }
}
