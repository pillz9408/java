package kr.brains;

// 하나의 파일에는 public class 가 하나만 존재함
// 파일 이름은 public class가 있는 경우 public class 이름임
// public class 가 없는 경우 이름은 선택 가능함
// class의 이름은 대문자로 시작한다.
// 생성자는 class 이름과 같고, 반환 유형이 없다.

public class Calculator { // Calculator 라는 클래스 이름 
	// 10 + 20 ; 10, 20피연산자 , +연산자
	// access modifier : 접근 수정자, 접근 식별자 
	// public(누구나), protected(같은 패키지 에 있지 않아도 상속관계에 있으면 사용), 
	// default(기본 -아무것도 쓰지 않음. 같은 패키지에 있는 클래스만 사용하게), 
	// private (나혼자)

	private int opreand1;
	private int opreand2;
	private String operator;

	//consturctor : 객체 초기화
	public Calculator() { //기본(default) 생성자
		this(10, "+", 20); //this() = 클래스 내 객체 호출
	}
	public Calculator(int o1, String op, int o2) {
		//this. = 인스턴스 변수 호출
		this.opreand1 = o1;
		this.operator = op;
		this.opreand2 = o2;
	}
	// custom method
	// int: 반환 유형, 리턴 타입 - 메소드 처리 후 반환하는 값의 유형
	public int calc() {
		int result = 0; //지역변수
		if(operator.equals("+"))
			result = opreand1 + opreand2; // operand1.. : 인스턴스 변수= 객체가 존재할때 계속 유효한 변수
		else if(operator.equals("-"))
			result = opreand1 - opreand2;
		else if(operator.equals("*"))
			result = opreand1 * opreand2;
		else if(operator.equals("/"))
			result = opreand1 / opreand2;
		return result;
				
		
	}
	
}
