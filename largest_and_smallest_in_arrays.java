import java.util.Scanner;

public class largest_and_smallest_in_arrays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int size;
         size=sc.nextInt();
         int array[]=new int[size];
         for(int i=0;i<size;i++)
         {
            array[i]=sc.nextInt();
         }
         int large=array[0],small=array[0];
         for(int i=0;i<size;i++)
         {
            if(array[i]>large)
            {
                large=array[i];
            }

            if(array[i]<small)
            {
                small=array[i];
            }

         }
         System.out.println("largests="+large);
         System.out.println("smallest="+small);


    }
    
}
