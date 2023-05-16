import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------ Overloading Method ------");
        Vektor3 myVector = new Vektor3(1, 2, 3);
        Vektor3 anotherVector = new Vektor3(4, 5, 6);

        System.out.println("MyVector :");
        myVector.print();
        System.out.println("");

        System.out.println("Another Vector");
        anotherVector.print();

        System.out.print("\n\nMasukkan Scalar Number : ");
        int scalar = sc.nextInt();
        System.out.println("Multiply MyVector with scalar -> "+scalar);
        System.out.print("Result : ");
        myVector.multiply(scalar).print();
        System.out.println("");

        System.out.println("\nMultiply MyVector with Another Vector");
        myVector.print();
        System.out.print(" * ");
        anotherVector.print();
        System.out.println("");
        System.out.println("Result : "+myVector.multiply(anotherVector));
        sc.close();
    }
}
