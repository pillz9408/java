package project_1;

public class Array_02 {

	public static void main(String[] args) {
		// 값 목록으로 배열 생성
		
		int[] Scores;
		Scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += Scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		
		
		int sum2 = add( new int[] {83, 90, 87 } );
		System.out.println( "총합 : " + sum2 );
		System.out.println();
		
		}
	
	public static int add(int[] Scores){
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += Scores[i];
		}
		return sum;
	}
		

	}

