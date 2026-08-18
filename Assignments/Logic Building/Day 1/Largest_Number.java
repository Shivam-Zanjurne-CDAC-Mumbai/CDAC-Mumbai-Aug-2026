import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First No: ");
        int N1 = scanner.nextInt();

        System.out.println("Enter Second No: ");
        int N2 = scanner.nextInt();

        System.out.println("Enter Third No: ");
        int N3 = scanner.nextInt();

        if (N1 > N2){
            if (N1 > N3){
                System.out.println("First is the largest number");
            }
            else if(N3 > N2){
                System.out.println("Third is the largest number");
            }
        }
        else if(N2 > N3){
        
            System.out.println("Second is the largest number");
        }
        else if(N3 > N1){
            System.out.println("Third is the largest number");
        }
        else{
            System.out.println("All numbers are equal");
        }
        
    }
}
