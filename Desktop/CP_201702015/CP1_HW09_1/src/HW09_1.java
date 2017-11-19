import java.util.Scanner;

public class HW09_1 {

	private static Scanner aScanner = new Scanner(System.in);
	
	private static final int MAX_SIZE = 100;
	
	private static int inputScore() {
		int score;
		
		System.out.println("������ �Է��Ͻÿ�: ");
		score = aScanner.nextInt();
		
		return score;
		
	}
	private static double averageScore( int score[] , int aSize ) {
		double average = 0;
		int i=0;
		int sum = 0;
		while ( i < aSize ) {
			sum = sum + score[i];
			i++;
			average = sum / (double) aSize ;
		}
		
		return average;
	}
		
		private static int findMax(int[] score , int aSize) {
			int i = 1;
			int max = score[0];
				while( i < aSize ) {
					if ( max < score[i]) {
						max = score[i];
					}
					i++;
				}
				return max;
		}
		private static int findLow( int[] score , int aSize ) {
			int i = 1;
			int low = score[0];
				while( i < aSize ) {
					if ( low > score[i]) {
						low = score[i];
					}
					i++;
				}
				return low;
	}
	public static void main(String[] args) {
		
		
		int score;
		int total = 0;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudent = 0;
		double score_Average;
		int maxScore = 0;
		int lowScore = 0;
		score = inputScore();
		
			
		while ( score >= 0 ) {
			if ( score > 100 ) {
				System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				total = total + score;
				scores[numberOfStudent] = score;
				numberOfStudent++;
				
			}
			score = inputScore();
			maxScore = findMax(scores,numberOfStudent);
			lowScore = findLow(scores,numberOfStudent);
		}
			score_Average = averageScore( scores , numberOfStudent );
			
			System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
			
			System.out.println("��� " + numberOfStudent + "���� ������ �ԷµǾ����ϴ�.");
			System.out.println("�����"+ score_Average);
			
			System.out.println("�Էµ� ������ ������ �����ϴ�.");
			
			int i = 0;
			int overAverageStudent = 0;
			
			while ( i < numberOfStudent ) {
			
				System.out.print("["+i+"]" + scores[i] );
				
				if (scores[i] >= score_Average) {
					System.out.println(" (��� �̻��Դϴ�.)");
					overAverageStudent++;
				}
				else {
					System.out.println(" (��� �̸��Դϴ�.)");
				}
				i++;
			}
			
			System.out.println("��� �̻��� �л��� ����"+ overAverageStudent + "�Դϴ�.");
			System.out.println("�ְ�����"+ maxScore + "�Դϴ�.");
			System.out.println("��������"+ lowScore + "�Դϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
				
		}
		
		
		
		
		

}


