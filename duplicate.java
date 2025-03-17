
import java.util.Scanner;

public class duplicate 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]==array[j])
                {
                    System.out.print(array[i]+" ");
                    break;
                }   
            }
        }
    }  
}
