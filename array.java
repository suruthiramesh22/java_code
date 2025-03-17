
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        int array1[] =new int[size];
    
        for(int i=0;i<size;i++)
        {
            array1[i]=sc.nextInt();
            
            
        }
        for(int i=0;i<size;i++){
        System.out.println("stored numbers are:"+array1[i]);
        }

    }
    
}
