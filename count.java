
import java.util.Scanner;
public class count
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int count=0;
        System.out.println("enter a number");
        int num=sc.nextInt();
        for (int temp = num; temp > 0; temp /= 10)
         {
            ans+=num%10;
            count++;
           
        }
      
    
        System.out.println("count="+count);
        System.out.println("count="+ans);
    }
}