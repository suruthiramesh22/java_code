import java.util.Scanner;

public class logical {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        int  b=sc.nextInt();

        System.out.println("logical operator");
        if((a%3==0) && (a%5==0))
        {
            System.out.println("a is divisible by 3 and 5"); 
        }
        else if((b%3==0)||(b%5==0))
        {
            System.out.println("b is divisible by 3 and 5"); 
        }
        else
        {
            System.out.println("a and b are not divisible by 3 and 5"); 
        }
    
}
}