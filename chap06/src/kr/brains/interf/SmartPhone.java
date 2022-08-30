package kr.brains.interf;

// 다중구현
public class SmartPhone implements CameraPhone,Phone, Timer, Messenger {
	//private String phoneNumber;
	@Override
	public String toString() {
		return CameraPhone.PHONE_NUMBER +"스마트폰입니다.";
	}
	
	@Override
	public void call(String PHONE_NUMBER) {
		System.out.println(PHONE_NUMBER + "에 전화를 겁니다.");
		// TODO Auto-generated method stub		
	}
	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("전화를 받습니다.");
	}
	@Override
	public void sendMsg(String PHONE_NUMBER, String msg) {
		// TODO Auto-generated method stub
		System.out.printf("[%s]로 %s메시지 전송 \n", PHONE_NUMBER, msg); //printf : 포멧화된 객채 출력
	}
	@Override
	public void receiveMsg() {
		// TODO Auto-generated method stub
		System.out.println("메시지가 도착했습니다.");
	}

	@Override
	public void playBeep() {
		// TODO Auto-generated method stub
		System.out.println("알람 : 비프음 재생.");
	}

	@Override
	public void playMusic(String title) {
		// TODO Auto-generated method stub
		System.out.printf("알람 :%s 음악재생.", title);
	}
	@Override
	public void takeaPicture() {
		System.out.println("찰칵");
		
	}

}
