import java.util.Scanner;
class CS0801201003A201 {
    public static void main(String[] args) {
      //input n
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n :");
      n = sc.nextInt();
      
      int[][] a = new int[n][n];
      int count=1;
      int i,j,k;
      for(i=0;i<n;i++)
      {
          for(j=0;j<n;j++)
          {
              a[i][j]=count;
              count++;
          }
      }
      
      
      for(k=0; k<=(n-1)+(n-1); k++)
      {
          if(k%2!=0 || k==1)
          {
              for(i=0;i<n;i++)
              {
                  for(j=0;j<n;j++)
                  {
                      if(i+j==k)
                        System.out.println(a[i][j]+ "\n");
                  }
              }
          }
          
          if(k%2==0 || k==0)
          {
              for(i=n-1;i>=0;i--)
              {
                  for(j=n-1;j>=0;j--)
                  {
                      if(i+j==k)
                        System.out.println(a[i][j]+ "\n");
                  }
              }
          }
      }
    }
}