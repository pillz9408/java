package kr.brains.project;

import java.util.ArrayList;

public class WebtoonExample {
	public static ArrayList<Book> alBook = new ArrayList<>();
	public static void main(String[] args) {
		//등록
		Book w1 = new Webtoon("i-1234","나혼자만 레벨업","판타지","추공");
		Book w2 = new Webtoon("i-1235","미생","드라마","윤태호");
		Book w3 = new Webtoon("i-1236","기생수","호러","모름");
		Book w4 = new Webtoon("i-1237","이말년 시리즈","개그","이말년");
		
		alBook.add(w1);
		alBook.add(w2);
		alBook.add(w3);
		alBook.add(w4);
		alBook.add(new Webtoon ("i-1238","신과 함께","판타지","주호민"));
		
		//출력
		for(Book b : alBook)
			System.out.println(b.toString()); //Object : toString, equals, hashCode
		
	}

}
