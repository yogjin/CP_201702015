import java.util.Scanner;

public class HW09_2 {

	private static Scanner aScanner = new Scanner(System.in);
	
	private static final int MAX_SIZE = 100;
	
	private static int inputScore() {
		int score;
		
		System.out.println("점수를 입력하시오: ");
		score = aScanner.nextInt();
		
		return score;
		
	}
	private static double averageScore( int score[] , int aSize ) {
		double average = 0;
		int i=0;
		int sum = 0;
		while ( i < aSize ) {
			sum = sum + score[i];
			i++;
			average = sum / (double) aSize ;
		}
		
		return average;
	}
		
		private static int findMax(int[] score , int aSize) {
			int i = 1;
			int max = score[0];
				while( i < aSize ) {
					if ( max < score[i]) {
						max = score[i];
					}
					i++;
				}
				return max;
		}
		private static int findLow( int[] score , int aSize ) {
			int i = 1;
			int low = score[0];
				while( i < aSize ) {
					if ( low > score[i]) {
						low = score[i];
					}
					i++;
				}
				return low;
	}
		private static void selectionSort ( int score[], int aSize) {
			int lastLoc = aSize -1 ;
			int minLoc ;
			int minValue ;
			int curLoc;
			int selectionLoc = 0 ;
			while (selectionLoc < lastLoc) {
			minLoc = selectionLoc ;
			minValue = score[minLoc] ;
			curLoc = selectionLoc +1 ;
				while (curLoc <= lastLoc) {
						if (score[curLoc] > minValue) {
								minLoc = curLoc ;
									minValue = score[minLoc] ;
						}
							curLoc++ ;
				}
			// elements[selectionLoc]과 elements[minLoc]의 값 맞바꾸기
			// minValue = elements[minLoc] ; 이미 실행되어서 다시 할 필요가 없음
			score[minLoc] = score[selectionLoc] ;
			score[selectionLoc] = minValue ;
			selectionLoc++ ;
			}

		}
	public static void main(String[] args) {
		
		
		int score;
		int total = 0;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudent = 0;
		double score_Average;
		int maxScore = 0;
		int lowScore = 0;
		score = inputScore();
		
			
		while ( score >= 0 ) {
			if ( score > 100 ) {
				System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				total = total + score;
				scores[numberOfStudent] = score;
				numberOfStudent++;
				
			}
			score = inputScore();
			maxScore = findMax(scores,numberOfStudent);
			lowScore = findLow(scores,numberOfStudent);
		}
			score_Average = averageScore( scores , numberOfStudent );
			
			System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
			
			System.out.println("모두 " + numberOfStudent + "명의 성적이 입력되었습니다.");
			System.out.println("평균은"+ score_Average);
			
			System.out.println("입력된 성적은 다음과 같습니다.");
			
			int i = 0;
			int overAverageStudent = 0;

			while ( i < numberOfStudent ) {
			
				System.out.print("["+i+"]" + scores[i] );
				
				if (scores[i] >= score_Average) {
					System.out.println(" (평균 이상입니다.)");
					overAverageStudent++;
				}
				else {
					System.out.println(" (평균 미만입니다.)");
				}
				i++;
			}
			
			System.out.println("평균 이상인 학생의 수는"+ overAverageStudent + "입니다.");
			System.out.println("최고점은"+ maxScore + "입니다.");
			System.out.println("최저점은"+ lowScore + "입니다.");
			
			System.out.println("성적순은 다음과 같습니다.");
			selectionSort(scores , numberOfStudent);
			int k = 0;
				while ( k < numberOfStudent) {
					System.out.println("["+k+"]" +scores[k]);
					k++;
				}
			System.out.println("프로그램을 終了합니다.");
				
		}
		
		
		
		
		

}


