import java.util.Scanner;

public class continu_1 {
     public static void main(String var[])
    {
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<=20;i++)
        {
            if(i==5)
            {
            continue;
            }
            else{
                System.out.println(i);
            }
        }
    
}
}