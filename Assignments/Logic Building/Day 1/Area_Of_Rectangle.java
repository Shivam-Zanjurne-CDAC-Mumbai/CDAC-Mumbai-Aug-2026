import java.util.Scanner;

public class Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Width Of Rectangle: ");
        int Width = scanner.nextInt();
        System.out.println("Enter The Height Of Rectangle: ");
        int Height = scanner.nextInt();
        int Area = Width * Height;
        System.out.println("Area Of Rectangle : " + Area);
    }
}
