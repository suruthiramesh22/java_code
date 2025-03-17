import java.util.Scanner;

public class if_else2 {
      public static void main(String var[])
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18)
        {
            System.out.println("not eligible for voting");
        }
        else{
            System.out.println("eligible for voting");
        }
    }
}

