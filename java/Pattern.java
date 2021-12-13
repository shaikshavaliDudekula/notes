import java.util.Scanner;

class Pattern
{
    public static void pattern1( int a)
    {
        
        for(int i=1;i<=a;i++)
        {
            for(int j=a-1;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
            System.out.println();
        }
        for(int i=1;i<a;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int k=a-i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
            System.out.println();
            
        }

    }
    
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

       pattern1(a);
   
    }
}