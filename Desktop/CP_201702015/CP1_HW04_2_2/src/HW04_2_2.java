import java.util.Scanner;

public class HW04_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("Factorial ���� ����Ϸ��� y�� �Է��Ͻÿ�.");
		
		char UserAnswer = aScanner.next().charAt(0);
		
		while ( (UserAnswer == 'y' ) || (UserAnswer == 'Y') )
		{
			System.out.println("N���� �Է����ּ���.");
			int givenN = aScanner.nextInt();
		if ( givenN == 0) {
			System.out.println("0 Factorial ���� 1 �Դϴ�.");
			System.out.println("Factorial ���� ����Ϸ��� y�� �Է��Ͻÿ�.");
			
			UserAnswer = aScanner.next().charAt(0);
		}
		
		else if ( givenN < 0) {
			System.out.println(" N���� 0���� ������ ����� �� �����ϴ�. ");
		}
		else {
			//���丮�� ���κ�
			System.out.println( givenN + " Factorial ���� ����Ϸ��� �մϴ�.");
			 
			System.out.println("�� Factorial ���� ����Ϸ��� y�� �Է��Ͻÿ�.");
	
			UserAnswer = aScanner.next().charAt(0);
		}
		}
		System.out.println("�ý����� �����մϴ�.");
	
		aScanner.close();
	
	
}
}