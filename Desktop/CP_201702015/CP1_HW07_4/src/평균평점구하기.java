import java.util.Scanner;

public class ����������ϱ� {

	private static Scanner aScanner = new Scanner(System.in);
	
	private static int inputScore() {
		int score;
		
		System.out.println("������ �Է��ϼ��� : ");
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
	private static double calcGPA (double sumOf3Points) {
		
		double gpa = sumOf3Points / 3.0;
		return gpa;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("����,����,��ǻ�� �� ������ ������ ���ʴ�� �Է��մϴ�.");
		int score_Korean = inputScore();
		int score_English = inputScore();
		int score_Computer= inputScore();
		char grade_Korean;
		char grade_English;
		char grade_Computer;
		double point_Korean;
		double point_English;
		double point_Computer;
		double gpa;
		int numberOfOver4 = 0;
		int numberOfOver3 = 0;
		int numberOfOver2 = 0;
		int numberOfOver1 = 0;
		int numberOfUnder1 = 0;
		
		
		while ( score_Korean >= 0 || score_English >= 0 || score_Computer >= 0  ) {
			if ( score_Korean > 100 ||  score_English > 100 ||  score_Computer > 100) {
				System.out.println(" �Էµ� ���� �� 100���� ���� ���� �ֽ��ϴ�. �ٽ� �Է��ϼ���. ");
			}
			else {
				//�������� �Է���. ������ ������ ���Ѵ�.
				grade_Korean = score2grade(score_Korean);
				grade_English = score2grade(score_English);
				grade_Computer = score2grade(score_Computer);
				point_Korean = grade2point(grade_Korean);
				point_English = grade2point(grade_English);
				point_Computer = grade2point(grade_Computer);
				gpa = calcGPA( point_Korean + point_English + point_Computer );
					
				if ( gpa >= 4.0 ) {
					numberOfOver4++;
				}
				else if ( gpa >= 3.0) {
					numberOfOver3++;
				}
				else if ( gpa >= 2.0) {
					numberOfOver2++;
				}
				else if ( gpa >= 1.0) {
					numberOfOver1++;
				}
				else {
					numberOfUnder1++;
				}
				
				System.out.println("[��   ��]����: " + score_Korean + "����: " + grade_Korean + "����: " + point_Korean );
				System.out.println("[��   ��]����: " + score_English + "����: " + grade_English + "����: " + point_English );
				System.out.println("[��ǻ��]����: " + score_Computer + "����: " + grade_Computer + "����: " + point_Computer );
				System.out.println("�� �л��� ��� ������:" + gpa + " �Դϴ�.");
			}
			System.out.println("����,����,��ǻ�� �� ������ ������ ���ʴ�� �Է��մϴ�.");
			score_Korean = inputScore();
			score_English = inputScore();
		    score_Computer= inputScore();
		    
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		
		System.out.println("��� ������ 4.0 �̻��� �л��� " + numberOfOver4 + "�� �Դϴ�.");
		System.out.println("��� ������ 3.0 �̻��� �л��� " + numberOfOver3 + "�� �Դϴ�.");
		System.out.println("��� ������ 2.0 �̻��� �л��� " + numberOfOver2 + "�� �Դϴ�.");
		System.out.println("��� ������ 1.0 �̻��� �л��� " + numberOfOver1 + "�� �Դϴ�.");
		System.out.println("��� ������ 1.0 �̸��� �л��� " + numberOfUnder1 + "�� �Դϴ�.");
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
		
	}

}
