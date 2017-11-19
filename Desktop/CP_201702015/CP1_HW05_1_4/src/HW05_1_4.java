import java.util.Scanner;

public class HW05_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner aScanner = new Scanner(System.in);
		
		System.out.println("학생들의 성적을 입력해주세요.");
		
		int score = aScanner.nextInt();
		int sumOfscores = 0;
		int howManypeople = 0;
		double average;
		
		int counta = 0;
		int countb = 0;
		int countc = 0;
		int countd = 0;
		int countf = 0;
		
		while ( score >= 0 ) {
			
			if ( score > 100 ) {
				System.out.println("최대점수 100점을 넘었습니다.");
				System.out.println("학생들의 성적을 입력해주세요.");
				
				score = aScanner.nextInt();
				 
			}				
			
	
			else if (score >= 90 && score <= 100) {
				System.out.println("점수는" + score + "학점은 A" );
					counta = counta + 1;
					
				}
			else if (score >= 80 && score <= 89) {
				System.out.println("점수는" + score + "학점은 B" );
					countb = countb + 1;
					
				}
			else if (score >= 70 && score <= 79) {
				System.out.println("점수는" + score + "학점은 C" );
					countc = countc + 1;
					
				}
			else if (score >= 60 && score <= 69) {
				System.out.println("점수는" + score + "학점은 D" );
					
					countd = countd + 1;
					
				}
			else  {
				System.out.println("점수는" + score + "학점은 F" );
					countf = countf + 1;
					
				}
			sumOfscores = sumOfscores + score;
			howManypeople = howManypeople + 1;
			System.out.println("학생들의 성적을 입력해주세요.");
			score = aScanner.nextInt();
		}
		average = (double) sumOfscores / howManypeople ;
		
		System.out.println("학생수는" + howManypeople + " 명 입니다.");
		System.out.println("평균은 " + average + " 입니다.");
		System.out.println("A는 " + counta + " 명 입니다.");
		System.out.println("B는 " + countb + " 명 입니다.");
		System.out.println("C는 " + countc + " 명 입니다.");
		System.out.println("D는 " + countd + " 명 입니다.");
		System.out.println("F는 " + countf + " 명 입니다.");
		System.out.println("시스템 종료.");
		
		aScanner.close();
	}
}
