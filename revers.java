
import java.util.Scanner;

public class revers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n,rev=0;
        while(num!=0)
        {
            rev=rev*10;
            rev=rev+(num%10);
            num=num/10;          

        }
        System.out.println(rev);
 
    
}
}
