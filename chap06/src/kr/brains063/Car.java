package kr.brains063;

public class Car {
	// 1개의 정적 필드, 1개의 인스턴스 멤버 필드 , 4개의 인스턴스 메소드
	// public static final : 상수 변수 정의, 값을 전체 대문자
	public static final String MODEL = "가스차";
	private int gas;
	
	//Setter/Getter Method;
	void setGas(String gas) {
		String digit = gas.substring(0, gas.length()-1);
		int igas = Integer.parseInt(digit); //parseInt() 숫자 문자열을 숫자로 바꿔주는 메소드.
		if(igas > 60) {
			System.out.println((igas-60) + "가스를 주입할 수 없습니다.");
			igas = 60;
		}
		this.gas = igas;		
	}
	int getGas() {
		return gas;
	}
	boolean isLeftGas() { 
		boolean isLeft =  true;
		if(gas == 0) {
			System.out.print("gas가 없습니다 \n");
			isLeft = false;
		}
		else 
			System.out.print("gas가 있습니다 \n");
			return isLeft;
		}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. gas 잔량 ("+ gas + ")");
				gas -= 1;
				}
				else {
					System.out.println("멈춥니다. gas 잔량 ("+ gas + ")");
					//break;
				}
			}
		}
		
	}


