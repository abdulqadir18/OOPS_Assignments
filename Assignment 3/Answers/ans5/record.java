import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;  
public class record {
    int n;
    String name[];
    int rnk[];
    public record(String[] name, int[] rnk){
        this.name=name;
        this.rnk=rnk;
    }

    public void displaList(){
        for(int i=0;i<rnk.length;i++){
            System.out.println("marks of " + name[i]+" has rank "+rnk[i] );
        }
    }
}

class rank extends record{

    public rank(String[] name, int[] rnk) {
        super(name, rnk);
        
    }

    int indexOfTopper=rnk.length-1;
    
    public void heigest(){
        for(int i=0;i<super.rnk.length;i++){
           if(rnk[i]<rnk[indexOfTopper]){
               indexOfTopper=i;
           }
        }
    }

    public void display(){
        System.out.println(" topper is " + name[indexOfTopper]+" has rank "+rnk[indexOfTopper] );
        for(int i=0;i<rnk.length;i++){
            System.out.println("marks of " + name[i]+" has rank "+rnk[i] );
        }
    }

    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the total number of student ");  
        int n=sc.nextInt();
        
        
        
      

        int[] array = new int[n];  
        System.out.print("Enter the number of name you want to store: ");   
        for(int i=0; i<n; i++)  
        {  
        array[i]=sc.nextInt();  
        } 
        
        

        String[] sar = new String[n];  
        System.out.print("Enter the name  you want to store: ");  
        for(int i=0; i<n; i++)  
        {   
        sar[i]=sc.nextLine();  
        } 

        rank obj = new rank(sar,array);
        obj.displaList();
        obj.display();
        
        
        

       

    }

}