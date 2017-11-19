import java.util.Scanner;

public class HW03_1_3 {

	public static void main(String[] args) {
		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("계수값을 순서대로 입력해, 이차항의 계수는 a, 일차항의 계수는 b 상수항은 c.");
		
		double a = aScanner.nextDouble();
		double b = aScanner.nextDouble();
		double c = aScanner.nextDouble();
		
		double determinent;
		double x1;
		double x2;
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		determinent = b*b - 4*a*c;
		
		if ( (a > -0.000000001) && ( a < 0.000000001) )
			System.out.println("이차항의 계수가 0이면 내가 이차방정식을 풀수없어");
		
		else if (determinent < 0)
			System.out.println("실근이 없어 허근이야");

		else {
		x1 = (-b + Math.sqrt(determinent)) / (2.0*a);
		x2 = (-b - Math.sqrt(determinent)) / (2.0*a);
		System.out.println("The solution is either " + x1 + " or " + x2);
		
		aScanner.close();

	}

}
}