import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a size of array:");
          int size;
          int sum=0;
          size=sc.nextInt();
          int array[]=new int[size];
          for(int i=0;i<size;i++)
          {
            array[i]=sc.nextInt();
            sum+=array[i];
          }
          System.out.println("sum of array ="+sum);
    }
    
}
