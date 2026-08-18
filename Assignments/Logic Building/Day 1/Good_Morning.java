import java.util.Scanner;

public class Good_Morning {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your time:");
        byte Time = scanner.nextByte();

        if (Time >= 5 && Time < 12){
            System.out.println("Good Morning!");
        }
        
    }
}
