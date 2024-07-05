import graphics.*;
import java.util.Scanner;

public class Q12
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int ch;
        do{
            System.out.println("find area/n1.Rectangle/n2.circle/n3.exit");
            System.out.println("enter ch:");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    rectangle r=new rectangle();
                    System.out.println("l:");
                    int l=s.nextInt();
                    System.out.println("b:");
                    int b=s.nextInt();
                    r.area(l,b);
                    break;
                case 2:
                    circle c=new circle();
                    System.out.println("r:");
                    int radius=s.nextInt();
                    c.area(radius);
                    break;
                case 3:
                    System.out.println("exited");
                    break;
            }
    }while(ch!=3);

   }
}