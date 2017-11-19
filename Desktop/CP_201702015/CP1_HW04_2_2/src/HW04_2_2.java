import java.util.Scanner;

public class HW04_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("Factorial 값을 계산하려면 y를 입력하시오.");
		
		char UserAnswer = aScanner.next().charAt(0);
		
		while ( (UserAnswer == 'y' ) || (UserAnswer == 'Y') )
		{
			System.out.println("N값을 입력해주세요.");
			int givenN = aScanner.nextInt();
		if ( givenN == 0) {
			System.out.println("0 Factorial 값은 1 입니다.");
			System.out.println("Factorial 값을 계산하려면 y를 입력하시오.");
			
			UserAnswer = aScanner.next().charAt(0);
		}
		
		else if ( givenN < 0) {
			System.out.println(" N값이 0보다 작으면 계산할 수 없습니다. ");
		}
		else {
			//팩토리얼값 계산부분
			System.out.println( givenN + " Factorial 값을 계산하려고 합니다.");
			 
			System.out.println("또 Factorial 값을 계산하려면 y를 입력하시오.");
	
			UserAnswer = aScanner.next().charAt(0);
		}
		}
		System.out.println("시스템을 종료합니다.");
	
		aScanner.close();
	
	
}
}