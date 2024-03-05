import java.util.Scanner;
public class Product {
    public static void main(String args[]) {
        Comp c1 = new Comp();
        Comp c2 = new Comp();
        Comp c3 = new Comp();
        c1.insert();
        c2.insert();
        c3.insert();
        int pr = c1.getPrice();
        int po = c2.getPrice();
        int pd = c3.getPrice();

        if (pr < po && pr < pd) {
            c1.display();
        } else if (po < pd) {
            c2.display();
        } else {
            c3.display();
        }
    }
}

class Comp {
    Scanner s = new Scanner(System.in);
    int p;
    String n;
    int c;

    void insert() {
        System.out.println("Enter Product code");
        c = s.nextInt();
        s.nextLine();
        System.out.println("Enter Product name");
        n= s.nextLine();
        System.out.println("Enter Product Price");
        p = s.nextInt();

    }

    void display() {
        System.out.println("\nProduct details ");
        System.out.println("\nCode: " + c);
        System.out.println("\nName: " + n);
        System.out.println("\nPrice: " + p);
    }

    int getPrice() {
        return p;
    }
}