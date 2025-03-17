import java.util.Scanner;

public class assending_desending_order {
    
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
         for (int i = 0; i < size- 1; i++) {
            for (int j = i + 1; j < size; j++) {
            if (array[i] > array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            }
        }
    }
    System.out.println("ascending order");
        for(int i=0;i<size;i++)
         {
            System.out.print(array[i]+"  ");
         }
    }
}
