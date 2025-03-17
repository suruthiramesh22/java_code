import java.util.Random;

public class randomgame {
    public static void main(String[] args) {
        Random rand = new Random();
        int num;

        do {
            num = rand.nextInt(10) +1 ; // Generates a number between 1 and 10

            if (num % 4 == 0)
                continue;
            System.out.println("Generated: " + num);
        } while (num != 5); // Stops when 5 is generated

        System.out.println("Terminated as 5 appeared!");
    }
}
