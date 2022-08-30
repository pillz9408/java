package kr.brains063;

//import java.util.ArrayList;
//import java.util.*;  - > java.util.에 있는 모든 클래스를 사용 가능하게 한다.

public class CarExample {
	String programName = "CarExample";
	
	public static void main(String[] args) {
		CarExample ce = new CarExample();
		System.out.println(ce.programName);
		
		// Car.model = "전기차"; final 을 선언해 더이상 model 수정 불가
		System.out.println("현재 모델 : " + Car.MODEL);
		System.out.println("가장 큰 int값: " + Integer.MAX_VALUE );
		/*int i = 1_000_000_000;
		int j = 10000000;
		*/
		
		Car car = new Car(); // 객체생성		
		// car.model = "가스차"; // 인스턴스 변수 값 배정 (assignment)
		car.setGas("30L"); //setter 를 이용한 값 배정 - 검증된 값을 배정 . 
		System.out.println("현재 가스 : " + car.getGas());
		
		car.run();
			
		/*String str = "현대자동차";
		System.out.println(str.charAt(3));
		int i = 166;
		//Integer :int 기본형을 효과적으로 조작하기 위해 정의한 클래스
		//Wrapper Class : 기본 자료형을 효과적으로 조작하기 위해 정의한 클래스.
		System.out.println(Integer.toHexString(i));
		//Integer.toHexString() - 정수를 16진수로 바꿔줌.
		//Integer.toBinarySting() - 정수를 2진수로
		 
		 */
	}

}
