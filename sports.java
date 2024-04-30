/*10.2 Create classes Student and Sports. Create another class Result inherited from Student and Sports. Display
the Academic and Sports score of a student*/
import java.util.Scanner;
class Student{
    int rollno;
    String name;
    String dep;
    int[] mark=new int[5];
    String[] sub={"Maths ","English ","Physics  ","Chemistry","Computer "};
}
interface sport{
   int sportsmark=8;
}
class Result extends Student implements sport{
    int totalmark=0;
    void totalmark()
    {
        for(int i=0;i<5;i++)
        {
            totalmark=totalmark+mark[i];
        }
        totalmark=totalmark+sportsmark;
    }
    void display()
    {
        totalmark();
        System.out.println("\n********Score Card********\n");
        System.out.println("Name         : "+name);
        System.out.println("Roll No.     : "+rollno);
        System.out.println("\n-------Mark List-------\n");
        for (int i=0;i<5;++i)
        {
            System.out.println(sub[i]+ "    : "+mark[i]);
        }
        System.out.println("Sports Mark  : "+sportsmark);
        System.out.println("\nTotal Marks  : "+totalmark);
    }
}
class sports
{
    public static void main(String args[])
    {
        Result r=new Result();

        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Name");
        r.name=s.nextLine();
        System.out.println("Enter Roll No.");
        r.rollno=s.nextInt();
        System.out.println("Enter Marks of 5 subject");
        
        for (int i=0;i<5;++i)
        {
            System.out.println(r.sub[i]);
            r.mark[i]=s.nextInt();
        }
        r.display();
    }
}