import java.util.Scanner;

public class HW06_1_2 {
	
	

	private static int inputNumber () {
		
		Scanner aScanner = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ� >>");
		System.out.println("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ�");
		int number = aScanner.nextInt();
		
		return number;
		
	}
	
	private static void printAsterisks( int givenN ) {
		
		int a = 0;
		while (givenN > a) {
			System.out.print("*");
			a++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int number;
		
		number = inputNumber();
		
		while (number >= 0) {
		printAsterisks(number);
		number = inputNumber();
		}
		 
		System.out.println(" ");
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ� >>");
		
		
		}
		 
			
	}
	
