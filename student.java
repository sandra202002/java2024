import java.util.Scanner;
class student{
public static void main(String a[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the name of the student:");
String name=s.next();
System.out.println("Department:");
String department=s.next();
System.out.println("Division:");
String division=s.next();
System.out.println("Rollno:");
int n=s.nextInt();
System.out.println("CGPA:");
float m=s.nextFloat();
System.out.println("NAME:"+name);

System.out.println("DEPARTMENT:"+department);
System.out.println("DIVISION:"+division);
System.out.println("Rollno:"+n);
System.out.println("CGPA:"+m);
s.close();
}
}