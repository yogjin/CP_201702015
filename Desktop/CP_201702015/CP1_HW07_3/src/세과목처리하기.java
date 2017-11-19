import java.util.Scanner;

public class 세과목처리하기 {

	private static Scanner aScanner = new Scanner(System.in);
	
	private static int inputScore() {
		int score;
		
		System.out.println("점수를 입력하세요 : ");
		score = aScanner.nextInt();
		
		return score;
	}
	private static char score2grade( int score ) {
		
		if ( score >= 90 ) {
			return 'A';
		}
		else if (score >= 80 ) {
			return 'B';
		}
		else if (score >= 70 ) {
			return 'C';
		}
		else if (score >= 60 ) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	private static double grade2point( char grade ) {
		
		if ( grade == 'A') {
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
		
		System.out.println("국어,영어,컴퓨터 세 과목의 점수를 차례대로 입력합니다.");
		int score_Korean = inputScore();
		int score_English = inputScore();
		int score_Computer= inputScore();
		char grade_Korean;
		char grade_English;
		char grade_Computer;
		double point_Korean;
		double point_English;
		double point_Computer;
		
		
		while ( score_Korean >= 0 || score_English >= 0 || score_Computer >= 0  ) {
			if ( score_Korean > 100 ||  score_English > 100 ||  score_Computer > 100) {
				System.out.println(" 입력된 점수 중 100점이 넘은 것이 있습니다. 다시 입력하세요. ");
			}
			else {
				//오류없이 입력함. 학점과 평점을 정한다.
				grade_Korean = score2grade(score_Korean);
				grade_English = score2grade(score_English);
				grade_Computer = score2grade(score_Computer);
				point_Korean = grade2point(grade_Korean);
				point_English = grade2point(grade_English);
				point_Computer = grade2point(grade_Computer);
				
				System.out.println("[국   어]점수: " + score_Korean + "학점: " + grade_Korean + "평점: " + point_Korean );
				System.out.println("[영   어]점수: " + score_English + "학점: " + grade_English + "평점: " + point_English );
				System.out.println("[컴퓨터]점수: " + score_Computer + "학점: " + grade_Computer + "평점: " + point_Computer );
			}
			System.out.println("국어,영어,컴퓨터 세 과목의 점수를 차례대로 입력합니다.");
			score_Korean = inputScore();
			score_English = inputScore();
		    score_Computer= inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		
		
		System.out.println("프로그램을 종료합니다.");
		
		
		
	}

}
