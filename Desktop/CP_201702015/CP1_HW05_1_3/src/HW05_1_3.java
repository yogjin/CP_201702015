import java.util.Scanner;

public class HW05_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("�л����� ������ �Է����ּ���.");
		
		int score = aScanner.nextInt();
		int sumOfscores = 0;
		int howManypeople = 0;
		double average;
		
	
		while ( score >= 0 ) {
			
			if ( score > 100 ) {
				System.out.println("�ִ����� 100���� �Ѿ����ϴ�.");
				System.out.println("�л����� ������ �Է����ּ���.");
				
				score = aScanner.nextInt();
				 
			}				
			
	
			else if (score >= 90 && score <= 100) {
					
				System.out.println("������" + score + "������ A" );
					sumOfscores = sumOfscores + score;
					howManypeople = howManypeople + 1;
					System.out.println("�л����� ������ �Է����ּ���.");
					score = aScanner.nextInt();
				}
			else if (score >= 80 && score <= 89) {
				
				System.out.println("������" + score + "������ B" );
					sumOfscores = sumOfscores + score;
					howManypeople = howManypeople + 1;
					System.out.println("�л����� ������ �Է����ּ���.");
					score = aScanner.nextInt();
				}
			else if (score >= 70 && score <= 79) {
					
				System.out.println("������" + score + "������ C" );
					sumOfscores = sumOfscores + score;
					howManypeople = howManypeople + 1;
					System.out.println("�л����� ������ �Է����ּ���.");
					score = aScanner.nextInt();
				}
			else if (score >= 60 && score <= 69) {
					
				System.out.println("������" + score + "������ D" );
					sumOfscores = sumOfscores + score;
					howManypeople = howManypeople + 1;
					System.out.println("�л����� ������ �Է����ּ���.");
					score = aScanner.nextInt();
				}
			else  {
				System.out.println("������" + score + "������ F" );
					sumOfscores = sumOfscores + score;
					howManypeople = howManypeople + 1;
					System.out.println("�л����� ������ �Է����ּ���.");
					score = aScanner.nextInt();
				}
					
		}
		average = (double) sumOfscores / howManypeople ;
		
		System.out.println("�л�����" + howManypeople + " �� �Դϴ�.");
		System.out.println("����� " + average + " �Դϴ�.");
		
		System.out.println("�ý��� ����.");
		
		aScanner.close();
	}
}
