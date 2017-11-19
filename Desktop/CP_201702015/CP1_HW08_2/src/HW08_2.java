import java.util.Scanner;

public class HW08_2 {

	public static Scanner aScanner = new Scanner(System.in);
	
	private static final int MAX_SIZE = 100;
	
	private static int inputScore() {
		int score;
		
		System.out.println("점수를 입력하세요 : ");
		score = aScanner.nextInt();
		
		return score;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	System.out.println("성적을 입력받아 출력합니다.");
	
	int score;
	int total = 0;
	int NumberOfStudents = 0;
	int[] scores = new int[MAX_SIZE];
	
	score = inputScore();
	while(score >= 0) {
		if( score > 100 ) {
			System.out.println("오류: 100이 넘어서 정상적인 점수가 아닙니다.");
			
		}
		else {
			scores[NumberOfStudents] = score;
			NumberOfStudents++;
			total = total + score;
			
		}
		score = inputScore();
	}
	double classAverage;
	classAverage = (double) total / (double) NumberOfStudents ;
	System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
	System.out.println("모두"+NumberOfStudents+"명 의 성적이 입력되었습니다.");
	System.out.println("평균은" + classAverage + "입니다.");
	System.out.println("입력된 성적은 다음과 같습니다.");
	 
	int i = 0;
	int NumberOfOverAverage = 0 ;
    while (i < NumberOfStudents)
    {
       System.out.print("[" + i + "] " + scores[i] );
       if(scores[i] >= classAverage) {
    	   System.out.println("(평균 이상입니다.)");
    	   NumberOfOverAverage++;
       }
       else {
    	   System.out.println("(평균 미만입니다.)");
       }
       i ++;
    }

    System.out.println("평균 이상인 학생의 수는 "+ NumberOfOverAverage + "명입니다.");
	
	
	System.out.println("프로그램종료");
	}
}
