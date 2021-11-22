import java.util.Scanner;

class Revstr{
    String str, Revst="";
    void getStr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.next();
    }
    void recReverse(int a){
        if(a<0){
            return;
        }
        Revst += str.charAt(a);
        recReverse(a-1);
    }
    void check(){
        recReverse(str.length()-1);
        System.out.println("Original String -> "+str);
        System.out.println("Reverse String -> "+Revst);
        if(Revst.equals(str)){
            System.out.println("Given string is a palindrome");
        }
        else{
            System.out.println("Given string not a palindrome");
        }
    }
}
public class A07 {
    public static void main(String[] args) {
        Revstr r = new Revstr();
        r.getStr();
        r.check();


    }
}
