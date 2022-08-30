package kr.brains002;

import kr.brains.ModCalculator;

public class GugudanExample {
	public static void main(String[] args) {
		// 클래스의 새엉자를 호출하여 객체를 생성하고, gugudan 참조변수에 할당
		// 참조 변수도 참조하는 클래스와 같은 유형 (또는 상위클래스형)
		Gugudan gugudan = new Gugudan(0);
		gugudan.printOne(3); // 객체는 없지만 , Gugudan에서 printOne을 static메소드로 만들어 주었기에 실행가능
		//gugudan.prinFrom() = 객체를 생성(new객체) 하지 않으면 실행 불가능 
		gugudan.printAll();
		//gugudan.printFrom(7);
		ModCalculator nc = new ModCalculator(10, "*" ,20);
		
		SubGugudan subRef = new SubGugudan(2);
		subRef.printOne(7);
		subRef.printFrom(5);
		subRef.printFrom(5, "down");
		
	}

}
