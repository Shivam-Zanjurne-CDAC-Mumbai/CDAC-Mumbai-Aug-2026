public class PatternSeven {
    public static void main(String[] args) {
        int rows = 5;
        int val = 1;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }        
    }
}
