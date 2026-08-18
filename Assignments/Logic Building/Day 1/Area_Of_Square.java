import java.util.Scanner;

public class Area_Of_Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Side Of Square: ");
        int Side = scanner.nextInt();
        int Area = Side * Side;
        System.out.println("Area Of Square : " + Area);
    }
}
