import java.util.Scanner;

public class HW03_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("1 ���� N������ ���� ���մϴ�. N���� �Է��ϼ���.");
		
		int givenN = aScanner.nextInt();
		int count = 1;
		int sum = 0;

		while( count <= givenN) {
			sum = sum + count;
			System.out.println("1���� N������ ���� " + sum + "�Դϴ�.");
			count = count + 1;
			
			
			aScanner.close(); 
	}
		
	}
}
