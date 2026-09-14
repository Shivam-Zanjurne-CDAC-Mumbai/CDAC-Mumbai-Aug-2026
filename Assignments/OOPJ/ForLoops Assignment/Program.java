
public class Program {

	public static void main(String[] args) {
		//Question 1
		System.out.println("Odd Numbers 1 to 1000");
		for(int num = 1; num <= 1000; num++) {
			if(num % 2 != 0) {
				System.out.print(num + " ");
			}
		}
		
		//Question 2
		System.out.println("Even Numbers 1 to 1000");
		for(int num = 1; num <= 1000; num++) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
		
		//Question 3
		System.out.println("Seventh Number 1 to 200");
		for(int num = 1; num <= 200; num++) {
			if(num % 7 == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		//Question 4
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Question 5
		for(int row = 5; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		//Question 6
		int num = 1;
		for(int row = 1; row <= 4; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		
		System.out.println();
		//Question 7
		for(int row = 1; row <= 6; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		//Question 8
		for(int row = 6; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
	}

}
