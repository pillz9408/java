package kr.brains002;

// Gugudan 클래스가 import 되었거나 같은 패키지에 있는 경우(향후 import 되었거나)
public class SubGugudan extends Gugudan {
	// direction : up, down - up dan -> 9단 , down 2단 -> dan
	// 메소드 중첩 (overloding) Gugudan클래스에서의 printFrom과 메소드 중첩
	public SubGugudan(int dan) {
		super(dan); // this([매게변수목록]) "현재 클래스의 생성자를 호출
		//super([매개변수목로]) : 부모클래서(수퍼클래스) 의 생성자를 호출
		
	}
	
	public void printFrom(int dan, String direction) {
		System.out.println("메소드 overloading");
		
	}
	

}

// overloading(중첩 - 메소드 이름 같고, 매개변수 타입, 갯수가 다름) vs.  
// overriding(재정의 - 메소드 이름 같고, 매개변수 타입과 갯수까지 같음. -> 이전의 메소드를 덮어씌운다.)