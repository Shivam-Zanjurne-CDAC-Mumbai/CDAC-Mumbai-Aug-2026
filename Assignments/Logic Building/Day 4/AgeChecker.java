import java.util.Scanner;

public class AgeChecker {
    static void checkAgeCategory(int age){
        if (age >= 60){
            System.out.println("You are a Senior");
        }
        else if(age >= 18){
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("You are a Minor");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        byte age = sc.nextByte();

        checkAgeCategory(age);

    }
}
