import java.util.Scanner;

public class HW03_1_3 {

	public static void main(String[] args) {
		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("������� ������� �Է���, �������� ����� a, �������� ����� b ������� c.");
		
		double a = aScanner.nextDouble();
		double b = aScanner.nextDouble();
		double c = aScanner.nextDouble();
		
		double determinent;
		double x1;
		double x2;
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		determinent = b*b - 4*a*c;
		
		if ( (a > -0.000000001) && ( a < 0.000000001) )
			System.out.println("�������� ����� 0�̸� ���� ������������ Ǯ������");
		
		else if (determinent < 0)
			System.out.println("�Ǳ��� ���� ����̾�");

		else {
		x1 = (-b + Math.sqrt(determinent)) / (2.0*a);
		x2 = (-b - Math.sqrt(determinent)) / (2.0*a);
		System.out.println("The solution is either " + x1 + " or " + x2);
		
		aScanner.close();

	}

}
}