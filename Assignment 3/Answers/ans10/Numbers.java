
import java.util.*;

class Numbers {
    int n;
    int fact = 1;

    public void factorial(int n) {
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
    }

    public void display() {
        System.out.println("Factorial  is: " + fact);
    }

}

class Series extends Numbers {
    int sum = 0;

    public Series(int isum) {

        sum = isum;
    }

    public void calsum() {
        for (int i = 0; i < n; i++) {
            sum =sum+ i;
        }
    }

    public void displaySum() {
        System.out.println("sum of series  is: " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int a = sc.nextInt();
        Numbers num = new Numbers();
        Series obj = new Series(a);
        

        num.factorial(a);
        obj.calsum();
        obj.displaySum();

    }

}

   
 
   
    




