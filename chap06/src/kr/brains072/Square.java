package kr.brains072;

public class Square extends Polygon {
	public Square(int length) {
		super(length, length );
		setName("Square");
	}

	@Override // annotation : 컴파일러에게 컴파일을 잘 할 수 있도록 정보를 제공.
	public int evaluate() { 
		// 재정의 : 메소드 이름, 매개변수 갯수, 타입 동일
		// 컴파일러가 묵시적으로 super 클래스의 해당 생성자를 호출
		// super(height,width);
		int area = (getHeight()* getWidth());
		return area;
	}

}
