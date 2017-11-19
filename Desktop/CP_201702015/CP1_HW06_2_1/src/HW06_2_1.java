
public class HW06_2_1 {

	private static void printAsterisk (double degree) {
		double n = 0;
		double radian = degree * ( 3.141592 / 180 );
		double sineValue = Math.sin(radian);
		int numberOfAsterisks = (int) ((sineValue * 40.0) + 0.5) ;
		while ( numberOfAsterisks > n ) {
		System.out.print("*");
		n = n + 1;
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int degree = 1;
		
		int n= 180;
		
		while ( n > degree ) {
			System.out.println(" ");
			if( degree < 10 ) {
				System.out.print("sine(00" + degree + ")µµ:");
			}
			else if( degree < 100 ) {
				System.out.print("sine(0" + degree + ")µµ:");
			}
			else {
				System.out.print("sine(" + degree + ")µµ:");
			}
		
			printAsterisk ( degree );
			degree = degree + 5;
		}
	
	}

}
