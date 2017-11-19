
public class HW04_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenN;
		int count;
		int sum;
		
		givenN = 5;
		sum = 1;
		count = 1;
		if ( givenN == 0 )
		{
			System.out.println("팩토리얼값은 1 입니다.");
		}
		
		while (count <= givenN) {
			sum = count*sum;
		System.out.println("팩토리얼값은" + sum + "입니다.");
			count = count + 1;
			
								}
	}

}
