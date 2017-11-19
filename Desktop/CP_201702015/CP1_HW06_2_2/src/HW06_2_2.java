
public class HW06_2_2 {
	
	private static double mySine(double x) {
		double currentTerm = x;
		double xSquare = x*x;
		int n = 2;
		
		double sineValue = currentTerm;
		
		while (Math.abs(currentTerm) >= 0.000001) {
			//nextTerm을 계산
			currentTerm = -currentTerm * (xSquare / (double) (n*(n+1)));
			sineValue = currentTerm + sineValue;
			n = n+2;
			
		}
		return sineValue;
	}

	private static void printAsterisk (double a) {
		double n = 0;
		double radian = (double) a * ( 3.141592 / 180 );
		double sineValue = mySine(radian);
		int numberOfAsterisks = (int) ((sineValue * 40.0) + 0.5 ) ;
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
				System.out.print("sine(00" + degree + ")도:");
			}
			else if( degree < 100 ) {
				System.out.print("sine(0" + degree + ")도:");
			}
			else {
				System.out.print("sine(" + degree + ")도:");
			}
			printAsterisk ( degree );
			degree = degree + 5;
		}
	
	}

}
