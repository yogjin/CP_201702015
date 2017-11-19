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
		
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다 >>");
		System.out.println("양의 정수 (종료하려면 음수)를 입력하시오");
		Scanner aScanner = new Scanner(System.in);
		
		int givenN = aScanner.nextInt();
		
		while ( givenN >= 0 ) { 
			printAsterisk( givenN );
			System.out.println(" ");
			System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다 >>");
			System.out.println("양의 정수 (종료하려면 음수)를 입력하시오");
			givenN = aScanner.nextInt();
		}
		 
			System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 종료합니다 >>");
	
			aScanner.close();
	}
	
}
