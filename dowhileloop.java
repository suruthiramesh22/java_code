import java.util.Scanner;
public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        String b="exit";
        do{
            System.out.println("Enter a positive number:");
            num = sc.nextLine();

        }while(num==b);
        {
            System.out.println("thank you");
        }
    }
}