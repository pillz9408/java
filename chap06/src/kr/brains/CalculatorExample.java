package kr.brains;

public class CalculatorExample {
     public static void main(String[] args) {
    	 //기본 생성자(매개변수가 없는) 를 호출하여 객체를 생성 (Calculator)
	 // calculator : 객체 참조 변수
	 Calculator calculator = new Calculator(); 
	 System.out.println(calculator.calc());
	 // GC (GarbageCollection) 동작으로 메모리에서 향후 쓰지않는 객체를 제거
	 calculator = new Calculator(23, "*", 40);
	 System.out.println(calculator.calc());
	 
	 ModCalculator modRef = new ModCalculator(0, null, 0);
	 System.out.println(modRef.calc());
     }
}
