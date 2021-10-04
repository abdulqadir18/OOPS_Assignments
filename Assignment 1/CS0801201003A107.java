import java.util.Scanner;

public class CS0801201003A107 {

    static Boolean prime[] = new Boolean[100002];

    static void sieve() {
        prime[1] = prime[0] = false;
        for (int i = 2; i <= 100000; i++)
            prime[i] = true;
        for (int i = 2; i <= 1000; i++) {
            if (prime[i] == true) {
                for (int j = (i * i); j <= 100000; j += i) {
                    prime[j] = false;
                }
            }
        }

    }

    static void func(int dig[],int i,int n,int no_of_digits)
    {
        int j;
     if (i == n) {
         int number=0;
         for(j=0;j<no_of_digits;j++)number+=Math.pow(10,j)*dig[j];
        System.out.print(number+" is : ");
        if(prime[number]==true)System.out.println("Prime");
        else System.out.println("Not Prime");
     }
      else
      {
       for (j = i; j <= n; j++)
       {
          int temp=dig[j];dig[j]=dig[i];dig[i]=temp;          
          func(dig, i+1, n,no_of_digits);
           temp=dig[j];dig[j]=dig[i];dig[i]=temp; 
       }
      }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        sieve();

        // checking for permutations storing digits in an array;

        int dig[] = new int[7];

        int no_of_digits = 0;

        int temp = n;

        while (temp != 0) {
            dig[no_of_digits] = temp % 10;
            temp /= 10;
            no_of_digits++;
        }

        // checking all the permutations
        System.out.println("Checking all the permutations\n");
        func(dig,0,no_of_digits-1,no_of_digits);

        sc.close();
    }

}