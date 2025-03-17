
import java.util.Scanner;

public class frequency_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count;
        int size;
        size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++) 
        {
            array[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
        count=1;
        if(array[i] !=-1)
        {
            for(int j= i + 1;j<size;j++)
            {
                if(array[i]==array[j])
                {
                count ++;
                array[j]=-1;
                }
            }
            System.out.println(array[i]+"="+count+"times");
        }


        }
    }
}
    

