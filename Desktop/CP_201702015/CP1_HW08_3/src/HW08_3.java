import java.util.Scanner;

public class HW08_3 {

	public static Scanner aScanner = new Scanner(System.in);
	
	private static final int MAX_SIZE = 100;
	
	private static int inputScore() {
		int score;
		
		score = aScanner.nextInt();
		
		return score;
	}
	public static double ScoreAverage(int a , int b) {
		double Average;
		Average = (double) (a + b)/2;
		return Average;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	System.out.println("������ �Է¹޾� ����մϴ�.");
	System.out.println("�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� :");
	
	int score_Korean;
	int score_Computer;
	double score_Average;
	int total = 0;
	int NumberOfStudents = 0;
	int[] scoresKorean = new int[MAX_SIZE];
	int[] scoresComputer = new int[MAX_SIZE];
	double[] studentAverages = new double[MAX_SIZE];
	score_Korean = inputScore();
	score_Computer = inputScore();
	score_Average = ScoreAverage(score_Korean,score_Computer);
	while(score_Korean >= 0) {
		if( score_Korean > 100 || score_Computer > 100) {
			System.out.println("����: 100�� �Ѿ �������� ������ �ƴմϴ�.");
			
		}
		else {
			scoresKorean[NumberOfStudents] = score_Korean;
			scoresComputer[NumberOfStudents] = score_Computer;
			studentAverages[NumberOfStudents] = score_Average;
			NumberOfStudents++;
			total = total + score_Korean + score_Computer;
			
			
		}
		System.out.println("�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� :");
		score_Korean = inputScore();
		score_Computer = inputScore();
		score_Average = ScoreAverage(score_Korean,score_Computer);
		
	}
	double classAverage;
	classAverage = (double) total / (double) (2*NumberOfStudents) ;
	System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
	System.out.println("���"+NumberOfStudents+"�� �� ������ �ԷµǾ����ϴ�.");
	
	System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
	 
	int i = 0;
	int NumberOfOverAverage = 0 ;
    while (i < NumberOfStudents)
    {
       System.out.println("[" + i + "] " + scoresKorean[i] + " "+scoresComputer[i] + "(���"+studentAverages[i]+")");
       if(studentAverages[i] >= classAverage) {
    	
    	   NumberOfOverAverage++;
       }
       i ++;
    }
    System.out.println("�б� �����"+ classAverage + "�Դϴ�.");
    System.out.println("��� �̻��� �л��� ���� "+ NumberOfOverAverage + "���Դϴ�.");
	
	
	System.out.println("���α׷��� �����մϴ�.");
	}
}
