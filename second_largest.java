import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int size;
         size=sc.nextInt();
         int array[]=new int[size];
         for(int i=0;i<size;i++)
         {
            array[i]=sc.nextInt();
         }
         int large=array[0],small=array[0];
         int second_largest=-1,second_small=-1;
         for(int i=0;i<size;i++)
         {
            if(array[i]>large)
            {
                second_largest = large;
                large = array[i];
            }
            else if(array[i]>second_largest && array[i]!=large)
            {
                second_largest=array[i];
            }
            

            if(array[i]<small)
            {
                second_small = small;
                small = array[i];
            }
            else if(array[i]<second_small && array[i]!=small)
            {
                second_small=array[i];
            }

         }
         System.out.println("second largest number:"+second_largest);
         System.out.println("second smallest number:"+second_small);

    }
    
}
