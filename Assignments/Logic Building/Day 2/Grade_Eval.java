public class Grade_Eval {
    public static void main(String[] args) {
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
}
