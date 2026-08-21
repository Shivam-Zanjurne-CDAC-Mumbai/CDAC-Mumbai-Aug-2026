public class PatternTwo {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            System.out.print('1');
            //1*2
            for(int j = 1; j < i; j++){
                int k = j+1;
                System.out.print("*" + k);
            }
            System.out.println();
        }
    }
}
