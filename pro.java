import java.util.Scanner;

class Pro {
    String pcode;
    String name;
    Double price;

    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);

        // Creating variables to store details of the product with the lowest price
        String lowestPricePcode = "";
        String lowestPriceName = "";
        Double lowestPrice = Double.MAX_VALUE; // Initializing with maximum possible value

        int numberOfProducts;
        System.out.println("Enter the number of products:");
        numberOfProducts = s.nextInt();

        for (int i = 0; i < numberOfProducts; i++) {
            // Getting input for each product
            System.out.println("Enter product code:");
            String pcode = s.next();
            System.out.println("Enter product name:");
            String name = s.next();
            System.out.println("Enter price:");
            Double price = s.nextDouble();

            // Checking if the current product has the lowest price
            if (price < lowestPrice) {
                lowestPricePcode = pcode;
                lowestPriceName = name;
                lowestPrice = price;
            }
        }

        // Displaying the product with the lowest price
        System.out.println("\nProduct with the lowest price:");
        System.out.println("Product Code: " + lowestPricePcode);
        System.out.println("Product Name: " + lowestPriceName);
        System.out.println("Price: " + lowestPrice);

        s.close();
    }
}
