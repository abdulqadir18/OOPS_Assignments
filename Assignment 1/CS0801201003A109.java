import java.util.Scanner;


public class CS0801201003A109{


    public static int isPrime(int n) {

        int a= 1;
        if (n == 1) {
   
         return 0;

        }

        if (n == 2) {
   
         return 1;
 
       }
   
     for (int i = 2; i < n - 1; i++) {

            if (n % i == 0) {
 
              a = 0;

                break;
   
         }

        }
        return a;

    }
   
 public static void main(String[] args) {
  
      Scanner in = new Scanner(System.in);


        System.out.print("Enter a number: ");

        int n = in.nextInt();


        if (isPrime((int)Math.sqrt(n))==1) {
   
         System.out.print("The Number is T-Prime");
 
       }
      
  else{
   
         System.out.print("The Number is not T-Prime");

        }

    
    in.close();
   
 }

}
