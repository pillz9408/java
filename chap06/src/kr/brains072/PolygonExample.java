package kr.brains072;

import java.util.ArrayList;

public class PolygonExample {
	
	public static void main(String[] args) {
		//매개변수에 배열을 사용하면 매개변수 갯수를 가변적으로 사용할 수 있음.
		
		ArrayList<Polygon> arrPoly = new ArrayList<>();
		// Array = 정적 배열(사이즈를 잡으면 더이상 추가 못함) - 고정사이즈
		// ArrayList = 동적 배열 (사이즈가 넘치면 자바가 알아서 일정량만큼 늘려준다.) -리사이즈가능
		// 성능 : Array > ArrayList ,  편의성 : ArrayList > Array
		Triangle triangle = new Triangle(50,80);
		Square square = new Square(80);
		Rectangle rectangle = new Rectangle(50,80);
		Trapezoid trapezoid = new Trapezoid(50, 80, 60);
		
		
		
		System.out.println("triangle 넓이 : " + triangle.evaluate());
		System.out.println("square 넓이 : " + square.evaluate());
		System.out.println("rectangle 넓이 : " + rectangle.evaluate());
		System.out.println("trapezoid 넓이 : " + trapezoid.evaluate());
		
		
		Polygon poly = new Triangle(30, 80);
		// Polygon 형의 poly라는 참조변수를 사용.
		// Tri,SQ,Re.... 상속받음, 공통적인 특징을 가짐.
		//System.out.println("넓이는 : " + poly.evaluate());
		arrPoly.add(poly);
		poly = new Square(90);
		//System.out.println("넓이는 : " + poly.evaluate());
		arrPoly.add(poly);
		poly = new Rectangle(40,60);
		//System.out.println("넓이는 : " + poly.evaluate());
		arrPoly.add(poly);
		poly = new Trapezoid (50, 60, 80);
		
		for(Polygon p : arrPoly) {
			whoIs(p); // 매개변수의 유형에 따라 다른게 동작: (매개변수)다형성
		}
		String sRef ="Hello";
		Integer iRef = Integer.valueOf(100);
		Integer iRef2 = 30;
		iRef = iRef2;
		
		Object o = (Object) iRef;
		if(o instanceof String) { // o 가 어느 클래스에서 왔는지
		sRef = (String) o;
		sRef.substring(3);
		}
		
	}
	public static void whoIs(Polygon p) {
			if(p instanceof Triangle) // p가 Triangle에서 왔다면 True; 
				System.out.println(p.getName() + "넓이는 :" + p.evaluate());
			else if(p instanceof Square)
				System.out.println(p.getName()+ "넓이는 :" + p.evaluate());
			else if(p instanceof Rectangle)
				System.out.println(p.getName()+ "넓이는 :" + p.evaluate());
			else if(p instanceof Trapezoid)
				System.out.println(p.getName()+ "넓이는 :" + p.evaluate());
			else
				;
		
		}	
		
		
}
	

