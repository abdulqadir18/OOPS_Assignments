import java.util.Scanner;

class Emirp{
    int n, rev, f;
    Emirp(int nn){
        n = nn;
        f=2;
        while(nn>0){
            rev=rev*10 + nn%10;
            nn/=10;
        }
    }
    int isprime(int x ,int c){
        if(x%c==0){
            return 0;
        }
        else if(c>=Math.pow(x,.5)){
            return 1;
        }
        else{
            return isprime(x, c+1);
        }
    }
    void isEmirp(){
        System.out.println("Original Numbaer: "+n);
        System.out.println("Reverse Numbaer: "+rev);
        if(isprime(n,2)==1 && isprime(rev,2)==1){
            System.out.println("\nThe number "+n+" is a Emirp Number");
        }
        else{
            System.out.println("\nThe number "+n+" is not a Emirp Number");
        }
    }
}
public class A04 {
    public static void main(String[] args) {
        System.out.print("Enter a number -> ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Emirp n = new Emirp(a);
        n.isEmirp();
    }
}
