import java.util.Scanner;

public class HW08_3 {

	public static Scanner aScanner = new Scanner(System.in);
	
	private static final int MAX_SIZE = 100;
	
	private static int inputScore() {
		int score;
		
		score = aScanner.nextInt();
		
		return score;
	}
	public static double ScoreAverage(int a , int b) {
		double Average;
		Average = (double) (a + b)/2;
		return Average;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	System.out.println("성적을 입력받아 출력합니다.");
	System.out.println("두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 :");
	
	int score_Korean;
	int score_Computer;
	double score_Average;
	int total = 0;
	int NumberOfStudents = 0;
	int[] scoresKorean = new int[MAX_SIZE];
	int[] scoresComputer = new int[MAX_SIZE];
	double[] studentAverages = new double[MAX_SIZE];
	score_Korean = inputScore();
	score_Computer = inputScore();
	score_Average = ScoreAverage(score_Korean,score_Computer);
	while(score_Korean >= 0) {
		if( score_Korean > 100 || score_Computer > 100) {
			System.out.println("오류: 100이 넘어서 정상적인 점수가 아닙니다.");
			
		}
		else {
			scoresKorean[NumberOfStudents] = score_Korean;
			scoresComputer[NumberOfStudents] = score_Computer;
			studentAverages[NumberOfStudents] = score_Average;
			NumberOfStudents++;
			total = total + score_Korean + score_Computer;
			
			
		}
		System.out.println("두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 :");
		score_Korean = inputScore();
		score_Computer = inputScore();
		score_Average = ScoreAverage(score_Korean,score_Computer);
		
	}
	double classAverage;
	classAverage = (double) total / (double) (2*NumberOfStudents) ;
	System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
	System.out.println("모두"+NumberOfStudents+"명 의 성적이 입력되었습니다.");
	
	System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
	 
	int i = 0;
	int NumberOfOverAverage = 0 ;
    while (i < NumberOfStudents)
    {
       System.out.println("[" + i + "] " + scoresKorean[i] + " "+scoresComputer[i] + "(평균"+studentAverages[i]+")");
       if(studentAverages[i] >= classAverage) {
    	
    	   NumberOfOverAverage++;
       }
       i ++;
    }
    System.out.println("학급 평균은"+ classAverage + "입니다.");
    System.out.println("평균 이상인 학생의 수는 "+ NumberOfOverAverage + "명입니다.");
	
	
	System.out.println("프로그램을 종료합니다.");
	}
}
