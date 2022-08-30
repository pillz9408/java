package project_1;

public class ex_02 {

	public static void main(String[] args) {
		// 중첩 for문을 이용해 주어진 배열의 전체항목의 합과 평균값을 구해보세요.
		// 201p ex5
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int count =0;
		int sum = 0;
		double avg = 0.0;
		
		for(int x=0; x<array.length; x++)
		{
			for(int y=0; y<array[x].length; y++) 
			{
				sum += array[x][y];
				count++; //array 배열에 선언된 데이터 갯수
			}
		}
		  avg = (double) sum / count;
		System.out.println("sum : "+ sum);
		System.out.println("avg : " + avg);

	}

}
