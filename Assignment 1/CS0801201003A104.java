import java.util.Scanner;

public class CS0801201003A104
 {
   public static void main(String args[]){
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n :");
      n = sc.nextInt();
     
     for(int i=n;;i++)
     {
         if(task(i)){
             System.out.println(i);
             break;
         }
     }
   }
   
   public static boolean task(int num)
   {
       for(int i=2; i<num; i++)
       {
           if(num%i==0)
            return false;
       }
       
       if(num/10!=0)
        return task(num/10);
       else
        return true;
   }
}