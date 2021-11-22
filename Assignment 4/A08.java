import java.util.Scanner;

class Change{
    String str, newstr;
    int len;
    Change(){
        newstr="";
        str="";
    }
    void intputword(){
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        len = str.length();
    }
    char caseconvert(char ch){
        if(ch==Character.toUpperCase(ch)){
            return Character.toLowerCase(ch);
        }
        else{
            return Character.toUpperCase(ch);
        }
    }
    void recchange(int a){
        if(a>=len){
            return;
        }
        newstr += caseconvert(str.charAt(a));
        recchange(a+1);
    }
    void display(){
        System.out.println("Orgiginal String:  "+str);
        System.out.println("New String:  "+newstr);
    }
}
public class A08 {
    public static void main(String[] args) {
        Change c = new Change();
        c.intputword();
        c.recchange(0);
        c.display();
    }
}
