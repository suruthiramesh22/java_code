
import java.util.Scanner;

public class sum_of_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sum=0;
        int r_size;
        int c_size;
        System.out.println("enter a no of row:");
        r_size=sc.nextInt();
        System.out.println("enter a no of coloum:");
        c_size=sc.nextInt();
        
        int array1[] []=new int[r_size][c_size];
        for(int i=0;i<r_size;i++)
        {
            for(int j=0;j<c_size;j++)
            {
                array1[i][j]=sc.nextInt();
                sum=sum+array1[i][j];

            }
        }

        for(int i=0;i<r_size;i++)
        {
            for(int j=0;j<c_size;j++)
            {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("sum of all element in the array="+sum);
    }
    
}
