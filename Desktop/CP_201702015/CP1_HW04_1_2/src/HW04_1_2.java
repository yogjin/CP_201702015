import java.util.Scanner;

public class HW04_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("이차방정식을 계산하려면 Y를 입력하시오.");
		
		char userAnswer = aScanner.next().charAt(0);
		
		if ((userAnswer == 'y') || (userAnswer == 'Y')) {
			System.out.println("계수를 순서대로 입력하시오.");
			int a = aScanner.nextInt();
			int b = aScanner.nextInt();
			int c = aScanner.nextInt();
					
			if ( a == 0 ) {
				System.out.println("이차항의 계수는 0이 될 수 없습니다.");
			}
			
			else {
				double determinent = b*b - 4*a*c;
				double x1;
				double x2;
				
				x1 = - b + Math.sqrt(determinent) / 2*a ;
				x2 = - b - Math.sqrt(determinent) / 2*a ;
				if ( determinent < 0) {
					System.out.println("실근이 없습니다. 허근입니다.");
					System.out.println("이차방정식을 계산하려면 Y를 입력하시오.");
					
					userAnswer = aScanner.next().charAt(0);
				}
				else {
				System.out.println("해는" + x1 + " 또는 " + x2 + "입니다.");
				System.out.println("이차방정식을 계산하려면 Y를 입력하시오.");
				
				userAnswer = aScanner.next().charAt(0);
				}
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		
		aScanner.close();
	}
	
}

