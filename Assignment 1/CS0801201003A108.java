
class CS0801201003A108
{

  
static int countDigit (int a)
  
{
    int num = a, count = 0;
   
 while (num != 0)
     
 {


	int l = num % 10;


	  num /= 10;
	
if (l == 2 || l == 3 || l == 5 || l == 7)
	  
count++;
      }

  
  return count;
  }
 
 public static void main (String[]args)
  
{
    int a = 717;

   
 System.out.println (countDigit (a));

  
}

}
