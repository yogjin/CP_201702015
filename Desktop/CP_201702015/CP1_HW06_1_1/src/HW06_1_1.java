import java.util.Scanner;

public class HW06_1_1 {

	private static void printAsterisk ( int n ) {
		
		int a = 0;
		while ( n > a ) {
			System.out.print("*");
			a = a + 1;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ� >>");
		System.out.println("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ�");
		Scanner aScanner = new Scanner(System.in);
		
		int givenN = aScanner.nextInt();
		
		while ( givenN >= 0 ) { 
			printAsterisk( givenN );
			System.out.println(" ");
			System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ� >>");
			System.out.println("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ�");
			givenN = aScanner.nextInt();
		}
		 
			System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ� >>");
	
			aScanner.close();
	}
	
}
