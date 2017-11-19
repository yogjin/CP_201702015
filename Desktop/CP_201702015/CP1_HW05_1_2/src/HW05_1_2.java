import java.util.Scanner;

public class HW05_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("학생들의 성적을 입력해주세요.");
		
		int score = aScanner.nextInt();
		int sumOfscores = 0;
		int howManypeople = 0;
		double average;
		while ( score >= 0 ) {
			
			if ( score > 100 ) {
				System.out.println("최대점수 100점을 넘었습니다.");
				System.out.println("학생들의 성적을 입력해주세요.");
				
				score = aScanner.nextInt();
				 
			}				
			else {
				System.out.println("학생들의 성적을 입력해주세요.");
				sumOfscores = sumOfscores + score;
				howManypeople = howManypeople + 1;
				score = aScanner.nextInt();
				
			}
			
		}
		average = (double) sumOfscores / howManypeople ;
		
		System.out.println("학생수는" + howManypeople + " 명 입니다.");
		System.out.println("평균은 " + average + " 입니다.");
		
		System.out.println("시스템 종료.");
		
		aScanner.close();
	}
}



