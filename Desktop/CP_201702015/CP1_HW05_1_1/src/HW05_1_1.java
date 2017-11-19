import java.util.Scanner;

public class HW05_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner aScanner = new Scanner(System.in);
		
	System.out.println("학생들의 성적을 입력해주세요.");
	
	int score = aScanner.nextInt();
	 
	
	while ( score >= 0 ) {
		
		if ( score > 100 ) {
			System.out.println("최대점수 100점을 넘었습니다.");
			System.out.println("학생들의 성적을 입력해주세요.");
			
			score = aScanner.nextInt();
			 
		}				
		else {
			System.out.println("학생들의 성적을 입력해주세요.");
			score = aScanner.nextInt();
		}
	}
	
	System.out.println("시스템 종료.");
	
	
			
		
			
			}
		}
		

	


