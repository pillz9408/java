package kr.brains002;

public class Gugudan {
	private int col = 9;
	private int row = 9;
	int dan = 2; //인스턴스 변수 : 구구단의 시작을 지정하는 수
	
	public Gugudan(int dan) {
	
	}
	
	// 지정된 단만 출력
	public static void printOne(int dan) {
		for(int i = 1; i <= 9; i++) { 
			//인스턴스 변수는 객체가 생성되면서 올라가는데, static 메소드는 객체가 생성되기 전부터 사용가능하기때문에 
			//static 메소드/필드에선 인스턴스 필드 사용불가
			//int k =10; 지역변수(local variable) k는 선언된 이곳부터
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}//지역변수 k는 중괄호 안에서만 사용가능하고 이후 사라짐.
	}
	//2~9 단을 출력
	public static void printAll() {
		for(int i=2; i <= 9; i++) {
			printOne(i);
		}
	}
	//지정한 단부터 9단까치 출력
	public void printFrom(int dan) {
		for(int i= dan; i <= row; i++)
			printOne(i);
	}
		
}

