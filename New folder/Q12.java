import Graphics.*;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n---Find area...!---\n1.Rectangle\n2.Triangle\n3.Square\n4.Circle\n5.Exit\nEnter choice\n");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    Rectangle r = new Rectangle();
                    System.out.println("Enter Length");
                    int l = s.nextInt();
                    System.out.println("Enter Breadth");
                    int b = s.nextInt();
                    r.area(l, b);
                    break;
                case 2:
                    Triangle t = new Triangle();
                    System.out.println("Enter Base");
                    int base = s.nextInt();
                    System.out.println("Enter Height");
                    int height = s.nextInt();
                    t.area(base, height);
                    break;
                case 3:
                    Square sq = new Square();
                    System.out.println("Enter Side");
                    int side = s.nextInt();
                    sq.area(side);
                    break;
                case 4:
                    Circle c = new Circle();
                    System.out.println("Enter Radius");
                    int radius = s.nextInt();
                    c.area(radius);
                    break;
                case 5:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (ch != 5);
    }
}