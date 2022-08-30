package project_1;

public class ex_01 {

	public static void main(String[] args) {
		// 배열을 이용한 5개 정수의 평균 구하기.
		
		int[] Scores = {83, 90, 87, 94, 88};
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += Scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 5.0;
		System.out.println("평균 : " + avg);
		
         
		
		
		
	}

}