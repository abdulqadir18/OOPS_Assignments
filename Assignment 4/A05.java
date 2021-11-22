import java.util.Scanner;

class Happy{
    int n;
    Happy(){
        n = 0;
    }
    void getnum(int nn){
        n = nn;
    }
    int sum_sq_digits(int x){
        if(x<10){
            System.out.println("One digit number obtained after the whole calculation = "+x);
            return x;
        }
        int sum=0;
        while(x>0){
            sum += (x%10)*(x%10);
            x/=10;
        }
        return sum_sq_digits(sum);
    }
    void ishappy(){
        if(sum_sq_digits(n)==1){
            System.out.println("The number "+ n +" is a Happy Number :)");
        }
        else{
            System.out.println("The number "+ n +" is not a Happy Number :(");
        }
    }
}
public class A05 {
    public static void main(String[] args) {
        System.out.print("Enter a number to check if it is a Happy Number :)   -> ");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        Happy h = new Happy();
        h.getnum(a);
        h.ishappy();
    }
}
