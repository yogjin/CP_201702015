import java.util.Scanner;

public class HW06_1_2 {
	
	

	private static int inputNumber () {
		
		Scanner aScanner = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다 >>");
		System.out.println("양의 정수 (종료하려면 음수)를 입력하시오");
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
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 종료합니다 >>");
		
		
		}
		 
			
	}
	
