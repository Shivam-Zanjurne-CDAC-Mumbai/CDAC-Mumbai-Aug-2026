import java.util.Scanner;

public class MenuDriven {

    static void Days_Of_Week(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your day:");
        byte day = scanner.nextByte();
    
        switch (day){
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thrusday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Invalid Day");    
        }
    }
    static void Leap_Year(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year: ");
        int Year = scanner.nextInt();
        
        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)){
            System.out.println(Year + " is a Leap Year");
        }
        else{
            System.out.println(Year + " is not a Leap Year");
        }
    }
    static void Grade_Eval(){
        int Math_Marks = 98;
        int Science_Marks = 90;
        int History_Marks = 88;

        float Average_Marks = (Math_Marks+Science_Marks+History_Marks)/3;
        System.out.println("Average_Marks: " + Average_Marks);

        if (Average_Marks >= 90){
            System.out.println("Grade A");
        }
        else if(Average_Marks >= 70 && Average_Marks < 90){
            System.out.println("Grade B");
        }
        else if(Average_Marks >= 50 && Average_Marks < 70){
            System.out.println("Grade C");
        }
        else if(Average_Marks >= 30 && Average_Marks < 50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }

    //Part Of Default Values Program
    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;

    public static void main(String[] args) {
        boolean flag = true;

        while(flag){
            System.out.println("-----Java Choice Menu--------");
            System.out.println("1.Grade Evaluation System");
            System.out.println("2.Leap Year");
            System.out.println("3.Day Of Week");
            System.out.println("4.Default Values");
            System.out.println("5.Exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-------Grade Evaluation System------------");
                    Grade_Eval();
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("----------Leap Year-----------");
                    Leap_Year();
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("-------Day Of Week-----------");
                    Days_Of_Week();
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("-------Default Values-----------");
                    System.out.println("default value of a : " + a);
                    System.out.println("default value of b : " + b);
                    System.out.println("default value of c : " + c);
                    System.out.println("default value of d : " + d);
                    System.out.println("default value of e : " + e);
                    System.out.println("default value of f : " + f);
                    System.out.println("default value of g : " + g);
                    System.out.println("default value of h : " + h);
                    System.out.println();
                    System.out.println();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Terminated!");
                    System.out.println();
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }
    }
}
