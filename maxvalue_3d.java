
import java.util.Scanner;

public class maxvalue_3d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();//number matrix
        int y=sc.nextInt();//number of rows
        int z=sc.nextInt();//number of coloums
    
        int arr[][][] = new int[x][y][z]; 
        int maxvalue =Integer.MIN_VALUE;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                for(int k=0;k<z;k++)
                {
                    arr[i][j][k]=sc.nextInt();
                   arr[i][j][k]=sc.nextInt();
                    if(arr[i][j][k]>maxvalue)
                    {
                        maxvalue=arr[i][j][k];
                        
                    }
                }
            }   
        }
        System.out.println(maxvalue);
    }
    
}
