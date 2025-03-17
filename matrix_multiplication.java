
import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       
        int r_size;
        int c_size;
        System.out.println("enter a no of row:");
        r_size=sc.nextInt();
        System.out.println("enter a no of coloum:");
        c_size=sc.nextInt();

        System.out.println("Enter number of columns for second matrix:");
        int cols2 = sc.nextInt();

        int product[][]=new int[r_size][cols2];
        int array1[] []=new int[r_size][c_size];
        int array2[][] =new int[c_size][ cols2];
        System.out.println("first matrix");
        for(int i=0;i<r_size;i++)
        {
            for(int j=0;j<c_size;j++)
            {
                array1[i][j]=sc.nextInt();

            }
        }

        for(int i=0;i<r_size;i++)
        {
            for(int j=0;j<c_size;j++)
            {
                System.out.print(array1[i][j]+" ");

            }
            System.out.println("");
        }
        System.out.println("second matrix");

        for(int i=0;i<c_size;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                array2[i][j]=sc.nextInt();

            }
        }

        for(int i=0;i<c_size;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                System.out.print(array2[i][j]+"  ");

            }
            System.out.println("");
        }
        
        for (int i = 0; i < r_size; i++) {
            for (int j = 0; j < cols2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < c_size; k++) {
                    product[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        for(int i=0;i<r_size;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                System.out.print(product[i][j]+"  ");

            }
            System.out.println("");
        }
    


    }
    
}
