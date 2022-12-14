package kr.brains.api;

public class APIExample {

	public static void main(String[] args) {
		Overriding over = new Overriding();
		
		
		String s1 = new String("비즈니스 분석가");
		String s2 = new String("비즈니스 분석가");
		if(s1 == s2) // 두 참조변수가 참조하는 객체는 같은가?
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		over.testEquals(s1,s2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		Object o1 = new Object();
		Object o2 = new Object();
		if(o1 == o2)
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		over.testEquals(o1, o2);
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
		Integer i1 = Integer.valueOf(100);
		Integer i2 = Integer.valueOf(100);
		if(i1 == i2) // 두 참조변수가 참조하는 객체는 같은가?
			System.out.println("true");
		else
			System.out.println("false");
		
		
		
		// Shift 연산은 비트단위 연산
		// 128을 비트패턴  1000 0000 오른쪽으로 세번 밀기
		//              0010 0000
		// 128 / 8  : 한번 오른쪽으로 밀때마다 2로 나누는 효과.
		System.out.println(Integer.toBinaryString(128));
		System.out.println(128 >> 3);
		System.out.println(128 << 3);
		
		Integer intRef = new Integer(100);
		try { // 예외처리문장
			Integer intRef2 = Integer.valueOf("100L");
			System.out.println(("예외 발생 시 실행 안됨"));
		} catch(NumberFormatException nfe) { //checked exception 발생된 예외를 처리해주는 곳
			System.out.println(("예외발생 처리 :" ) + nfe.getMessage());
		} finally { 
			System.out.println("예외 발생 여부와 관계없이 실행되어야 하는 문장들.");
		}
		Integer intRef3 = 100; // autoboxing (Integer)생략을 컴파일러가 알아서 써준다.
		System.out.println("에외처리 후 " + intRef3);
		
	}

}
