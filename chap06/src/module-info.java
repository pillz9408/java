module chap06 {
	requires java.se;
	//java.se 모듈이 필요함을 컴파일러에게 알림.
	// 컴파일 : 소스프로그램 (Source Codes)를 목적프로그램(Object Code (-byte code))로 변역해주는 행위.
	// 컴파일러 : 컴파일을 수행하는 프로그램
	// 링킹 : 목적코드와 라이브러리를 연결하는 행위
	// 정적 링킹 Static Linking (컴파일 직후 링킹하여 실행가능한 파일을 생성)
	// vs 동적 링킹 Dynamic Linking (실행 시점에 링킹을 함) 
	// 프로그램 실행은 해당 목적코드와 라이브러리가 정적 또는 동적으로 링킹되서,
	// 메모리에 적재(loading) 되어 CPU가 명령을 수행 하는 것
}