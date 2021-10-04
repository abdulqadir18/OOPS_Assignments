import java.util.Scanner;

public class  CS0801201003A106{

public static int a(int x)
{

int num=1,count=0,i;

while(count<x)
{

num=num+1;

for(i=2; i<=num; i++)
{

if (num%i==0)

{

break;

}

}

if(i==num)
{

count=count+1;

}

}

return num;

}

public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter The value of n:");

int n=sc.nextInt();

System.out.println("Enter  The value of k:");

int k=sc.nextInt();

int c=n+k;

int a=a(n);

int b=a(c);

System.out.println("The nth prime number is:" +a);

System.out.println("The n+k prime number is:" +b);

int diff = b-a;

System.out.println("difference="+diff);

}

}
