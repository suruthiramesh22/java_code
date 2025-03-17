import java.util.Scanner;

public class even_odd_arrays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int size;
         size=sc.nextInt();
         int array[]=new int[size];
         System.out.println("Enter an array:");
         for(int i=0;i<size;i++)
         {

            array[i]=sc.nextInt();
         }

         for(int i=0;i<size;i++)
         {
            if(array[i]%2==0)
            {
                System.out.println("Even number "+array[i]);
            }
            else{
                System.out.println("Odd number "+array[i]);
            }
         }

    }
}
