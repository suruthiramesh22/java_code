import java.util.Scanner;
public class dowhileloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum=0;
        do{
            
            System.out.println("Enter a positive number:");
            num=sc.nextInt();
            sum=sum+num;

        }while(num>=0);
        {
            System.out.println("thank you");
        }
        System.out.println("sum of positive="+sum);
    }
}