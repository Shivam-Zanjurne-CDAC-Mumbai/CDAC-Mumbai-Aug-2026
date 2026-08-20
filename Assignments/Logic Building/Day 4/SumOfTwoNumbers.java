import java.util.Scanner;

public class SumOfTwoNumbers {
    
    int sumOfTwoNumbers(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int result;
        System.out.println("Enter first number: ");
        a = scanner.nextInt();
        System.out.println("Enter second number: ");
        b = scanner.nextInt();

        SumOfTwoNumbers obj = new SumOfTwoNumbers();

        result = obj.sumOfTwoNumbers(a, b);

        System.out.println("Sum of " + a + " and " + b + " is " + result);

    }
}
