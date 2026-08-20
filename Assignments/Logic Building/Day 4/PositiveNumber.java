import java.util.Scanner;

public class PositiveNumber {
    void askForPositiveNumber(){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter your number: ");
            n = sc.nextInt();
            if (n > 0){
                System.out.println("Your Positive Number Is : " + n);
            }
        }while(n <= 0);
    }
    public static void main(String[] args) {
        PositiveNumber obj1 = new PositiveNumber();
        
        obj1.askForPositiveNumber();
    }
}
