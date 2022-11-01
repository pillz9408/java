package test.buy;
/** <pre>
 * 심부름>
CU에 가서 아이스크림 '누가바'를 사오는 것
MVC
꼬마한테 심부름을 시키는 프로그램 개발
결과:'누가바'
초기값: 1000원
1~7단계로 설명
*데이터의 흐름(시작~끝)
 * (우리집)
1. 꼬마야 왼손! (컴퓨터에게 변수 선언)
1-1 left
2. 왼손에 1000원을 쥐어준다. (변수에 값 대입)
2-1 left = 1000;
3. 아이스크림 사와라 (연산, 혹은 함수호출 같은 명령, 입력값 필요)
(거리)
3-1 buyIcecream();
4. CU발견하고 찾아간다.
4-1 CU;
(CU안)
5. 점원에게 왼손의 돈을 주고 "누가바" 주세요 라고 요청 (명령, 입력값 필요)
5-1 CU.getIcecream(); 
6. 점원은 냉동고에서 아이스크림을 꺼내 온다.
6-1 "누가바" ;
7. 점원은 꼬마에게 "누가바"를 준다. (입력받은 왼손 데이터에 대한 댓가로 주는 것)
7-1 return "누가바";
8. 꼬마는 점원이 준 아이스크림을 오른손에 받는다.
8-1 right = 7;
(거리 -> 집으로 이동)
9. 꼬마는 오른손을 내밀어 아이스크림을 준다.
9-1 right;
javaDoc 주석
 * @author user
 * </pre>
 */
public class TestBuy {

	public static void main(String[] args) {
//		Object hi = "Hello";
//		System.out.println(hi);
		Object left;
		left = 1000;

		Object right = buyIcecream(left);
		System.out.println(right);	
	}

	private static Object buyIcecream(Object left) {
		CU cu = new CU();
		String right = cu.getIcecream(left); 
		return right;
		
	}

}
