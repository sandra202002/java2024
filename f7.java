import java.util.Scanner;
class f7{
public static void main(String a[]){

Scanner s=new Scanner(System.in);
System.out.println("next() & nextLine() is used for input\n");
String name=s.nextLine();
String n=s.next();
System.out.println("nextInt() is used for integer");
int t=s.nextInt();
System.out.println("nextDouble() is used for double point values ");
double d=s.nextDouble();
System.out.println("nextFloat() is used for floating point values ");
double f=s.nextFloat();
System.out.println("first word entered is"+n);
System.out.println("sentence is "+name);
System.out.println("integer value is"+t);
System.out.println("float value is"+f);
System.out.println("double value is"+d);
s.close();

}
}
