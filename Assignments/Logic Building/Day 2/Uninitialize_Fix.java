//We can either declare the variables as static or keep them as instance variables and call them my creating an object

//----------------------------Using Static-------------------------------------
public class Uninitialize_Fix {
    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;

    public static void main(String[] args) {
        System.out.println("default value of a : " + a);
        System.out.println("default value of b : " + b);
        System.out.println("default value of c : " + c);
        System.out.println("default value of d : " + d);
        System.out.println("default value of e : " + e);
        System.out.println("default value of f : " + f);
        System.out.println("default value of g : " + g);
        System.out.println("default value of h : " + h);
    }
}

//----------------------------Using Instance Variable-------------------------------------
// public class Uninitialize_Fix {
//     byte a;
//     short b;
//     int c;
//     long d;
//     float e;
//     double f;
//     char g;
//     boolean h;
//     public void display(){
//         System.out.println("default value of a : " + a);
//         System.out.println("default value of b : " + b);
//         System.out.println("default value of c : " + c);
//         System.out.println("default value of d : " + d);
//         System.out.println("default value of e : " + e);
//         System.out.println("default value of f : " + f);
//         System.out.println("default value of g : " + g);
//         System.out.println("default value of h : " + h);
//     }
//     public static void main(String[] args) {
//         Uninitialize_Fix obj = new Uninitialize_Fix();
//         obj.display();
//     }
// }
