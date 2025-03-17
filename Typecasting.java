public class Typecasting {
    public static void main(String[] args) {
        //implicite
System.out.println("int to float");
    int a=5;
    System.out.println(a);
    float b=a;
    System.out.println(b);

System.out.println("byte to short");

    byte c=127;
    System.out.println(c);
    short d=c;
    System.out.println(d);

System.out.println("short to int");

    short e=17;
    System.out.println(e);
    int f=e;
    System.out.println(f);

System.out.println("long to float");


    long i=1999999997;
    System.out.println(i);
    float j=i;
    System.out.println(j);

System.out.println("float to double");


    float g=13.3343f;
    System.out.println(g);
    double h=g;
    System.out.println(h);

 //ecplicite

 System.out.println("float to int");

float z=34.99f;
System.out.println(z);
int x=(int)z;
System.out.println(x);

System.out.println("double to int");

double p=34;
System.out.println(p);
int l=(int)p;
System.out.println(l);

System.out.println("short to byte");

short k=34;
System.out.println(k);
byte u=(byte)k;
System.out.println(u);

System.out.println("float to long");

float m=34.88f;
System.out.println(m);
long n=(long)m;
System.out.println(n);

}
}