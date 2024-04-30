import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double esalary;

    Employee(int eno, String ename, double esalary) {
        this.eno = eno;
        this.ename = ename;
        this.esalary = esalary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.println("**********************************");
            System.out.print("Employee Number: ");
            int eNo = scanner.nextInt();
            System.out.print("Employee Name: ");
            String eName = scanner.next();
            System.out.print("Employee Salary: ");
            double eSalary = scanner.nextDouble();

            employees[i] = new Employee(eNo, eName, eSalary);
        }
        System.out.println("**********************************");
        System.out.print("Enter the employee number to search: ");
        int searchEno = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < employees.length; i++) 
        {
            if (employees[i].eno == searchEno)
            {
            System.out.println("Employee found!");
            System.out.println("Employee Number: " + employees[i].eno);
            System.out.println("Employee Name: " + employees[i].ename);
            System.out.println("Employee Salary: " + employees[i].esalary);
            found = true;
            break;
            }
        }

        if (!found) {
            System.out.println("Employee with eNo " + searchEno + " not found.");
        }
        
    }
}
