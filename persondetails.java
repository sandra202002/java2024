/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class
‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification,
Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and contain constructors and methods to display the data members. Use array of objects to
display details of N teachers. */
import java.util.Scanner;
class Person
{
    String name;
    String gender;
    String address;
    int age;
    Person(String name,String gender,String address,int age)
    {
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}
class Employee extends Person
{
    int empid;
    String c_name;
    String qualification;
    int salary;
    Employee(String name,String gender,String address,int age,int empid,String c_name,String qualification,int salary)
    { 
        super(name,gender,address,age);
        this.empid=empid;
        this.c_name=c_name;
        this.qualification=qualification;
        this.salary=salary;
    }
}
class Teacher extends Employee
{
    String subject;
    String dep;
    int id;
    Teacher(String name, String gender, String address, int age, int empid, String c_name, String qualification,int salary,String subject,String dep,int id)
    {
        super(name,gender,address,age,empid,c_name,qualification,salary);
        this.subject=subject;
        this.dep=dep;
        this.id=id;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + c_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + dep);
        System.out.println("Teacher ID: " + id);
    }
}

public class persondetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Consume newline
            System.out.println("Enter details for Teacher " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Employee ID: ");
            int empid = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            System.out.print("Company Name: ");
            String c_name = scanner.nextLine();

            System.out.print("Qualification: ");
            String qualification = scanner.nextLine();

            System.out.print("Salary: ");
            int salary = scanner.nextInt();

            scanner.nextLine(); 

            System.out.print("Subject: ");
            String subject = scanner.nextLine();

            System.out.print("Department: ");
            String dep = scanner.nextLine();

            System.out.print("Teacher ID: ");
            int id = scanner.nextInt();

            teachers[i] = new Teacher(name, gender, address, age, empid, c_name, qualification, salary, subject, dep,id);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Teacher " + (i + 1) + ":");
            teachers[i].displayDetails();
        }
    }
}

