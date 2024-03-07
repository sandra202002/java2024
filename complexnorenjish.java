import java.util.Scanner;
class compexnno
{
    Scanner s = new Scanner(System.in);
    double real;
    double img;

    compexnno()
    {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Enter the compelx number");
        System.out.println("Real part");
        real=s.nextDouble();
        System.out.println("imaginary part");
        img=s.nextDouble();
    }
    compexnno(double x,double y)
    {
        real=x;
        img=y;
    }
}
class Complex1
{
    
    public static void main(String a[])
    {
       
        line();
        compexnno no1 = new compexnno();
        line();
        compexnno no2 = new compexnno();
        compexnno sum;
        sum=add(no1,no2);
        line();
        System.out.println("SUM= "+sum.real+"+"+sum.img+"i");

    }
    public static compexnno add(compexnno no1,compexnno no2)
    {
        compexnno ans=new compexnno(0.0,0.0);
        ans.real=no1.real+no2.real;
        ans.img=no1.img+no2.img;

        return ans;
    }
    public static void line()
    {
         System.out.println("---------------------------------------------------------------------");
}
    
}
