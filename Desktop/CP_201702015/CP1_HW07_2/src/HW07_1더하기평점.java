import java.util.Scanner;

public class HW07_1���ϱ����� {

	private static Scanner aScanner = new Scanner(System.in);
	
	
	private static int inputScore() {
		
		System.out.println("������ �Է��Ͻÿ� : ");
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
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
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
				System.out.println("����:" + aScore  + ", ����: " + grade + ", ����:" + point );		
			}
			aScore = inputScore();
		}
	System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");

	System.out.println("A ��" + numberOfA + "���Դϴ�.");
	System.out.println("B ��" + numberOfB + "���Դϴ�.");
	System.out.println("C ��" + numberOfC + "���Դϴ�.");
	System.out.println("D ��" + numberOfD + "���Դϴ�.");
	System.out.println("F ��" + numberOfF + "���Դϴ�.");
	
	System.out.println("���α׷��� �����մϴ�.");
	
	}
	
	
}