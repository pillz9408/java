package kr.brains.interf;

public class SmartPhoneExample {
	// 인터페이스를 정의하고, 다중구현(multiple implementation)을 통해 클래스를 정의
	// 정의한 클래스로부터 객체를 생성하고
	// 생성된 객체와 상호작용을 통해 문제를 해결
	
	// Java는 다중 산속은 지원하지 않음, 즉 extends 뒤에 하나만 나타남.
	// interface는 다중구현이 가능함, implements 뒤에 여러개가 나타날 수 있음. 
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call(SmartPhone.PHONE_NUMBER);
		sp.playMusic("금요일 좋아~");
		sp.sendMsg(SmartPhone.PHONE_NUMBER , "아! 힘들다.");
		Timer t = sp; //sp가 참조하는 객체를 Timer 인터페이스를 구현하 구현체(implementation)한 구현체		              
		t.playBeep(); //(SmartPhone)t 묵시적으로 형변환 되어있음.
		((SmartPhone)t).call(SmartPhone.PHONE_NUMBER); // Timer 인터페이스 관점이기에 SmartPhone 관점으로 형변환 해줘야 한다. 
		
		
		
		
		

	}

}
