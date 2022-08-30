package kr.brains072;

public class Rectangle extends Polygon {

	public Rectangle(int height, int width) {
		super(height, width);
		setName("Rectangle");
	}
	public int evaluate() { 
		// 재정의 : 메소드 이름, 매개변수 갯수, 타입 동일
		int area = (getHeight()* getWidth());
		return area;
	}

}
