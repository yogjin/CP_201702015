
public class HW05_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n = 1;
		while (n <= 180) {
		double x = (double) n * (3.141592 / 180.0) ;
		double y = Math.sin(x) ;
		System.out.println("Sine" + n + "����" + y + "�Դϴ�." );
		n = n+1;
	}
	}
}
