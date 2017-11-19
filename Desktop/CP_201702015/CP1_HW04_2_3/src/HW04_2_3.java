import java.util.Scanner;

public class HW04_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("N Factorial 값을 구하시려면 Y를 입력하시오..");
		
		char userAnswer = aScanner.next().charAt(0);
		
		
		while ((userAnswer == 'y') || (userAnswer == 'Y')) {
			
			System.out.println("N 값을 입력하시오..");
			int givenN = aScanner.nextInt();
			
				if ( givenN < 0 ) {
					System.out.println("N값이 0보다 작을 수 없습니다");
		
				}
				
				else if ( givenN == 0 ) {
					System.out.println("0 Factorial 값은 1 입니다.");
					
				}
				
				else { 
					int count = 1;
					int sum = 1;
					while( count <= givenN ) {
					sum = count * sum;
					count = count + 1;
					
					System.out.println( givenN + " Factorial 값은 " + sum + "입니다.");
					
					}
				}
				System.out.println("N Factorial 값을 구하시려면 Y를 입력하시오..");
				userAnswer = aScanner.next().charAt(0);
				
			
		}
		System.out.println("시스템 종료.");
		
		aScanner.close();
	}

}
