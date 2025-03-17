
import java.util.Scanner;

public class sum_of_two_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r_size;
        int c_size;
        System.out.println("enter a no of row:");
        r_size=sc.nextInt();
        System.out.println("enter a no of coloum:");
        c_size=sc.nextInt();
        int sum[][]=new int[r_size][c_size];
        int array1[] []=new int[r_size][c_size];
        int array2[][] =new int[r_size][ c_size];
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
                System.out.print(array1[i][j]);
                System.out.print(" ");

            }
            System.out.println();
           
        }
        
        

       System.out.println("second matrix");

        for(int k=0;k<r_size;k++)
        {
            for(int l=0;l<c_size;l++)
            {
                array2[k][l]=sc.nextInt();

            }
        }

        for(int k=0;k<r_size;k++)
        {
            for(int l=0;l<c_size;l++)
            {
                System.out.print(array2[k][l]);
               
                System.out.print(" ");

            }
            System.out.println();
      
        }

        
        
        for(int n=0;n<r_size;n++)
        {
            for(int m=0;m<c_size;m++)
            {
               sum[n][m]+=array1[n][m]+array2[n][m];

            }
            
        }
        System.out.println("sum of the two matrix is....");

        for(int n=0;n<r_size;n++)
        {
            for(int m=0;m<c_size;m++)
            {
               System.out.print(sum[n][m]); 
               System.out.print(" ");

            }
            System.out.println();
            
        }

        

    }
    
}
