package kr.brains072;

public class Triangle extends Polygon {

	//생성자 : 객체 초기화를 다망, sub클래스부터 객체를 생성할 때,
	// super 클래스의 객체(필드,메소드)도 준비가 되어있어야 함.
	public Triangle(int height, int width) {
		super(height, width);
		setName("Triangle");
	}

	@Override
	public int evaluate() { // 메소드선언부 : 사용법 또는 활용법
		int area = (getHeight()* getWidth() /2) ;
		return area;
	}
	
			
}
