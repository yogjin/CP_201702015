import java.util.Scanner;

public class HW08_2 {

	public static Scanner aScanner = new Scanner(System.in);
	
	private static final int MAX_SIZE = 100;
	
	private static int inputScore() {
		int score;
		
		System.out.println("������ �Է��ϼ��� : ");
		score = aScanner.nextInt();
		
		return score;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	System.out.println("������ �Է¹޾� ����մϴ�.");
	
	int score;
	int total = 0;
	int NumberOfStudents = 0;
	int[] scores = new int[MAX_SIZE];
	
	score = inputScore();
	while(score >= 0) {
		if( score > 100 ) {
			System.out.println("����: 100�� �Ѿ �������� ������ �ƴմϴ�.");
			
		}
		else {
			scores[NumberOfStudents] = score;
			NumberOfStudents++;
			total = total + score;
			
		}
		score = inputScore();
	}
	double classAverage;
	classAverage = (double) total / (double) NumberOfStudents ;
	System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
	System.out.println("���"+NumberOfStudents+"�� �� ������ �ԷµǾ����ϴ�.");
	System.out.println("�����" + classAverage + "�Դϴ�.");
	System.out.println("�Էµ� ������ ������ �����ϴ�.");
	 
	int i = 0;
	int NumberOfOverAverage = 0 ;
    while (i < NumberOfStudents)
    {
       System.out.print("[" + i + "] " + scores[i] );
       if(scores[i] >= classAverage) {
    	   System.out.println("(��� �̻��Դϴ�.)");
    	   NumberOfOverAverage++;
       }
       else {
    	   System.out.println("(��� �̸��Դϴ�.)");
       }
       i ++;
    }

    System.out.println("��� �̻��� �л��� ���� "+ NumberOfOverAverage + "���Դϴ�.");
	
	
	System.out.println("���α׷�����");
	}
}
