package kr.brains071;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayListExt<String> ale = new ArrayListExt<String>();
		
		Integer i = (Integer) 100; // i 는 Integer 클래스형 변수 ( 형변환) -> 자바 업그레이드로 형변환을 안해줘도 가능해짐
		// implicit type conversion (묵시적 형변환) : 오토박싱 - 기본형을 wrapper 클래스로 바꿔주는것/ 반대= 오토언박싱
		int j = 50;
		System.out.println(Integer.toBinaryString(i)); //10진수를 2진수로 변환해주는 코드.
		
		
		ale.add("고객"); //index0 에 저장
		ale.add("경험"); // "" = new String("") 사용빈도가 높아 좀더 간편한 방법으로 초기화 가능하게 해준다.
		ale.add("데이터를");
		ale.add("활용한");
		ale.add("데이터");
		ale.add("비즈니스");
		ale.add("분석가 과정");
		ale.printHello();
		ale.add(); //add(T) add() 중첩(overloading)
		System.out.println(ale.lastIndexOf("데이터"));
		// for문 : 반복횟수가 정해진 경우 사용, 순차 접근 가능, 제어변수에 따른 접근 
		for(int k=0; k< ale.size(); k+=2) 
			System.out.print(ale.get(k) + " " );
		// for each Statement : collection 객체의 순차접근
		System.out.println(" ");
		for(String s : ale)
			System.out.print(s + " ");
		
		
		
		
	}
}
