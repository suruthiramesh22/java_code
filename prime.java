import java.util.Scanner;

public class prime 
{
     public static void main(String var[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(n<2)
        {
            System.out.println("Not prime");
        }
        for(int i=2;i<n;i++)
        {
            if (n % i == 0) 
            { 
            System.out.println("Not Prime");
            break;
            }
            else 
            {
                System.out.println("Prime");
                break;

            }      
       }
    }
 }