import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        int r_size=sc.nextInt();
        int c_size=sc.nextInt();
        int array[][]=new int[r_size][c_size];
        int transpose[][]=new int[c_size][r_size];
        for(int i=0;i<r_size;i++)
        {
            for(int j=0;j<c_size;j++)
            {
                array[i][j]=sc.nextInt();

            }
        }

        for(int i=0;i<r_size;i++)
        {
            for(int j=0;j<c_size;j++)
            {
                System.out.print(array[i][j]+" ");

            }
            System.out.println("");
        }

        for(int i=0;i<r_size;i++)
        {
            for(int j=0;j<c_size;j++)
            {
                transpose[j][i]=array[i][j];

            }
        }

        for(int i=0;i<c_size;i++)
        {
            for(int j=0;j<r_size;j++)
            {
                System.out.print(transpose[i][j]+"  ");

            }
            System.out.println("");
        }
        
    }
    
}
