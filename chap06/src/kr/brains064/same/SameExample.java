package kr.brains064.same;

import kr.brains064.other.Other;
import kr.brains064.other.Protected;

//같은 패키지에 존재하는 클래스는 import 없이도 사용 가눙.

public class SameExample extends Protected {

	public static void main(String[] args) {
		
		Same same = new Same();
		System.out.println("같은 패키지 Same Package");
		//System.out.println(same.privateField);
		System.out.println(same.defaultField);
		System.out.println(same.protectedField);
		System.out.println(same.publicField);
		
		SameExample se = new SameExample();
		System.out.println("상속관계 Inhertance Relationship");
		//System.out.println(se.privateField);
		//System.out.println(se.defaultField);
		System.out.println(se.protectedField); // protected가 붙은 메소드까지 접근가능
		System.out.println(se.publicField);
		
		Other other = new Other();
		System.out.println("아무 관계 없을때 Other Package");
		//System.out.println(other.privateField);
		//System.out.println(other.defaultField);
		//System.out.println(other.protectedField);
		//protected 가 되려면 상속관계가 되야 함.
		System.out.println(other.publicField );
		
		
		
	}

}
