package project_1;

public class Arrays_06 {

	public static void main(String[] args) {
		// for문을 이용해서 주어진 배열의 항목에서 최대값을 구하시오.
		
	   int max = 0;
	   int[] array = { 9, 5, 3, 8, 2 };
	  
	   
	   for(int i=0; i<array.length; i++) {
		   if(array[i]>max) {
			   max = array[i];
		   }
	   }
	   System.out.println("max: " + max);
	   
		

	}

}
