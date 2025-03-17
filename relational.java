import java.util.Scanner;

public class relational {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of a:");
         int a=sc.nextInt();
         System.out.println("Enter a value of b:");
        int  b=sc.nextInt();
    System.out.println("relational operator");
    if(a>b)
    {
        System.out.println("a is greater than b");
    }
          else if(a==b)
       {
        System.out.println("both are equale");
       }
       else
       {
        System.out.println("b is greater than a");
       }
    
}
}
