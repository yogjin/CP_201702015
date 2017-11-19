
public class YJ_HW02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		double determinent;
		double x1,x2;
		a =-1.0; 
		b =0.0; 
		c =-2.0;

		System.out.println("a="+ a + " b="+ b + " c=" + c );
		determinent = b*b - 4.0*a*c;
		x1 = (-b + Math.sqrt(determinent)) / (2.0*a);
		x2 = (-b - Math.sqrt(determinent)) / (2.0*a);
		System.out.println("The solution is either " + x1 + " or " + x2);

	}

}
 
