import java.util.Scanner;

public class HW05_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("�л����� ������ �Է����ּ���.");
		
		int score = aScanner.nextInt();
		int sumOfscores = 0;
		int howManypeople = 0;
		double average;
		
		int counta = 0;
		int countb = 0;
		int countc = 0;
		int countd = 0;
		int countf = 0;
		
		while ( score >= 0 ) {
			
			if ( score > 100 ) {
				System.out.println("�ִ����� 100���� �Ѿ����ϴ�.");
				System.out.println("�л����� ������ �Է����ּ���.");
				
				score = aScanner.nextInt();
				 
			}				
			
	
			else if (score >= 90 && score <= 100) {
				System.out.println("������" + score + "������ A" );
					counta = counta + 1;
					
				}
			else if (score >= 80 && score <= 89) {
				System.out.println("������" + score + "������ B" );
					countb = countb + 1;
					
				}
			else if (score >= 70 && score <= 79) {
				System.out.println("������" + score + "������ C" );
					countc = countc + 1;
					
				}
			else if (score >= 60 && score <= 69) {
				System.out.println("������" + score + "������ D" );
					
					countd = countd + 1;
					
				}
			else  {
				System.out.println("������" + score + "������ F" );
					countf = countf + 1;
					
				}
			sumOfscores = sumOfscores + score;
			howManypeople = howManypeople + 1;
			System.out.println("�л����� ������ �Է����ּ���.");
			score = aScanner.nextInt();
		}
		average = (double) sumOfscores / howManypeople ;
		
		System.out.println("�л�����" + howManypeople + " �� �Դϴ�.");
		System.out.println("����� " + average + " �Դϴ�.");
		System.out.println("A�� " + counta + " �� �Դϴ�.");
		System.out.println("B�� " + countb + " �� �Դϴ�.");
		System.out.println("C�� " + countc + " �� �Դϴ�.");
		System.out.println("D�� " + countd + " �� �Դϴ�.");
		System.out.println("F�� " + countf + " �� �Դϴ�.");
		System.out.println("�ý��� ����.");
		
		aScanner.close();
	}
}
