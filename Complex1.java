/*class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imagSum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imagSum);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class complex {
    public static void main(String[] args) {
        // Define two complex numbers
        ComplexNumber num1 = new ComplexNumber(8, 3);
        ComplexNumber num2 = new ComplexNumber(1, 4);

        // Add two complex numbers
        ComplexNumber sum = num1.add(num2);

        // Display the sum
        System.out.print("Sum: ");
        sum.display();
    }
}
*/

import java.util.Scanner;

class Complex1 {
    double real;
    double imag;

    // Constructor
    Complex1(double r, double i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    Complex1 add(Complex1 c) {
        return new Complex1(real + c.real, imag + c.imag);
    }

    public static void main(String args[]) {
        Complex1 c1 = new Complex1(2.3, 3.4);
        Complex1 c2 = new Complex1(1.4, 2.3);

        Complex1 sum = c1.add(c2);
        System.out.printf("Sum = %.1f + %.1fi\n", sum.real, sum.imag);
    }
}