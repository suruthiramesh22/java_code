
import java.util.Scanner;

class sum_of_all_element3D{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();//number matrix
        int y=sc.nextInt();//number of rows
        int z=sc.nextInt();//number of coloums
    
        int arr[][][] = new int[x][y][z]; 
        int totalSum = 0;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                for(int k=0;k<z;k++)
                {
                    arr[i][j][k]=sc.nextInt();
                    totalSum+=arr[i][j][k];
                }
            }

           
        }
        System.out.println(totalSum);
    }
}