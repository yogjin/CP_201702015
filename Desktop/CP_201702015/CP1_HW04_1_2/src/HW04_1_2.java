import java.util.Scanner;

public class HW04_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("������������ ����Ϸ��� Y�� �Է��Ͻÿ�.");
		
		char userAnswer = aScanner.next().charAt(0);
		
		if ((userAnswer == 'y') || (userAnswer == 'Y')) {
			System.out.println("����� ������� �Է��Ͻÿ�.");
			int a = aScanner.nextInt();
			int b = aScanner.nextInt();
			int c = aScanner.nextInt();
					
			if ( a == 0 ) {
				System.out.println("�������� ����� 0�� �� �� �����ϴ�.");
			}
			
			else {
				double determinent = b*b - 4*a*c;
				double x1;
				double x2;
				
				x1 = - b + Math.sqrt(determinent) / 2*a ;
				x2 = - b - Math.sqrt(determinent) / 2*a ;
				if ( determinent < 0) {
					System.out.println("�Ǳ��� �����ϴ�. ����Դϴ�.");
					System.out.println("������������ ����Ϸ��� Y�� �Է��Ͻÿ�.");
					
					userAnswer = aScanner.next().charAt(0);
				}
				else {
				System.out.println("�ش�" + x1 + " �Ǵ� " + x2 + "�Դϴ�.");
				System.out.println("������������ ����Ϸ��� Y�� �Է��Ͻÿ�.");
				
				userAnswer = aScanner.next().charAt(0);
				}
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");
		
		aScanner.close();
	}
	
}

