import java.util.Scanner;

class Disarium{
    int num,size;
    Disarium(int nn){
        num =nn;
        size=-1;        
    }
    void countDigit(){
        int temp =num;
        size=1;
        while(temp>10){
            temp/=10;
            size++;
        }
        System.out.println("Total number of digits: "+size);
    }
    double sumofDigit(int n, int p){
        if(n<10){return Math.pow(n,p);}
        return (Math.pow(n%10,p--))+sumofDigit(n/10,p);
    }
    void check(){
        double t = sumofDigit(num,size);
        if(size<0){
            System.out.println("Count the digits first");
            return;
        }
        if(num==t){
            System.out.println("The number "+num+" is a Disarium number");
        }
        else{
            System.out.println("The number "+num+" is not a Disarium number");
            System.out.println("Total sum came out is => "+t+" which is not equal to the given number");
        }
    }
}
public class A02 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Disarium s = new Disarium(n);
        s.countDigit();
        s.check();
    }
}
