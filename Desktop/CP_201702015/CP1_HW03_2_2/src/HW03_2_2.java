import java.util.Scanner;

public class HW03_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("1 부터 N까지의 합을 구합니다. N값을 입력하세요.");
		
		int givenN = aScanner.nextInt();
		int count = 1;
		int sum = 0;

		while( count <= givenN) {
			sum = sum + count;
			System.out.println("1부터 N까지의 합은 " + sum + "입니다.");
			count = count + 1;
			
			
			aScanner.close(); 
	}
		
	}
}
