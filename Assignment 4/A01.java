import java.util.Scanner;

class special{
    int n;
    int last_digit;
    special(){
        n = 0;
    }
    special(int a){
        n = a;
        while(a>10){
            a/=10;
        }
        last_digit =a;
        System.out.println("Last digit = "+ last_digit);
    }

    void sum(){
        System.out.println("Sum of first and last digit => "+ ((n%10)+last_digit));
    }
    int factorial(int a){
        if(a==1){return 1;}
        return a * factorial(a-1);
    }
    void isSpecial(){
        int special=0;
        for(int i=n, temp; i>0;i/=10){
            temp= i%10;
            special += factorial(temp);
        }
        if(special == n){
            System.out.println("The number "+n+" is a special number");
        }
        else{
            System.out.println("The number "+n+" is not a special number");
        }
    }
}
public class A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        special s1 = new special(n);
        s1.sum();
        s1.isSpecial();
    }
}
