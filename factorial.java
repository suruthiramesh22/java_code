
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int i=1;
      do { 
        fact=fact*i;
        i++;
          
      } while (i<=5);
        System.out.println(fact);
    }
    
}
