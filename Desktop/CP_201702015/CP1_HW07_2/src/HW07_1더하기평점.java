import java.util.Scanner;

public class HW07_1더하기평점 {

	private static Scanner aScanner = new Scanner(System.in);
	
	
	private static int inputScore() {
		
		System.out.println("점수를 입력하시오 : ");
		int score;
		score = aScanner.nextInt();
	
		return score;
		
	}
	private static char score2grade(int aScore) {
		
		if ( aScore >= 90 ) {
			return 'A';
		}
		else if ( aScore >= 80 ) {
			return 'B';
		}
		else if ( aScore >= 70 ) {
			return 'C';
		}
		else if ( aScore >= 60 ) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	private static double grade2point(char grade) {
		
		if (grade == 'A') {
			return 4.0;
		}
		else if ( grade == 'B') {
			return 3.0;
		}
		else if ( grade == 'C') {
			return 2.0;
		}
		else if ( grade == 'D') {
			return 1.0;
		}
		else {
			return 0.0;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aScore = inputScore();
		int numberOfA = 0;
		int numberOfB = 0;
		int numberOfC = 0;
		int numberOfD = 0;
		int numberOfF = 0;
		
		while ( aScore >= 0) {
			if ( aScore > 100 ) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				char grade = score2grade(aScore);
					if (grade == 'A'){
						numberOfA = numberOfA + 1;
					}
					else if (grade == 'B'){
						numberOfB = numberOfB + 1;
					}
					else if (grade == 'C'){
						numberOfC = numberOfC + 1;
					}
					else if (grade == 'D') {
						numberOfD = numberOfD + 1;
					}
					else {
						numberOfF = numberOfF + 1;
					}
				double point = grade2point (grade);
				System.out.println("점수:" + aScore  + ", 학점: " + grade + ", 평점:" + point );		
			}
			aScore = inputScore();
		}
	System.out.println("음의 정수가 입력되어 입력을 종료합니다.");

	System.out.println("A 는" + numberOfA + "명입니다.");
	System.out.println("B 는" + numberOfB + "명입니다.");
	System.out.println("C 는" + numberOfC + "명입니다.");
	System.out.println("D 는" + numberOfD + "명입니다.");
	System.out.println("F 는" + numberOfF + "명입니다.");
	
	System.out.println("프로그램을 종료합니다.");
	
	}
	
	
}