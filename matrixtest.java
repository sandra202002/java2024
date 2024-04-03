import java.util.Scanner;

class Matrix {
    int r, c;
    int[][] mat = new int[20][20];

    void read() {
        int i, j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        r = scan.nextInt();
        c = scan.nextInt();
        System.out.println("Enter the elements:");
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                mat[i][j] = scan.nextInt();
            }
        }
    }

    void display() {
        int i, j;
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                System.out        .print(mat[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}

class MatrixTest {
    public static Matrix add(Matrix a, Matrix b) {
        int i, j;
        Matrix m = new Matrix();
        m.r = a.r;
        m.c = a.c;
        for (i = 1; i <= a.r; i++) {
            for (j = 1; j <= a.c; j++) {
                m.mat[i][j] = a.mat[i][j] + b.mat[i][j];
            }
        }
        return m;
    }

    public static void main(String arg[]) {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        m1.read();
        m2.read();
        System.out.println("First matrix");
        m1.display();
        System.out.println("Second matrix");
        m2.display();

        if (m1.r == m2.r && m1.c == m2.c) {
            Matrix m = new Matrix();
            System.out.println("Resultant matrix");
            m = add(m1, m2);
            m.display();
        } else {
            System.out.println("Matrix addition not possible");
        }
    }
}
