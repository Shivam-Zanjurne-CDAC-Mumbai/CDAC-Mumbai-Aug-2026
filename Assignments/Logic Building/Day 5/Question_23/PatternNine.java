public class PatternNine {
    public static void main(String[] args) {
        /* 
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
        */
       //row value + 2 = 7
       //row value - 2 = 5
       //3
       //1
       //1, 3, 5, 7, 9
       //5 * 2 - 1 = 9
       int rows = 6;
       for (int i = 1; i <= rows; i++){ //rows
        
        for (int j = 1; j <= rows-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= 2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
       
    }
    int rowStarCount = (rows*2-1)-2; //minus 2 cuz the first row of new triangle starts with 2 less stars than the last row of first triangle
    
    for(int i = 1; i <= rows-1; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(" ");
        }
        for(int k = 1; k <= rowStarCount; k++){
            System.out.print("*");
        }
        rowStarCount-=2;
        System.out.println();
    }




    }
}
