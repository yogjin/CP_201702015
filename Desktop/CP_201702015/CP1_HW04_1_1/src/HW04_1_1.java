import java.util.Scanner;

public class HW04_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aScanner = new Scanner(System.in);
		
		
		System.out.println("������������ ����ұ? ����ҰŸ� Y������");
		
		char userAnswer = aScanner.next().charAt(0);
		
		while (( userAnswer == 'Y' ) || ( userAnswer == 'y' ))
		{
		System.out.println("������������ Ǯ�ڽ��ϴ�.");
		
		System.out.println("������������ ����ұ? ����ҰŸ� Y������");
	
		userAnswer = aScanner.next().charAt(0);
		}
		
		System.out.println("�ý�������");
	
		aScanner.close();
	}

}
