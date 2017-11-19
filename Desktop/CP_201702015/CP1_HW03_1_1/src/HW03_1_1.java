import java.util.Scanner;

public class HW03_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("계수를 순서대로 입력하시오. a는 2차항 b는 1차항 c는 상수항입니다.");
		
		double a = aScanner.nextDouble();
		double b = aScanner.nextDouble();
		double c = aScanner.nextDouble();
		
		double determinent;
		double x1,x2;
		

		System.out.println("a="+ a + " b="+ b + " c=" + c );
		determinent = b*b - 4.0*a*c;
		x1 = (-b + Math.sqrt(determinent)) / (2.0*a);
		x2 = (-b - Math.sqrt(determinent)) / (2.0*a);
		System.out.println("The solution is either " + x1 + " or " + x2);

		aScanner.close(); 
	}

}
