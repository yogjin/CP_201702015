import java.util.Scanner;

public class HW04_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("N Factorial ���� ���Ͻ÷��� Y�� �Է��Ͻÿ�..");
		
		char userAnswer = aScanner.next().charAt(0);
		
		
		while ((userAnswer == 'y') || (userAnswer == 'Y')) {
			
			System.out.println("N ���� �Է��Ͻÿ�..");
			int givenN = aScanner.nextInt();
			
				if ( givenN < 0 ) {
					System.out.println("N���� 0���� ���� �� �����ϴ�");
		
				}
				
				else if ( givenN == 0 ) {
					System.out.println("0 Factorial ���� 1 �Դϴ�.");
					
				}
				
				else { 
					int count = 1;
					int sum = 1;
					while( count <= givenN ) {
					sum = count * sum;
					count = count + 1;
					
					System.out.println( givenN + " Factorial ���� " + sum + "�Դϴ�.");
					
					}
				}
				System.out.println("N Factorial ���� ���Ͻ÷��� Y�� �Է��Ͻÿ�..");
				userAnswer = aScanner.next().charAt(0);
				
			
		}
		System.out.println("�ý��� ����.");
		
		aScanner.close();
	}

}
