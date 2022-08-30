package project_1;

public class Arrays_07 {

	public static void main(String[] args) {
		// 다차원 배열 2차원 배열 -초기값 입력 
        int[][] javaScores = {{88, 95, 80}, {92, 96, 81}};
        //{ 88, 95, 80}
        //{ 92, 96, 81}
        int sum = 0;
        for(int x=0; x<javaScores.length; x++) {
        	for(int y=0; y<javaScores[x].length; y++) {
        	System.out.println("javaScore["+x+")["+y+"]=" 
        			+javaScores[x][y]);
        	 sum += javaScores[x][y]; //누적 합
        	  }
             System.out.println("sum : " + sum);
             
        
        	}
        
        
	}
	}


