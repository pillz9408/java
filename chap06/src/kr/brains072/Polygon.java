package kr.brains072;

// 다각형의 넓이를 구하기 위한 클래스를 정의하고 , (객체생성),활용
// Polygon 은 기본 생성자를 만들어주지 않는다.
public abstract class Polygon {
	// 삼각형, 직사각형, 정사각형, 평행사변형, 사다리꼴
	private int height; //세로
	private int width; // 가로
	private int depth; // 적층 : 기둥의 부피
	private int area; // 넓이
	private String name; 
	
	


	public Polygon() { // 기본 생성자
		
	}
	
	public Polygon(int height, int width) {
		this.height = height;
		this.width = width;
	}
	public void setHeight(int h) {
		this.height = h;
	}
	public void setWidth(int w) {
		this.width = w;
	}
	public void setDepth(int d) {
		this.depth = d;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public abstract int evaluate(); // 추상 메소드 : 상속받는 쪽에서 구현.
	
	
	
	
}
