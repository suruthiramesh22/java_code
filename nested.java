import java.util.Scanner;

public class nested {

     public static void main(String var[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        if(year%4==0 && year %100!=0)
        {
            System.out.println("it is leap year");
            if(year%400 ==0)
            {
                System.out.println("it is leap year");
            }
        }
        else 
        {
            System.out.println("not a leap year");
        }
    
}
}
