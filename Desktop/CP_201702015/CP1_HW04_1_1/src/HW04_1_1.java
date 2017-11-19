import java.util.Scanner;

public class HW04_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner aScanner = new Scanner(System.in);
		
		
		System.out.println("이차방정식을 계산할까여? 계산할거면 Y눌러요");
		
		char userAnswer = aScanner.next().charAt(0);
		
		while (( userAnswer == 'Y' ) || ( userAnswer == 'y' ))
		{
		System.out.println("이차방정식을 풀겠습니다.");
		
		System.out.println("이차방정식을 계산할까여? 계산할거면 Y눌러요");
	
		userAnswer = aScanner.next().charAt(0);
		}
		
		System.out.println("시스템종료");
	
		aScanner.close();
	}

}
