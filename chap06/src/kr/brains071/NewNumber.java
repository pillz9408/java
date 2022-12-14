package kr.brains071;

import java.lang.Number; 

public /*abstract*/ class NewNumber extends Number {
	

	//Number num = new Number(); // 추상 클래스는 객체 생성 불가
	//NewNumber newnum = new NewNumber();
	/*public short shortValue() { // overriding (재정의)
		return -1;
	}
	*/
	private int value;
	
	public NewNumber(int i) {
		value = i;
	}
	public byte byteValue() { // 재정의 = 기존에 있던 메소드를 덮어 씌울수 있다.
		System.out.println("overriding." + super.byteValue()); // super - 부모 객체 호출
		return -1;
	}
	public short shortValue() { // overriding (재정의)
		return (short) (value * 2);
	}
	
	@Override
	public int intValue() { // unimplemented 메소드를 구현.
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	} 
	// 추상클래스를 상속
	// 추상 클래스 : 추상 메소드를 하나 이상 가지고 있는 클래스.
	// 추상 메소드 : abstract 예약어와 메소드 선언(사용법)만을 갖는 메소드
	// 상속 받은 클래스에서 구현해야 함을 명시하는 역할 = 기준, 가이드
	// 상호작용 : 메소드의 선언부가 중요;;? 
	// 클래스 : 모든 메소드가 구현된 상태	
	
	//Number num = new Number(); // 추상 클래스는 객체 생성 불가
		//NewNumber newnum = new NewNumber();
}
