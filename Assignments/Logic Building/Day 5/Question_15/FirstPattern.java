public class FirstPattern {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++){
            System.out.print(i);
            for (int j = 1; j < i; j++){
                System.out.print("*" + i);
            }
            System.out.println();
        }

        for (int i = rows; i >= 1; i--){
            System.out.print(i);
            for (int j = 1; j < i; j++){
                System.out.print("*" + i);
            }
            System.out.println();
        }

    }
}
