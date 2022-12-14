package kr.brains072;

public class Trapezoid extends Polygon {
	//Trapezoid  = 사다리꼴
	
	private int upper;
	
	public Trapezoid(int height, int width, int upper) {
		super(height,width); // 수퍼 클래스의 생성자를 호출 Width = 아랫변
		this.upper = upper;
		setName("Trapdezoid");
	}
	public int getUpper() {
		return upper;
	}

	public int evaluate() {
		int area = (getWidth() + getUpper()) * getHeight()/2;
		return area;
	}
}
