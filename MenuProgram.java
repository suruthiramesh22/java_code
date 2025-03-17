import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Menu:");
            System.out.println("Option 1");
            System.out.println("Option 2");
            System.out.println("Option 3");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");

        do {
            
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    System.out.println("You selected Option 3");
                    break;
                case 4:
                    System.out.println("exiting program");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);

        
    }
}
