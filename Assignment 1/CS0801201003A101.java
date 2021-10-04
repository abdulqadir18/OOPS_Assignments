
import java.lang.*;
public class CS0801201003A101
 {


        //method for task
        static void task(double n)
        {
            int i,j,flag=0;
            double sum=0;
            for(i=2;i<=n;i++)
            {
                for(j=2;j<=(i/2);j++)
                {
                    if(i%j==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    sum+= Math.log(i);
                }
            }
            System.out.println(sum);
            System.out.println(n);
            System.out.println(sum/n);

        }
        public static void main (String args[]){
            task(11);
        }

    }
