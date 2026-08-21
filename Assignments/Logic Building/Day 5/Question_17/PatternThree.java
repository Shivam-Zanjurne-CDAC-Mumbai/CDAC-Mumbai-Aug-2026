public class PatternThree {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= 5; i++){
            if (i == 1) {
                System.out.println('1');
                continue;
            }
            for(int j = 1; j <= 2*i-1; j++){
                if (j % 2 != 0)
                    System.out.print(j);
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }    
}
