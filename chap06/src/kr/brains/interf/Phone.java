package kr.brains.interf;

public interface Phone {
	// 인터페이스에 선언된 모든 필드는 정적 최종이다. 즉, 상수 변수이다.
	String PHONE_NUMBER = "010-1111-2222"; //(public static final ) 이 생략됨
	void call(String phoneNumber); // abstract 가 생략됨
	void receive();
	// default 메소드 사용가능 : 
	
}
