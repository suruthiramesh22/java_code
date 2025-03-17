
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
       
        Scanner scan=new Scanner(System.in);
        int c=scan.nextInt();
        float a=scan.nextFloat();
        char d=scan.next().charAt(1);
        double s=scan.nextDouble();
        long z=scan.nextLong();
        short q=scan.nextShort();
      
       
        System.out.println("value  for c :"+c);
        System.out.println("value  for a :"+a);
        System.out.println("value  for d:"+d);
        System.out.println("value  for  s:"+s);
        System.out.println("value  for  z:"+z);
        System.out.println("value  for  g:"+q);

    }
    
}
