import java.util.Scanner;

public class revers_an_arrays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int size;
         size=sc.nextInt();
         int array1[] =new int[size];
     
         for(int i=0;i<size;i++)
         {
             array1[i]=sc.nextInt();
             
             
         }
         for(int i=size-1;i>=0;i--){
            System.out.println("revers of the given array....");
         System.out.print(array1[i]);
         }



    }
    
}
