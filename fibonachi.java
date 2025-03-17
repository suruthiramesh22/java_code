
import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int i,n;
        int t1=1,t2=1;
        int nexttearm=t1+t2;
        System.out.println("enter a number:");
        n=sc.nextInt();
        System.out.println(t1);
        System.out.println(t2);
        for(i=3; i<=n ;++i)
        {
            System.out.println(nexttearm);
            t1=t2;
            t2=nexttearm;
            nexttearm=t1+t2;
        }
    }
    
}
