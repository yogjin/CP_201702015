import java.util.Scanner;

public class HW05_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner aScanner = new Scanner(System.in);
		
	System.out.println("�л����� ������ �Է����ּ���.");
	
	int score = aScanner.nextInt();
	 
	
	while ( score >= 0 ) {
		
		if ( score > 100 ) {
			System.out.println("�ִ����� 100���� �Ѿ����ϴ�.");
			System.out.println("�л����� ������ �Է����ּ���.");
			
			score = aScanner.nextInt();
			 
		}				
		else {
			System.out.println("�л����� ������ �Է����ּ���.");
			score = aScanner.nextInt();
		}
	}
	
	System.out.println("�ý��� ����.");
	
	
			
		
			
			}
		}
		

	


