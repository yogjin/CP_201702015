import java.util.Scanner;

public class �������������κ�ȯ�ϱ� {

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
				System.out.println("����:" + aScore  + ", ����: " + grade );		
			}
			aScore = inputScore();
		}
	System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");

	System.out.println("A ��" + numberOfA + "���Դϴ�.");
	System.out.println("B ��" + numberOfB + "���Դϴ�.");
	System.out.println("C ��" + numberOfC + "���Դϴ�.");
	System.out.println("D ��" + numberOfD + "���Դϴ�.");
	System.out.println("F ��" + numberOfF + "���Դϴ�.");
	
	}
	
	
}