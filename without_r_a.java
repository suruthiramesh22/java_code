class Student{
    String name;
    int roll;
    float grade;
    int m1;
    int m2;

    void display()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(grade);
    }
    void  totalmarl(int m1,int m2)
    {
        int sum=m1+m2;
        System.out.println(sum);
    }

}
public class without_r_a {
    public static void main(String[] args) {
        Student s1=new Student();
        

        s1.name="suruthi";
        s1.roll=23;
        s1.grade=9.0f;
        s1.display();

       
        s1.totalmarl(90,80);
        
        
    }
    
}
