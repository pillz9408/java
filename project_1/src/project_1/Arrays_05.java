package project_1;

public class Arrays_05 {

	public static void main(String[] args) {
		// 명령어 라인 입력
	if(args.length != 2) {
		System.out.println("값의 수가 부족합니다.");
		System.exit(0); // 강제 탈출 코드
	}
	
	String strNum1 = args[0]; // 10
	String strNum2 = args[1]; // 20
	
	int num1 = Integer.parseInt(strNum1); // int <-- sting 강제로 바꿈
	int num2 = Integer.parseInt(strNum2);
	
	int result = num1 + num2;
	System.out.println(num1 + " + " + num2 + " = " + result);
	

	}

}
