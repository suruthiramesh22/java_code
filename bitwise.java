import java.util.Scanner;

public class bitwise {

     public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        int  b=sc.nextInt();

         //bitwise
         System.out.println("bitwise");
         System.out.println(a&b);
         System.out.println(a|b);
         System.out.println(~b);
         System.out.println(a^b);
         System.out.println(b<<1);
         System.out.println(a>>2);
     }
    
}
